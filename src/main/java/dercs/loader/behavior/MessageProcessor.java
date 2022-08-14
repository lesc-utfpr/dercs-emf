package dercs.loader.behavior;

import dercs.behavior.Behavior;
import dercs.behavior.actions.Action;
import dercs.loader.behavior.message.*;
import dercs.loader.exception.ClassNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Class;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MessageProcessor {
    private final InProgressDercsModel model;
    private InteractionCompiler compiler;
    private final List<BaseMessageCreator> messageCreators;

    public MessageProcessor(InProgressDercsModel model, InteractionCompiler compiler) {
        this.model = model;
        this.compiler = compiler;
        this.messageCreators = new ArrayList<>();
        Collections.addAll(this.messageCreators,
                new ReplyMessageCreator(),
                new AssignMessageCreator(),
                //new ReturnMessageCreator(),
                //TODO: expression, array element, and state actions
                new SendMessageCreator()
        );

        this.messageCreators.forEach(creator -> creator.setParent(this));
    }

    public Action addActionFromMessage(Message message, Behavior currentBehavior) throws DercsLoaderException {
        Class targetClass = BehaviorHelper.getMessageTargetClass(model, message);

        if (targetClass == null && (message.getMessageSort() != MessageSort.REPLY_LITERAL)) {
            throw new ClassNotFoundException(((MessageOccurrenceSpecification) message.getReceiveEvent()).getCovered().getName());
        }

        // dispatch on action type
        for (BaseMessageCreator creator : this.messageCreators) {
            if (creator.canHandleMessage(message)) {
                return creator.addAction(model, message, currentBehavior);
            }
        }

        throw new RuntimeException();
    }

    public InteractionCompiler getCompiler() {
        return compiler;
    }
}
