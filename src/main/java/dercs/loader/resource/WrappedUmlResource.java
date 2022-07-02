package dercs.loader.resource;

import dercs.datatypes.DataType;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.util.DatatypeHelper;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Wraps a {@link Resource} to provide easier access to aspects and other information.
 */
public class WrappedUmlResource {
    private final Logger LOGGER = LoggerFactory.getLogger("WrappedUmlResource");
    /**
     * The wrapped resource.
     */
    private final Resource resource;

    /**
     * A cached reference to the resource's main uml model.
     */
    private Model cachedMainModel;

    /**
     * A map from model elements to their applied stereotypes.
     */
    private final Map<Element, List<EObject>> elementToAppliedStereotypesMap;

    // This may be somewhat inefficient compared to using a real Bimap,
    // but since we will never remove elements and likely won't store more than a few thousand objects,
    // I don't think we need to depend on guava just for a Bimap.
    /**
     * A map from UML elements to their corresponding DERCS elements.
     */
    private final Map<Element, EObject> elementPairsUmlToDercs;

    /**
     * A map from DERCS elements to their corresponding UML elements.
     */
    private final Map<EObject, Element> elementPairsDercsToUml;

    /**
     * Create a wrapped resource from the given UML resource.
     * @param resource the UML resource to wrap
     */
    public WrappedUmlResource(Resource resource) {
        this.resource = resource;
        this.cachedMainModel = null;
        this.elementToAppliedStereotypesMap = new HashMap<>();

        this.elementPairsUmlToDercs = new IdentityHashMap<>();
        this.elementPairsDercsToUml = new IdentityHashMap<>();

        this.buildStereotypeMap();
    }

    // === Helpers ===

    /**
     * Returns the main UML model of this resource.
     * This will fail if the resource contains zero or more than one model.
     * @return the main UML model
     */
    public Model getMainModel() {
        // since we likely need to access the model often we cache it,
        // so we don't have to search for it like this every time
        if (cachedMainModel == null) {
            Collection<Object> models = EcoreUtil.getObjectsByType(this.resource.getContents(), UMLPackage.Literals.MODEL);

            if (models.size() != 1) {
                throw new AssertionError("Resource should contain exactly one UML model!");
            }

            this.cachedMainModel = (Model) models.stream().findFirst().get();
        }

        return cachedMainModel;
    }

    /**
     * Finds all children of the main model which have the given type.
     * Recursively checks all subpackages.
     * @param type the type of UML element to find
     * @return a list of found elements
     */
    public <T> List<T> getAllModelElementsOfType(EClassifier type) {
        Stack<Element> packagesToSearch = new Stack<>();
        packagesToSearch.push(this.getMainModel());

        ArrayList<T> foundElements = new ArrayList<>();

        while (!packagesToSearch.empty()) {
            Element currentPackage = packagesToSearch.pop();
            Collection<Package> subPackages = EcoreUtil.getObjectsByType(currentPackage.getOwnedElements(), UMLPackage.Literals.PACKAGE);
            subPackages.forEach(packagesToSearch::push);

            Collection<T> matchingElements = EcoreUtil.getObjectsByType(currentPackage.getOwnedElements(), type);
            foundElements.addAll(matchingElements);
        }

        return foundElements;
    }

    /**
     * Gets the corresponding DERCS datatype for a given UML datatype
     * @param umlType the UML type to convert
     * @return the corresponding DERCS datatype
     */
    public DataType getDercsDatatype(org.eclipse.uml2.uml.Type umlType) throws DercsLoaderException {
        return DatatypeHelper.getDercsDatatype(this, umlType);
    }

    /**
     * Returns the list of the resource's direct content objects.
     * This includes all applied aspects and the actual UML model.
     *
     * @return the direct content objects
     */
    public EList<EObject> getResourceContents() {
        return this.resource.getContents();
    }

    // === Model pairs ===

    /**
     * Register a pairing between a DERCS element and a UML element.
     * This can later be used to look up the corresponding element in the other model.
     * @param dercsElement the element of the DERCS model
     * @param umlElement the element of the UML model
     */
    public void registerDercsUmlElementPair(EObject dercsElement, Element umlElement) {
        Object prevValueDercs = this.elementPairsUmlToDercs.put(umlElement, dercsElement);
        Object prevValueUml = this.elementPairsDercsToUml.put(dercsElement, umlElement);

        if (prevValueDercs != null || prevValueUml != null) {
            LOGGER.warn("Overwrote existing entry in element pairs map!");
        }
    }

    /**
     * Returns the DERCS element's corresponding UML element, if it has been registered.
     * @param dercsElement the DERCS element
     * @return the corresponding UML element if one was registered, otherwise {@code null}
     */
    @SuppressWarnings("unchecked")
    public <T extends Element> T getCorrespondingUmlElement(EObject dercsElement) {
        return (T) this.elementPairsDercsToUml.get(dercsElement);
    }

    /**
     * Returns the UML element's corresponding DERCS element, if it has been registered.
     * @param umlElement the UML element
     * @return the corresponding DERCS element if one was registered, otherwise {@code null}
     */
    @SuppressWarnings("unchecked")
    public <T extends EObject> T getCorrespondingDercsElement(Element umlElement) {
        return (T) this.elementPairsUmlToDercs.get(umlElement);
    }

    // === Stereotypes ===

    /**
     * Tries to retrieve a stereotype of the given type applied to the given element.
     *
     * @param element the element to check
     * @param stereotypeType the classifier of the stereotype to test for
     * @return the applied stereotype object, or {@code null} if none exists
     */
    @SuppressWarnings("unchecked")
    public <T> T getAppliedStereotype(Element element, EClassifier stereotypeType) {
        List<EObject> stereotypes = this.elementToAppliedStereotypesMap.get(element);
        if (stereotypes == null) {
            return null;
        }

        Collection<Object> matches = EcoreUtil.getObjectsByType(stereotypes, stereotypeType);

        if (matches.size() == 0) {
            return null;
        }

        if (matches.size() > 1) {
            throw new AssertionError("More than one stereotype of type [" + stereotypeType.getName() + "] found on element.");
        }

        return (T) matches.stream().findFirst().get();
    }

    /**
     * Tries to retrieve all stereotypes applied to the given element.
     *
     * @param element the element to check
     * @return the list of applied stereotypes
     */
    public List<EObject> getAppliedStereotypes(Element element) {
        List<EObject> stereotypes = this.elementToAppliedStereotypesMap.get(element);
        if (stereotypes == null) {
            return Collections.emptyList();
        } else {
            return stereotypes;
        }
    }

    /**
     * Build a map from model elements to their applied stereotypes.
     */
    private void buildStereotypeMap() {
        for (EObject obj : this.getResourceContents()) {
            if (obj instanceof Model) {
                continue;
            }

            Element baseElement = findStereotypeBaseElement(obj);
            if (baseElement != null) {
                // if there is already an entry for this element, only add to it
                List<EObject> currentValue = this.elementToAppliedStereotypesMap.get(baseElement);
                if (currentValue == null) {
                    List<EObject> newList = new ArrayList<>();
                    newList.add(obj);
                    this.elementToAppliedStereotypesMap.put(baseElement, newList);
                } else {
                    currentValue.add(obj);
                }
            }
        }
    }

    /**
     * Find the base element that this stereotype is applied to.
     * @param stereotype the stereotype to check
     * @return the base element, or {@code null} if none could be found
     */
    private Element findStereotypeBaseElement(EObject stereotype) {
        for(EStructuralFeature feature : stereotype.eClass().getEAllStructuralFeatures()) {
            if (!feature.getName().startsWith("base_")) {
                continue;
            }

            Object value = stereotype.eGet(feature);

            if (value == null) {
                continue;
            }

            if (!(value instanceof Element)) {
                throw new AssertionError("Stereotype base value is not an Element!");
            }

            return (Element) value;
        }

        return null;
    }
}
