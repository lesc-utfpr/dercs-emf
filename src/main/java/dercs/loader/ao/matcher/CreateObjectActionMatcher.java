package dercs.loader.ao.matcher;

import dercs.AO.ElementSelectionKind;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.CreateObjectAction;
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.runtime.Object;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.MutualExclusionResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.SchedulableResource;
import org.eclipse.uml2.uml.Message;

public class CreateObjectActionMatcher extends AbstractActionMatcher {
    @Override
    protected boolean actionMatches(InProgressDercsModel model, Action action, Message message) {
        if (!(action instanceof CreateObjectAction)) {
            return false;
        }

        CreateObjectAction createObjectAction = (CreateObjectAction) action;
        Object createdObject = createObjectAction.getRelatedObject();

        // match target object
        String[] parts = getTargetLifelineName().split(":");
        if (!nameMatches(createdObject.getName(), parts[0].trim()) || !nameMatches(createdObject.getInstanceOfClass().getName(), parts[1].trim())) {
            return false;
        }

        // check for active/passive stereotypes
        for (EObject stereotype : getTargetClassStereotypes()) {
            if (stereotype instanceof SchedulableResource && !createdObject.getInstanceOfClass().isActiveClass()) {
                return false;
            } else if (stereotype instanceof MutualExclusionResource && !createdObject.getInstanceOfClass().isPassiveClass()) {
                return false;
            }
        }

        //TODO: check parameters

        return true;
    }

    @Override
    public boolean canHandle(JoinPointDefinition joinPoint) {
        return joinPoint.getSelectionKind() == ElementSelectionKind.ACTION_OBJECT_CREATION;
    }
}
