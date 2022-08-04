package dercs.loader.processor;

import dercs.datatypes.Array;
import dercs.datatypes.DataType;
import dercs.datatypes.DatatypesFactory;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.processor.base.AbstractModelProcessor;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.util.DercsBuilders;
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
public class AttributesExtractor extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("AttributesExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        for (Class cls : model().getClasses()) {
            org.eclipse.uml2.uml.Class umlClass = inProgressModel().getCorrespondingUmlElement(cls);
            handleClass(cls, umlClass);
        }
    }

    private void handleClass(Class dercsClass, org.eclipse.uml2.uml.Class umlClass) throws DercsLoaderException {
        for (Property attribute : umlClass.getAttributes()) {
            DataType dercsType = inProgressModel().getDercsDatatype(attribute.getType());

            //an upper bound of -1 means "unlimited" in UML
            if (attribute.getUpper() != 1) {
                // replace type with an array of itself
                Array newArray = DatatypesFactory.eINSTANCE.createArray();
                newArray.setDataType(dercsType);
                newArray.setSize(attribute.getUpper());
                newArray.setLowerValue(attribute.getLower());
                // unbounded arrays in DERCS have upper value 0, not -1
                newArray.setUpperValue(attribute.getUpper() > 1 ? attribute.getUpper() : 0);
                dercsType = newArray;
            }

            LOGGER.info("Adding attribute '{}' to class '{}'.", attribute.getName(), dercsClass.getName());
            Attribute newAttribute = DercsBuilders.Attribute.create(attribute.getName())
                    .dataType(dercsType)
                    .visibility(DatatypeHelper.convertVisibility(attribute.getVisibility()))
                    .setStatic(attribute.isStatic())
                    .defaultValue(attribute.getDefault())
                    .readonly(attribute.isReadOnly())
                    .addToClass(dercsClass);

            inProgressModel().registerDercsUmlElementPair(newAttribute, attribute);
        }
    }


    @Override
    public String getName() {
        return "AttributesExtractor";
    }
}
