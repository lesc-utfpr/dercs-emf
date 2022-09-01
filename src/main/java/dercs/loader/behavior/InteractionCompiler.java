package dercs.loader.behavior;

import dercs.behavior.Behavior;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.SendMessageAction;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.DuplicatedBehaviorException;
import dercs.loader.exception.ExecutionFlowException;
import dercs.loader.exception.MessageWithoutAssociatedOperationException;
import dercs.loader.util.DercsBuilders;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Constructor;
import dercs.structure.Method;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Stack;

/**
 * Used to transform a UML interaction into the corresponding DERCS behavior and add it to the correct method.
 */
public class InteractionCompiler {
    private final Logger LOGGER = LoggerFactory.getLogger("InteractionCompiler");
    private final InProgressDercsModel model;

    /**
     * The UML interaction that is being read from.
     */
    private final Interaction interaction;

    /**
     * The stack of combined fragments that are currently active.
     * (i.e. the messages that are currently being read are contained within these combined fragments.)
     */
    private final Stack<CombinedFragmentInfo> fragmentStack;

    /**
     * The dynamic method callstack for the current interaction.
     */
    private final Stack<MethodInfo> methodCallstack;

    public InteractionCompiler(InProgressDercsModel model, Interaction interaction) {
        this.model = model;
        this.interaction = interaction;
        this.methodCallstack = new Stack<>();
        this.fragmentStack = new Stack<>();
    }

    /**
     * Create the DERCS behavior from the given UML interaction and add it to the correct DERCS method.
     */
    public void compile() throws DercsLoaderException {
        MessageProcessor messageProcessor = new MessageProcessor(model, this);

        List<InteractionFragment> allFragments = BehaviorHelper.getAllFragmentsOrdered(this.interaction);
        for (InteractionFragment fragment : allFragments) {
            // handle uninteresting receptions and null messages
            if (fragment instanceof MessageOccurrenceSpecification) {
                if (((MessageOccurrenceSpecification) fragment).getMessage() == null) {
                    LOGGER.warn("Skipping message event '{}' with null message.", fragment.getName());
                    continue;
                } else if (((MessageOccurrenceSpecification) fragment).isReceive()) {
                    // skip message receptions
                    continue;
                }
            } else if (fragment instanceof InteractionOperand) {
                continue;
            }

            // if stack is empty, initialize
            if (this.methodCallstack.isEmpty()) {
                if (!(fragment instanceof MessageOccurrenceSpecification)) {
                    throw new RuntimeException("Unknown first fragment type: " + fragment.getClass().getName());
                }

                MethodInfo firstInfo = new MethodInfo(((MessageOccurrenceSpecification) fragment).getMessage());
                this.methodCallstack.push(firstInfo);
                continue;
            }

            // remove fragments whose methods are no longer on the stack
            while (!this.fragmentStack.isEmpty() && !this.methodCallstack.contains(this.fragmentStack.peek().getForMethod())) {
                this.fragmentStack.pop();
            }

            if (!this.fragmentStack.isEmpty() && !this.fragmentStack.peek().isInOperand(fragment)) {
                // left current operand, push next operand if it exists
                CombinedFragmentInfo nextOperand = this.fragmentStack.pop().createNextOperandInfo();
                if (nextOperand != null) {
                    this.fragmentStack.push(nextOperand);
                }
            }

            // push fragment info if entering fragment
            if (fragment instanceof CombinedFragment) {
                this.methodCallstack.peek().markModified();
                CombinedFragmentInfo newCombinedFragment = new CombinedFragmentInfo((CombinedFragment) fragment);
                getCurrentTopmostBehavior().getBehavioralElements().add(newCombinedFragment.getBehavior());
                newCombinedFragment.getBehavior().setOwner(getCurrentTopmostBehavior());
                this.fragmentStack.push(newCombinedFragment);
                continue;
            }


            // at this point we should only encounter normal messages
            if (!(fragment instanceof MessageOccurrenceSpecification)) {
                throw new RuntimeException("Unknown fragment type");
            }
            MessageOccurrenceSpecification messageFragment = (MessageOccurrenceSpecification) fragment;

            // check if message was not sent from current method
            if (this.methodCallstack.peek().getTargetLifeline() != messageFragment.getCovered()) {// insert action in other method
                // go back up the stack to the method where this new message originates
                this.methodCallstack.pop();
                while (!this.methodCallstack.isEmpty() && (this.methodCallstack.peek().getTargetLifeline() != messageFragment.getCovered())) {
                    this.methodCallstack.pop();
                }

                if (this.methodCallstack.isEmpty()) {
                    // if we emptied the stack, something was wrong with the message order
                    throw new ExecutionFlowException(interaction.getName(), fragment.getName());
                }
            }

            // insert action in method behavior
            Action newAction = messageProcessor.addActionFromMessage(messageFragment.getMessage(), getCurrentTopmostBehavior());

            Lifeline source = ((MessageOccurrenceSpecification) messageFragment.getMessage().getSendEvent()).getCovered();
            Lifeline target = ((MessageOccurrenceSpecification) messageFragment.getMessage().getReceiveEvent()).getCovered();
            // if the action calls another method
            if ((newAction instanceof SendMessageAction && source != target)) {
                this.methodCallstack.push(new MethodInfo(messageFragment.getMessage()));
            } else if (messageFragment.getMessage().getMessageSort() == MessageSort.REPLY_LITERAL) {
                // returned from method
                this.methodCallstack.pop();
            }
        }
    }

    /**
     * Gets the behavior currently being added to.
     * This is either the method's behavior or the behavior of a combined fragment
     * @return the behavior currently being added to
     */
    private Behavior getCurrentTopmostBehavior() {
        if (!this.fragmentStack.isEmpty() && this.fragmentStack.peek().getForMethod() == this.methodCallstack.peek()) {
            return this.fragmentStack.peek().getBehavior();
        } else {
            return this.methodCallstack.peek().getBehavior();
        }
    }

    public MethodInfo getCallingMethod() {
        return this.methodCallstack.get(this.methodCallstack.size() - 2);
    }

    public Behavior getCallingBehavior() {
        if (this.methodCallstack.size() <= 1) {
            return null;
        }
        MethodInfo callingMethod = getCallingMethod();
        for (int i = this.fragmentStack.size() - 1; i >= 0; i--) {
            if (this.fragmentStack.get(i).getForMethod() == callingMethod) {
                return this.fragmentStack.get(i).getBehavior();
            }
        }

        return callingMethod.getBehavior();
    }

    public Stack<MethodInfo> getMethodCallstack() {
        return methodCallstack;
    }

    public Stack<CombinedFragmentInfo> getFragmentStack() {
        return fragmentStack;
    }

    /**
     * Describes a method on the method callstack of this interaction.
     */
    public class MethodInfo {
        private final Lifeline sourceLifeline;
        private final Lifeline targetLifeline;
        private final Behavior behavior;

        private final Method method;
        private MethodModificationState modificationState;

        public MethodInfo(Message message) throws DercsLoaderException {
            this.sourceLifeline = ((MessageOccurrenceSpecification) message.getSendEvent()).getCovered();
            this.targetLifeline = ((MessageOccurrenceSpecification) message.getReceiveEvent()).getCovered();

            //TODO: this needs to select the subclass-version of a method if we are on a subclass overriding another method
            this.method = ActionHelper.getMethodFromMessage(InteractionCompiler.this.model, message);
            this.modificationState = MethodModificationState.NEWLY_CREATED_BEHAVIOR;

            if (this.method == null) {
                throw new MessageWithoutAssociatedOperationException(message.getQualifiedName());
            }

            // register additional stereotypes for this method if any exist in the diagram
            List<EObject> stereotypes = InteractionCompiler.this.model.getSourceResource().getAppliedStereotypes(message);
            if (!stereotypes.isEmpty()) {
                InteractionCompiler.this.model.registerMethodBehaviorStereotypes(method, stereotypes);
            }

            if (this.method.getTriggeredBehavior() != null) {
                if (!(this.method instanceof Constructor) && this.method.getTriggeredBehavior().getBehavioralElements().size() > 0) {
                    this.modificationState = MethodModificationState.ALREADY_HAD_BEHAVIOR;
                }
                this.behavior = this.method.getTriggeredBehavior();
            } else {
                this.behavior = DercsBuilders.Behavior.create().build();
                this.method.setTriggeredBehavior(behavior);
                LOGGER.info("Created behavior for method '{}'.", getMethod().getName());
            }
        }

        public void markModified() throws DuplicatedBehaviorException {
            if (this.modificationState == MethodModificationState.ALREADY_HAD_BEHAVIOR) {
                throw new DuplicatedBehaviorException(this.method);
            }
            this.modificationState = MethodModificationState.WAS_MODIFIED;
        }

        public Lifeline getSourceLifeline() {
            return this.sourceLifeline;
        }

        public Lifeline getTargetLifeline() {
            return this.targetLifeline;
        }

        public Behavior getBehavior() {
            return this.behavior;
        }

        public Method getMethod() {
            return this.method;
        }

        public MethodModificationState getModificationState() {
            return this.modificationState;
        }
    }

    public enum MethodModificationState {
        NEWLY_CREATED_BEHAVIOR,
        WAS_MODIFIED,
        ALREADY_HAD_BEHAVIOR
    }

    /**
     * Describes a combined fragment on the fragment stack of this interaction.
     */
    public class CombinedFragmentInfo {
        private final CombinedFragment fragment;
        private final int currentOperandIndex;
        private final Behavior behavior;
        private final MethodInfo forMethod;

        // methods for checking for end of operand and creating next?
        private CombinedFragmentInfo(CombinedFragment fragment, int operandIndex) {
            this.fragment = fragment;
            this.currentOperandIndex = operandIndex;
            this.behavior = DercsBuilders.Behavior.create().build();

            // walk down the method stack to find the first method we are actually working on
            // (not just a foreign method we called)
            MethodInfo currentMethod = null;
            for (int i = methodCallstack.size() - 1; i >= 0; i--) {
                if (methodCallstack.get(i).getModificationState() == MethodModificationState.WAS_MODIFIED) {
                    currentMethod = methodCallstack.get(i);
                    break;
                }
            }
            if (currentMethod != null) {
                this.forMethod = currentMethod;
            } else {
                throw new RuntimeException("Could not find corresponding method for combined fragment.");
            }

            setupBehaviorConditions();
        }

        public CombinedFragmentInfo(CombinedFragment fragment) {
            this(fragment, 0);
        }

        public Behavior getBehavior() {
            return this.behavior;
        }

        public MethodInfo getForMethod() {
            return this.forMethod;
        }

        public CombinedFragmentInfo createNextOperandInfo() {
            if (this.currentOperandIndex + 1 >= fragment.getOperands().size()) {
                return null;
            }
            CombinedFragmentInfo nextInfo = new CombinedFragmentInfo(this.fragment, this.currentOperandIndex + 1);
            this.behavior.setAlternateBehavior(nextInfo.behavior);
            return nextInfo;
        }

        public boolean isInOperand(InteractionFragment fragment) {
            InteractionOperand currentOperand = this.fragment.getOperands().get(this.currentOperandIndex);
            return currentOperand.getFragments().contains(fragment);
        }

        private void setupBehaviorConditions() {
            BehaviorHelper.populateBehaviorConditions(this.behavior, this.fragment.getOperands().get(this.currentOperandIndex), this.fragment.getInteractionOperator());
        }
    }
}
