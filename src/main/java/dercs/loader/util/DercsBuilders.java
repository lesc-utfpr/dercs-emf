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
package dercs.loader.util;

import dercs.behavior.BehaviorFactory;
import dercs.datatypes.DataType;
import dercs.structure.Class;
import dercs.structure.NamedElement;
import dercs.structure.StructureFactory;
import dercs.structure.Visibility;

/**
 * Contains builders for classes with many constructor arguments, to make construction more readable.
 */
public class DercsBuilders {
    /**
     * Builder for Methods, Constructors and Destructors.
     * <p>
     * Defaults: public, non-abstract, returning void
     */
    public static class Method {
        private final dercs.structure.Method result;

        private Method(dercs.structure.Method object) {
            result = object;
            result.setName(null);
            result.setReturnType(null);
            result.setVisibility(Visibility.PUBLIC);
            result.setOverwritingMethod(false);
            result.setAbstract(false);
            result.setTriggeredBehavior(null);
        }

        public static DercsBuilders.Method create(String name) {
            return new Method(StructureFactory.eINSTANCE.createMethod())
                    .name(name);
        }

        public static DercsBuilders.Method createConstructor(String name) {
            return new Method(StructureFactory.eINSTANCE.createConstructor())
                    .name(name)
                    .triggeredBehavior(DercsBuilders.Behavior.create().build());
        }

        public static DercsBuilders.Method createDestructor(String name) {
            return new Method(StructureFactory.eINSTANCE.createDestructor())
                    .name(name)
                    .triggeredBehavior(DercsBuilders.Behavior.create().build());
        }

        public DercsBuilders.Method name(String name) {
            result.setName(name);
            return this;
        }

        public DercsBuilders.Method returnType(DataType type) {
            result.setReturnType(type);
            return this;
        }

        public DercsBuilders.Method visibility(Visibility visibility) {
            result.setVisibility(visibility);
            return this;
        }

        public DercsBuilders.Method triggeredBehavior(dercs.behavior.Behavior behavior) {
            result.setTriggeredBehavior(behavior);
            return this;
        }

        public DercsBuilders.Method setStatic(boolean static_) {
            result.setStatic(static_);
            return this;
        }

        public DercsBuilders.Method setAbstract(boolean abstract_) {
            result.setAbstract(abstract_);
            return this;
        }

        public DercsBuilders.Method setOverwriting(boolean overwriting) {
            result.setOverwritingMethod(overwriting);
            return this;
        }

        public DercsBuilders.Method setActive(boolean active) {
            result.setActive(active);
            return this;
        }

        public DercsBuilders.Method associatedAttribute(dercs.structure.Attribute attribute) {
            result.setAssociatedAttribute(attribute);
            return this;
        }

        public DercsBuilders.Method every(int every) {
            result.setEvery(every);
            return this;
        }

        public dercs.structure.Method build() {
            return result;
        }

        public dercs.structure.Method addToClass(dercs.structure.Class cls) {
            return cls.addMethod(result);
        }
    }

    /**
     * Builder for Attributes.
     * <p>
     * Defaults: not readonly
     */
    public static class Attribute {
        private final dercs.structure.Attribute result;

        private Attribute() {
            result = StructureFactory.eINSTANCE.createAttribute();
            result.setReadOnly(false);
        }

        public static Attribute create(String name) {
            return new Attribute().name(name);
        }

        public Attribute name(String name) {
            result.setName(name);
            return this;
        }

        public Attribute dataType(DataType dataType) {
            result.setDataType(dataType);
            return this;
        }

        public Attribute visibility(Visibility visibility) {
            result.setVisibility(visibility);
            return this;
        }

        public Attribute defaultValue(String defaultValue) {
            result.setDefaultValue(defaultValue);
            return this;
        }

        public Attribute readonly(boolean readonly) {
            result.setReadOnly(readonly);
            return this;
        }

        public Attribute setStatic(boolean static_) {
            result.setStatic(static_);
            return this;
        }

        public dercs.structure.Attribute build() {
            return result;
        }

        public dercs.structure.Attribute addToClass(Class cls) {
            cls.addAttribute(result);
            return result;
        }
    }

    /**
     * Builder for Behaviors.<p>
     * Defaults: named "Behavior", no enter/exit condition, no alternate behavior, 0 repetitions
     */
    public static class Behavior {
        private final dercs.behavior.Behavior result;

        private Behavior() {
            result = BehaviorFactory.eINSTANCE.createBehavior();
            result.setName("Behavior");
            result.setEnterCondition(null);
            result.setExitCondition(null);
            result.setAlternateBehavior(null);
            result.setNumberOfRepetitions(0);
        }

        public static Behavior create() {
            return new Behavior();
        }

        public Behavior name(String name) {
            result.setName(name);
            return this;
        }

        public Behavior enterCondition(String enterCondition) {
            result.setEnterCondition(enterCondition);
            return this;
        }

        public Behavior exitCondition(String exitCondition) {
            result.setExitCondition(exitCondition);
            return this;
        }

        public Behavior numberOfRepetitions(int numberOfRepetitions) {
            result.setNumberOfRepetitions(numberOfRepetitions);
            return this;
        }

        public Behavior alternateBehavior(dercs.behavior.Behavior alternateBehavior) {
            result.setAlternateBehavior(alternateBehavior);
            return this;
        }

        public Behavior setStatic(boolean static_) {
            result.setStatic(static_);
            return this;
        }

        public Behavior setOwner(NamedElement owner) {
            result.setOwner(owner);
            return this;
        }

        public dercs.behavior.Behavior build() {
            return result;
        }
    }
}
