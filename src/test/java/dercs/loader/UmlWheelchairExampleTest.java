package dercs.loader;

import dercs.loader.exception.DercsLoaderException;
import dercs.structure.Class;
import dercs.structure.NamedElement;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class UmlWheelchairExampleTest extends AbstractLoaderFileTest {
    public UmlWheelchairExampleTest() throws DercsLoaderException {
        super("/uml_models/Wheelchair.uml");
    }

    @Test
    public void testClasses() {
        // Number of classes
        assertEquals(12, model().getClasses().size(), "Number of classes does not match.");

        // Class names
        Set<String> classNames =  model().getClasses()
                .stream()
                .map(NamedElement::getName)
                .collect(Collectors.toSet());

        Set<String> expectedClassNames = new HashSet<>();
        Collections.addAll(expectedClassNames,
                "JoystickInformation",
                "MovementEncoder",
                "MovementController",
                "Alarm",
                "ControlSubSystem",
                "SensoringSubSystem",
                "SensorDriver",
                "MovementInformation",
                "MovementActuator",
                "JoystickDriver",
                "WheelActuator",
                "WheelSpeedSensorDriver"
        );

        assertEquals(expectedClassNames, classNames, "Class names did not match.");

        // Class Properties
        Class alarmClass = findDercsNamedElement(model().getClasses(), "Alarm");
        assertTrue(alarmClass.isActiveClass(), "Alarm should be an active class.");
        assertFalse(alarmClass.isPassiveClass(), "Alarm should not be a passive class.");
        assertFalse(alarmClass.isAbstract(), "Alarm should not be an abstract class");
        assertSame(model(), alarmClass.getOwner(), "Classes should be owned by their model.");

        Class movementInformationClass = findDercsNamedElement(model().getClasses(), "MovementInformation");
        assertFalse(movementInformationClass.isActiveClass(), "MovementInformation should not be an active class.");
        assertTrue(movementInformationClass.isPassiveClass(), "MovementInformation should be a passive class.");
        assertFalse(movementInformationClass.isAbstract(), "MovementInformation should not be an abstract class");
        assertSame(model(), movementInformationClass.getOwner(), "Classes should be owned by their model.");

    }

    //TODO: more tests once these extractors exist
    // AO tests and specific interaction tests should probably be different classes so this one doesn't get too large

    public void testAssociations() {

    }

    public void testAttributes() {

    }

    public void testMethods() {

    }

    public void testEvents() {

    }
}
