/***************************************************************************************
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Copyright Contributors to the DERCS-EMF Project.
 * 
 ****************************************************************************************/
package dercs.loader.processor.base;

import dercs.Model;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.WrappedUmlResource;
import dercs.loader.wrapper.InProgressDercsModel;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;

import java.util.List;

/**
 * A Model Processor is responsible for creating or modifying elements
 * in the model, possibly based on the UML resource.
 *
 * Each Processor should handle a separate kind of element if possible.
 */
public abstract class AbstractModelProcessor implements IModelProcessor {
    private InProgressDercsModel dercsModel;
    private WrappedUmlResource umlResource;

    public AbstractModelProcessor() {

    }

    /**
     * Gets the DERCS model to modify.
     * @return the DERCS model
     */
    protected Model model() {
        return dercsModel.getModel();
    }

    /**
     * Gets the {@link InProgressDercsModel} wrapper around the DERCS model.
     * @return the {@link InProgressDercsModel} wrapper
     */
    protected InProgressDercsModel inProgressModel() {
        return dercsModel;
    }

    /**
     * Gets the UML resource the model is based on.
     * @return the UML resource
     */
    protected WrappedUmlResource resource() {
        return this.umlResource;
    }

    @Override
    public final void apply(InProgressDercsModel dercsModel, WrappedUmlResource umlResource) throws DercsLoaderException {
        this.umlResource = umlResource;
        this.dercsModel = dercsModel;

        run();
    }

    @Override
    public abstract String getName();

    /**
     * Run the actual processing logic.
     * This needs to be overwritten by subclasses.
     *
     * The resource and model can be accessed through the helper methods
     * {@link AbstractModelProcessor#model()}, {@link AbstractModelProcessor#resource()} and {@link AbstractModelProcessor#inProgressModel()}
     */
    protected abstract void run() throws DercsLoaderException;

    /**
     * Forwards to {@link WrappedUmlResource#getAppliedStereotype(Element, EClassifier)}
     * <p>
     * This is provided purely for convenience, because stereotypes need to be accessed often.
     * @param element the element to check
     * @param stereotypeType the classifier of the stereotype to test for
     * @return the applied stereotype object, or {@code null} if none exists
     */
    protected <T> T getAppliedStereotype(Element element, EClassifier stereotypeType) {
        return this.umlResource.getAppliedStereotype(element, stereotypeType);
    }

    /**
     * Forwards to {@link WrappedUmlResource#getAppliedStereotypes(Element)}
     * <p>
     * This is provided purely for convenience, because stereotypes need to be accessed often.
     * @param element the element to check
     * @return the list of applied stereotypes
     */
    protected List<EObject> getAppliedStereotypes(Element element) {
        return this.umlResource.getAppliedStereotypes(element);
    }
}
