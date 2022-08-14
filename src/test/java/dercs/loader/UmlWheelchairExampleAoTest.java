package dercs.loader;

import dercs.AO.*;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.DuplicateElementNameException;
import dercs.loader.util.AbstractLoaderFileTest;
import dercs.loader.util.DercsAccessHelper;
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

    @Test
    public void testJoinPoints() {
        //TODO
    }
}
