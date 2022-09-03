package dercs.loader.ao.matcher;

import dercs.AO.ElementSelectionKind;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.ReturnAction;
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.BaseElement;
import org.eclipse.uml2.uml.Message;

public class ReturnActionMatcher extends AbstractActionMatcher {
    @Override
    protected boolean actionMatches(InProgressDercsModel model, Action action, Message message) {
        if (!(action instanceof ReturnAction)) {
            return false;
        }

        ReturnAction returnAction = (ReturnAction) action;

        String matchName = message.getName();
        if (matchName == null || matchName.isEmpty()) {
            matchName = "*";
        }

        BaseElement targetElement = returnAction.isAttributeAssignment() ? returnAction.getDestinationAttribute() : returnAction.getDestinationVariable();

        //TODO: is this the correct behavior?
        return nameMatches(targetElement.getName(), matchName);
    }

    @Override
    public boolean canHandle(JoinPointDefinition joinPoint) {
        return joinPoint.getSelectionKind() == ElementSelectionKind.ACTION_RETURN;
    }
}
