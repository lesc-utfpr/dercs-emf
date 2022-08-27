package dercs.loader.behavior;

import dercs.behavior.Behavior;
import dercs.behavior.actions.Action;
import dercs.loader.behavior.action.*;
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
    private final InteractionCompiler compiler;
    private final List<BaseActionCreator> actionCreators;

    public MessageProcessor(InProgressDercsModel model, InteractionCompiler compiler) {
        this.model = model;
        this.compiler = compiler;
        this.actionCreators = new ArrayList<>();
        Collections.addAll(this.actionCreators,
                new ReplyActionCreator(),
                new AssignActionCreator(),
                new ReturnActionCreator(),
                new SetArrayElementCreator(),
                new RemoveArrayElementActionCreator(),
                //TODO: expression, array element, and state actions
                new CreateObjectActionCreator(),
                new DestroyObjectActionCreator(),
                new SendMessageActionCreator()
        );

        this.actionCreators.forEach(creator -> creator.setParent(this));
    }

    public Action addActionFromMessage(Message message, Behavior currentBehavior) throws DercsLoaderException {
        Class targetClass = BehaviorHelper.getMessageTargetClass(model, message);

        if (targetClass == null && (message.getMessageSort() != MessageSort.REPLY_LITERAL)) {
            throw new ClassNotFoundException(((MessageOccurrenceSpecification) message.getReceiveEvent()).getCovered().getName());
        }

        // dispatch on action type
        for (BaseActionCreator creator : this.actionCreators) {
            if (creator.canHandleMessage(message)) {
                return creator.addAction(model, message, currentBehavior);
            }
        }

        throw new RuntimeException("No ActionCreator found for message '" + message.getName() + "'.");
    }

    public InteractionCompiler getCompiler() {
        return compiler;
    }
}
