package dercs.loader;

import dercs.AO.*;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.DuplicateElementNameException;
import dercs.loader.util.AbstractLoaderFileTest;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.util.Util;
import dercs.structure.BaseElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UmlWheelchairExampleAoTest extends AbstractLoaderFileTest {
    public UmlWheelchairExampleAoTest() throws DercsLoaderException {
        super("/uml_models/Wheelchair.uml");
    }

    @Test
    public void testAspects() throws DercsLoaderException {
        assertEquals(5, model().getAspects().size(), "Number of Aspects does not match.");

        // test every aspect for correct number of adaptations and
        // randomly sample some adaptations that should be there
        Aspect timingAttributesAspect = DercsAccessHelper.findNamedElement(model().getAspects(), "TimingAttributes");
        assertNotNull(timingAttributesAspect, "Cannot find aspect.");
        assertEquals(5, timingAttributesAspect.getStructuralAdaptations().size(), "Aspect has incorrect number of structural Adaptations.");
        assertEquals(2, timingAttributesAspect.getBehavioralAdaptations().size(), "Aspect has incorrect number of behavioral Adaptations.");
        assertNotNull(DercsAccessHelper.findNamedElement(timingAttributesAspect.getStructuralAdaptations(), "Deadline"));
        assertNotNull(DercsAccessHelper.findNamedElement(timingAttributesAspect.getBehavioralAdaptations(), "SetTimingAttributes"));

        Aspect periodicTimingAspect = DercsAccessHelper.findNamedElement(model().getAspects(), "PeriodicTiming");
        assertNotNull(periodicTimingAspect, "Cannot find aspect.");
        assertEquals(2, periodicTimingAspect.getStructuralAdaptations().size(), "Aspect has incorrect number of structural Adaptations.");
        assertEquals(4, periodicTimingAspect.getBehavioralAdaptations().size(), "Aspect has incorrect number of behavioral Adaptations.");
        assertNotNull(DercsAccessHelper.findNamedElement(periodicTimingAspect.getStructuralAdaptations(), "Period"));
        assertNotNull(DercsAccessHelper.findNamedElement(periodicTimingAspect.getBehavioralAdaptations(), "LoopMechanism"));

        Aspect dataFreshnessAspect = DercsAccessHelper.findNamedElement(model().getAspects(), "DataFreshness");
        assertNotNull(dataFreshnessAspect, "Cannot find aspect.");
        assertEquals(1, dataFreshnessAspect.getStructuralAdaptations().size(), "Aspect has incorrect number of structural Adaptations.");
        assertEquals(3, dataFreshnessAspect.getBehavioralAdaptations().size(), "Aspect has incorrect number of behavioral Adaptations.");
        assertNotNull(DercsAccessHelper.findNamedElement(dataFreshnessAspect.getStructuralAdaptations(), "ValidityInformation"));
        assertNotNull(DercsAccessHelper.findNamedElement(dataFreshnessAspect.getBehavioralAdaptations(), "UpdateFreshness"));

        Aspect schedulingSupportAspect = DercsAccessHelper.findNamedElement(model().getAspects(), "SchedulingSupport");
        assertNotNull(schedulingSupportAspect, "Cannot find aspect.");
        assertEquals(1, schedulingSupportAspect.getStructuralAdaptations().size(), "Aspect has incorrect number of structural Adaptations.");
        assertEquals(1, schedulingSupportAspect.getBehavioralAdaptations().size(), "Aspect has incorrect number of behavioral Adaptations.");

        Aspect concurrentAccessControlAspect = DercsAccessHelper.findNamedElement(model().getAspects(), "ConcurrentAccessControl");
        assertNotNull(concurrentAccessControlAspect, "Cannot find aspect.");
        assertEquals(1, concurrentAccessControlAspect.getStructuralAdaptations().size(), "Aspect has incorrect number of structural Adaptations.");
        assertEquals(2, concurrentAccessControlAspect.getBehavioralAdaptations().size(), "Aspect has incorrect number of behavioral Adaptations.");
    }


    private final String[][] expectedPointcuts = {
            {"TimingAttributes", "pcActClass"},
            {"TimingAttributes", "pcActClass2"},
            {"TimingAttributes", "pcActObjInit"},
            {"TimingAttributes", "pcActObjInit2"},
            {"TimingAttributes", "pcActObjConstructor"},

            {"PeriodicTiming", "pcActObjConstructor"},
            {"PeriodicTiming", "pcActClass"},
            {"PeriodicTiming", "pcActObjInit"},
            {"PeriodicTiming", "pcActObjInit2"},
            {"PeriodicTiming", "pcLoop"},
            {"PeriodicTiming", "pcFreqCtrl"},

            {"DataFreshness", "pcInfoClassAttr"},
            {"DataFreshness", "pcInfoClassObjInit"},
            {"DataFreshness", "pcReadAttrValue"},
            {"DataFreshness", "pcWriteAttrValue"},

            {"SchedulingSupport", "pcSubSystemConstruction"},
            {"SchedulingSupport", "pcSubSystemClass"},

            {"ConcurrentAccessControl", "pcBeforeRead"},
            {"ConcurrentAccessControl", "pcSharedObjClass"},
            {"ConcurrentAccessControl", "pcAfterRead"},
            {"ConcurrentAccessControl", "pcBeforeWrite"},
            {"ConcurrentAccessControl", "pcAfterWrite"}
    };

    @Test
    public void testPointcuts() throws DercsLoaderException {
        // first check for all expected pointcuts
        for (String[] expected : expectedPointcuts) {
            Aspect aspect = DercsAccessHelper.findNamedElement(model().getAspects(), expected[0]);
            if (expected.length == 1) {
                // no pointcuts expected for this aspect
                assertEquals(0, aspect.getPointcuts().size(), "Expected no pointcuts for this aspect.");
            } else {
                // expect pointcut with given name
                Pointcut expectedPointcut = DercsAccessHelper.findNamedElement(aspect.getPointcuts(), expected[1]);
                assertNotNull(expectedPointcut, "Expected to find pointcut '" + expected[1] + "' for aspect '" + aspect.getName() + "'.");
            }
        }

        // then check the details on some random samples
        Aspect timingAttributesAspect = DercsAccessHelper.findNamedElement(model().getAspects(), "TimingAttributes");
        Pointcut pcActClass2 = DercsAccessHelper.findNamedElement(timingAttributesAspect.getPointcuts(), "pcActClass2");
        assertEquals("JPDD_ActiveObjectClass", pcActClass2.getJoinPoints().get(0).getName());
        assertEquals("ModifyClassStructure", pcActClass2.getAspectAdaptation().getName());
        assertEquals(RelativePosition.MODIFY_STRUCTURE, pcActClass2.getRelativePosition());

        Aspect periodicTimingAspect = DercsAccessHelper.findNamedElement(model().getAspects(), "PeriodicTiming");
        Pointcut pcLoop = DercsAccessHelper.findNamedElement(periodicTimingAspect.getPointcuts(), "pcLoop");
        assertEquals("JPDD_PeriodicBehavior", pcLoop.getJoinPoints().get(0).getName());
        assertEquals("LoopMechanism", pcLoop.getAspectAdaptation().getName());
        assertEquals(RelativePosition.AROUND, pcLoop.getRelativePosition());

        Aspect concurrentAccessControlAspect = DercsAccessHelper.findNamedElement(model().getAspects(), "ConcurrentAccessControl");
        Pointcut pcSharedObjClass = DercsAccessHelper.findNamedElement(concurrentAccessControlAspect.getPointcuts(), "pcSharedObjClass");
        assertEquals("JPDD_ExclusiveObjectClass", pcSharedObjClass.getJoinPoints().get(0).getName());
        assertEquals("ConcurrencyControlMechanism", pcSharedObjClass.getAspectAdaptation().getName());
        assertEquals(RelativePosition.ADD_NEW_FEATURE, pcSharedObjClass.getRelativePosition());
    }

    private final String[][] expectedCrosscutting = {
            {"TimingAttributes", "JoystickDriver", "Deadline=10ms", "Priority=2", "WCET=1ms"},
            {"TimingAttributes", "MovementEncoder", "Deadline=10ms", "Priority=2", "WCET=2ms"},
            {"TimingAttributes", "Alarm", "Deadline=5ms", "Priority=1", "WCET=2ms"},
            {"TimingAttributes", "MovementController", "Deadline=50ms", "Priority=2", "WCET=10ms"},
            {"PeriodicTiming", "JoystickDriver", "Period=10ms"},
            {"PeriodicTiming", "MovementEncoder", "Period=10ms"},
            {"PeriodicTiming", "MovementController", "Period=50ms"},
            {"DataFreshness", "JoystickInformation", "TimeStamp=10ms"},
            {"DataFreshness", "MovementInformation", "TimeStamp=10ms"}
    };

    @Test
    public void testCrosscutting() throws DuplicateElementNameException {
        for (String[] expected : expectedCrosscutting) {
            Aspect aspect = DercsAccessHelper.findNamedElement(model().getAspects(), expected[0]);
            if (expected.length == 1) {
                // no crosscutting expected for this aspect
                assertEquals(0, aspect.getCrosscutting().size(), "Expected no crosscuts for this aspect.");
            } else {
                // expect crosscutting with given name
                Crosscutting expectedCrosscutting = aspect.getCrosscutting().stream()
                        .filter(cc -> cc.getAffectedElement().getName().equals(expected[1]))
                        .findFirst()
                        .orElse(null);
                assertNotNull(expectedCrosscutting, "Expected to find crosscutting '" + expected[1] + "' for aspect '" + aspect.getName() + "'.");

                if (expected.length > 2) {
                    // attribute values follow
                    for (int i = 2; i < expected.length; i++) {
                        String[] parts = expected[i].split("=");

                        CrosscuttingInformation info = DercsAccessHelper.findNamedElement(expectedCrosscutting.getCrosscuttingInformations(), parts[0].trim());
                        assertNotNull(info, "Expected CrosscuttingInfo '" + parts[1] + "'.");
                        assertEquals(parts[1].trim(), info.getValue(), "Incorrect attribute value on crosscutting.");
                    }
                }
            }
        }
    }

    //TODO: add expected matches for actions once they are implemented
    private final String[][] expectedJoinPointMatches = {
            {"JPDD_ActiveObjectClass", "MovementController", "Alarm", "JoystickDriver", "MovementEncoder"},
            {"JPDD_ExclusiveObjectClass", "MovementInformation", "JoystickInformation", "SensorDriver"},
            {"JPDD_InfoClassAttribute", "MovementInformation::speed", "MovementInformation::angle", "JoystickInformation::XPosition", "JoystickInformation::YPosition"},
            {"JPDD_InfoObjectConstruction_2", "MovementInformation::MovementInformation()", "JoystickInformation::JoystickInformation()"},
            {"JPDD_SubSystemClass", "ControlSubSystem", "SensoringSubSystem"},
            {"JPDD_SubSystemConstruction_2", "ControlSubSystem::ControlSubSystem()", "SensoringSubSystem::SensoringSubSystem()"},
            {"JPDD_ActiveObjectConstruction", "MovementController::MovementController(JoystickInformation, Alarm, MovementInformation) [Behavior]", "Alarm::Alarm() [Behavior]", "JoystickDriver::JoystickDriver(JoystickInformation) [Behavior]", "MovementEncoder::MovementEncoder(MovementInformation, Alarm, WheelSpeedSensorDriver, WheelSpeedSensorDriver) [Behavior]"},
            {"JPDD_ActiveObjectConstruction_Action", "CreateObjectAction [obj={ControlSubSystem~movCtrl : MovementController}]", "CreateObjectAction [obj={ControlSubSystem~alarm : Alarm}]", "CreateObjectAction [obj={SensoringSubSystem~jstkSensor : JoystickDriver}]", "CreateObjectAction [obj={SensoringSubSystem~movEnc : MovementEncoder}]"},
            {"JPDD_ActiveObjectConstructor", "MovementController::MovementController(JoystickInformation, Alarm, MovementInformation)", "Alarm::Alarm()", "JoystickDriver::JoystickDriver(JoystickInformation)", "MovementEncoder::MovementEncoder(MovementInformation, Alarm, WheelSpeedSensorDriver, WheelSpeedSensorDriver)"},
            {"JPDD_ExclusiveGet", "SendMessageAction [mth=MovementInformation::getAngle(), toObj={MovementController~movInfo : MovementInformation}]", "SendMessageAction [mth=MovementInformation::getSpeed(), toObj={MovementController~movInfo : MovementInformation}]", "SendMessageAction [mth=JoystickInformation::getXPosition(), toObj={MovementController~jstkInfo : JoystickInformation}]", "SendMessageAction [mth=JoystickInformation::getYPosition(), toObj={MovementController~jstkInfo : JoystickInformation}]", "SendMessageAction [mth=MovementInformation::getMode(), toObj={MovementController~movInfo : MovementInformation}]"},
            {"JPDD_ExclusiveSet", "SendMessageAction [mth=JoystickInformation::setXPosition(Integer), toObj={SensoringSubSystem~jstkInfo : JoystickInformation}]", "SendMessageAction [mth=JoystickInformation::setYPosition(Integer), toObj={SensoringSubSystem~jstkInfo : JoystickInformation}]", "SendMessageAction [mth=MovementInformation::setSpeed(Float), toObj={MovementEncoder~movInfo : MovementInformation}]", "SendMessageAction [mth=MovementInformation::setAngle(Float), toObj={MovementEncoder~movInfo : MovementInformation}]"},
            {"JPDD_InfoAttributeRead", "MovementInformation::getAngle() [Behavior]", "MovementInformation::getSpeed() [Behavior]", "MovementInformation::getMode() [Behavior]", "JoystickInformation::getXPosition() [Behavior]", "JoystickInformation::getYPosition() [Behavior]"},
            {"JPDD_InfoAttributeWrite", "MovementInformation::setAngle(Float) [Behavior]", "MovementInformation::setSpeed(Float) [Behavior]", "JoystickInformation::setXPosition(Integer) [Behavior]", "JoystickInformation::setYPosition(Integer) [Behavior]"},
            {"JPDD_InfoObjectConstruction_Action", "CreateObjectAction [obj={SensoringSubSystem~movInfo : MovementInformation}]", "CreateObjectAction [obj={SensoringSubSystem~jstkInfo : JoystickInformation}]"},
            {"JPDD_ObjectConstructionAction", "CreateObjectAction [obj={MovementActuator~rightWheel : WheelActuator}]", "CreateObjectAction [obj={MovementActuator~leftWheel : WheelActuator}]", "CreateObjectAction [obj={MovementController~wcAct : MovementActuator}]", "CreateObjectAction [obj={ControlSubSystem~movCtrl : MovementController}]", "CreateObjectAction [obj={ControlSubSystem~alarm : Alarm}]", "CreateObjectAction [obj={SensoringSubSystem~movInfo : MovementInformation}]", "CreateObjectAction [obj={SensoringSubSystem~jstkInfo : JoystickInformation}]", "CreateObjectAction [obj={SensoringSubSystem~jstkSensor : JoystickDriver}]", "CreateObjectAction [obj={SensoringSubSystem~movEnc : MovementEncoder}]", "CreateObjectAction [obj={SensoringSubSystem~leftWheelSensor : WheelSpeedSensorDriver}]", "CreateObjectAction [obj={SensoringSubSystem~rightWheelSensor : WheelSpeedSensorDriver}]"},
            {"JPDD_ObjectDestructionAction"},
            {"JPDD_PeriodicBehavior", "JoystickDriver::run() [Behavior]", "MovementController::run() [Behavior]"},
//            {"JPDD_SendMsgToRemoteObject"}, <-- this seems to select all method calls in the model, and since detection of remote node calls isn't implemented yet, I think that is the correct behavior
            {"JPDD_SubSystemConstruction", "ControlSubSystem::ControlSubSystem() [Behavior]", "SensoringSubSystem::SensoringSubSystem() [Behavior]"}
    };

    @Test
    public void testJoinPoints() throws DuplicateElementNameException {
        for (String[] expected : expectedJoinPointMatches) {
            JoinPoint joinPoint = DercsAccessHelper.findNamedElement(model().getJoinPoints(), expected[0]);
            assertNotNull(joinPoint, "Expected join point '" + expected[0] + "'");

            if (expected.length == 1) {
                // no matches expected for this join point
                assertEquals(0, joinPoint.getSelectedElements().size(), "Expected no matches for join point '"  + expected[0] + "'.");
            } else {
                assertEquals(expected.length - 1, joinPoint.getSelectedElements().size(), "Incorrect number of matches for join point '"  + expected[0] + "'.");

                for (int i = 1; i < expected.length; i++) {
                    // expect match with given name
                    String name = expected[i];

                    BaseElement expectedMatch = joinPoint.getSelectedElements().stream()
                            .filter(elem -> Util.getHumanReadableElementName(elem).equals(name))
                            .findFirst()
                            .orElse(null);
                    assertNotNull(expectedMatch, "Expected to find matching element '" + expected[i] + "' for join point '" + joinPoint.getName() + "'.");
                }
            }
        }
    }
}
