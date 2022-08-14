package dercs.loader.processor;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import dercs.loader.behavior.InteractionCompiler;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.processor.base.AbstractModelProcessor;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.UMLPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BehaviorExtractor extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("BehaviorExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        List<Interaction> umlInteractions = resource().getAllModelElementsOfType(UMLPackage.Literals.INTERACTION);
        for (Interaction interaction :umlInteractions) {
            if (isIgnored(interaction)) {
                continue;
            }

            handleInteraction(interaction);
        }
    }

    private void handleInteraction(Interaction interaction) throws DercsLoaderException {
        LOGGER.info("Extracting behavior from interaction '{}'.", interaction.getName());
        InteractionCompiler compiler = new InteractionCompiler(inProgressModel(), interaction);
        compiler.compile();
    }

    /**
     * Checks whether a UML interaction should be ignored for class creation.
     * @return {@code true} if the calss should be ignored, {@code false} otherwise
     */
    private boolean isIgnored(Interaction interaction) {
        // ignore JPDD classes by JPDD stereotype on package
        if (getAppliedStereotype(interaction, AspectsModelingPackage.Literals.JPDD) != null) {
            return true;
        } else if (interaction.getName().startsWith("JPDD")){
            LOGGER.warn("Loading '{}' as behavior, even though it's package starts with 'JPDD'. Did you forget to add the JPDD stereotype to the interaction?", interaction.getQualifiedName());
        }

        return false;
    }

    @Override
    public String getName() {
        return "BehaviorExtractor";
    }
}
