package dercs.loader.extractor;

import dercs.datatypes.Array;
import dercs.datatypes.DataType;
import dercs.datatypes.DatatypesFactory;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.util.DatatypeHelper;
import dercs.structure.Attribute;
import dercs.structure.Class;
import org.eclipse.uml2.uml.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Adds all attributes found in the UML classes to the corresponding DERCS classes.
 * This includes associations, because Papyrus automatically creates attributes for all associations.
 * <p>
 * Result:
 * <ul>
 *     <li>all DERCS classes have their attributes added</li>
 *     <li>getters and setters are not yet generated</li>
 * </ul>
 */
public class AttributesExtractor extends AbstractModelExtractor {
    private static final Logger LOGGER = LoggerFactory.getLogger("AttributesExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        for (Class cls : this.dercsModel.getClasses()) {
            org.eclipse.uml2.uml.Class umlClass = this.umlResource.getCorrespondingUmlElement(cls);
            handleClass(cls, umlClass);
        }
    }

    private void handleClass(Class dercsClass, org.eclipse.uml2.uml.Class umlClass) throws DercsLoaderException {
        for (Property attribute : umlClass.getAttributes()) {
            DataType dercsType = this.umlResource.getDercsDatatype(attribute.getType());

            //TODO: generate getters/setters

            //an upper bound of -1 means "unlimited"
            if (attribute.getUpper() != 1) {
                // replace type with an array of itself
                Array newArray = DatatypesFactory.eINSTANCE.createArray();
                newArray.setDataType(dercsType);
                newArray.setSize(attribute.getUpper());
                newArray.setLowerValue(attribute.getLower());
                newArray.setUpperValue(attribute.getUpper());
                dercsType = newArray;
            }

            LOGGER.info("Adding attribute '{}' to class '{}'.", attribute.getName(), dercsClass.getName());
            Attribute newAttribute = dercsClass.addAttribute(
                    attribute.getName(),
                    dercsType,
                    DatatypeHelper.convertVisibility(attribute.getVisibility()),
                    attribute.isStatic(),
                    attribute.getDefault(),
                    attribute.isReadOnly()
            );

            this.umlResource.registerDercsUmlElementPair(newAttribute, attribute);
        }
    }

    @Override
    public String getName() {
        return "AttributesExtractor";
    }
}
