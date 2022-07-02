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

    @Test
    public void testClassHierarchy() {
        Class sensorDriverClass = findDercsNamedElement(model().getClasses(), "SensorDriver");
        Class joystickDriverClass = findDercsNamedElement(model().getClasses(), "JoystickDriver");
        Class wheelSpeedSensorDriverClass = findDercsNamedElement(model().getClasses(), "WheelSpeedSensorDriver");

        assertSame(sensorDriverClass, joystickDriverClass.getSuperClass());
        assertSame(sensorDriverClass, wheelSpeedSensorDriverClass.getSuperClass());
        assertNull(sensorDriverClass.getSuperClass());
    }

    //TODO: more tests once these extractors exist
    // AO tests and specific interaction tests should probably be different classes so this one doesn't get too large

    @Test
    public void testAttributes() {
        Class movementInformation = findDercsNamedElement(model().getClasses(), "MovementInformation");
        assertAttributeSignature(movementInformation, "-speed:Float");
        assertAttributeSignature(movementInformation, "-angle:Float");

        Class movementActuator = findDercsNamedElement(model().getClasses(), "MovementActuator");
        assertAttributeSignature(movementActuator, "-leftWheel:WheelActuator");
        assertAttributeSignature(movementActuator, "-rightWheel:WheelActuator");

        Class movementController = findDercsNamedElement(model().getClasses(), "MovementController");
        assertAttributeSignature(movementController, "-newSpeed:Float");
        assertAttributeSignature(movementController, "-newAngle:Float");
        assertAttributeSignature(movementController, "-movInfo:MovementInformation");
        assertAttributeSignature(movementController, "-wcAct:MovementActuator");
        assertAttributeSignature(movementController, "-alarm:Alarm");
        assertAttributeSignature(movementController, "-jstkInfo:JoystickInformation");

        Class movementEncoder = findDercsNamedElement(model().getClasses(), "MovementEncoder");
        assertAttributeSignature(movementEncoder, "-movInfo:MovementInformation");
        assertAttributeSignature(movementEncoder, "-alarm:Alarm");
        assertAttributeSignature(movementEncoder, "-leftWheelSensor:WheelSpeedSensorDriver");
        assertAttributeSignature(movementEncoder, "-rightWheelSensor:WheelSpeedSensorDriver");

        Class joystickDriver = findDercsNamedElement(model().getClasses(), "JoystickDriver");
        assertAttributeSignature(joystickDriver, "-jstkInfo:JoystickInformation");

        Class controlSubSystem = findDercsNamedElement(model().getClasses(), "ControlSubSystem");
        assertAttributeSignature(controlSubSystem, "-alarm:Alarm");
        assertAttributeSignature(controlSubSystem, "-movCtrl:MovementController");

        Class sensoringSubSystem = findDercsNamedElement(model().getClasses(), "SensoringSubSystem");
        assertAttributeSignature(sensoringSubSystem, "-movInfo:MovementInformation");
        assertAttributeSignature(sensoringSubSystem, "-movEnc:MovementEncoder");
        assertAttributeSignature(sensoringSubSystem, "-leftWheelSensor:WheelSpeedSensorDriver");
        assertAttributeSignature(sensoringSubSystem, "-rightWheelSensor:WheelSpeedSensorDriver");
        assertAttributeSignature(sensoringSubSystem, "-jstkSensor:JoystickDriver");
        assertAttributeSignature(sensoringSubSystem, "-jstkInfo:JoystickInformation");
    }

    public void testMethods() {

    }

    public void testEvents() {

    }
}
