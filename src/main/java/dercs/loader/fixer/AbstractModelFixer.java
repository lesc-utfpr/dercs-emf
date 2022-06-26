package dercs.loader.fixer;

import dercs.Model;

/**
 * A Model Fixer is responsible for fixing possible inconsistencies in the model
 * after all elements have been extracted from the resource.
 */
public abstract class AbstractModelFixer {
    protected Model dercsModel;

    public AbstractModelFixer() {

    }

    /**
     * Run the fixer on the model.
     * @param dercsModel the model to modify
     */
    public void apply(Model dercsModel) {
        this.dercsModel = dercsModel;

        run();
    }

    /**
     * Run the actual fixing logic.
     * This needs to be overwritten by subclasses.
     *
     * The model can be accessed through the member
     * {@link AbstractModelFixer#dercsModel}
     */
    protected abstract void run();

    /**
     * Returns the name of this fixer
     * @return the name of this fixer
     */
    public abstract String getName();
}
