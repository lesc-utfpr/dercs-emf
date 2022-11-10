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

import dercs.behavior.LocalVariable;
import dercs.loader.exception.DuplicateElementNameException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Class;
import dercs.structure.*;

import java.util.Collection;
import java.util.function.Predicate;

/**
 * Contains helper functions for accessing commonly needed DERCS elements.
 */
public class DercsAccessHelper {
    /**
     * Finds the first constructor of the class.
     * @param dercsClass the DERCS class
     * @return the first Constructor that is found
     */
    public static Constructor getConstructor(Class dercsClass) {
        for (Method method : dercsClass.getMethods()) {
            if (method instanceof Constructor) {
                return (Constructor) method;
            }
        }

        return null;
    }

    /**
     * Finds the first destructor of the class.
     * @param dercsClass the DERCS class
     * @return the first Destructor that is found
     */
    public static Destructor getDestructor(Class dercsClass) {
        for (Method method : dercsClass.getMethods()) {
            if (method instanceof Destructor) {
                return (Destructor) method;
            }
        }

        return null;
    }

    /**
     * Tries to find an element with the given name in the collection.
     * @param collection the collection to search
     * @param name the name to search for
     * @return the element with the given name if it was found, {@code null} otherwise
     * @throws DuplicateElementNameException if multiple elements with the given name are found
     */
    public static <T extends NamedElement> T findNamedElement(Collection<T> collection, String name) throws DuplicateElementNameException {
        T found = null;
        for (T element : collection) {
            if (element.getName().equals(name)) {
                if (found == null) {
                    found = element;
                } else {
                    throw new DuplicateElementNameException(name, element.getClass());
                }
            }
        }

        return found;
    }

    /**
     * Tries to find an element matching the given predicate in the collection.
     * @param collection the collection to search
     * @param predicate the predicate to match with
     * @return the element matching the given predicate if it was found, {@code null} otherwise
     * @throws DuplicateElementNameException if multiple elements matching the given predicate are found
     */
    public static <T> T findElementByPredicate(Collection<T> collection, Predicate<T> predicate) throws DuplicateElementNameException {
        T found = null;
        for (T element : collection) {
            if (predicate.test(element)) {
                if (found == null) {
                    found = element;
                } else {
                    throw new DuplicateElementNameException("__PREDICATE__", element.getClass());
                }
            }
        }

        return found;
    }

    /**
     * Get the object that is associated with a given attribute.
     * @param attr Attribute which is associated with an object
     * @param model DERCS model that owns the objects
     * @return The found object, or {@code null} when there is no object associated with the attribute
     */
    public static dercs.structure.runtime.Object getObjectRelatedTo(Attribute attr, InProgressDercsModel model) throws DuplicateElementNameException {
        String objName = attr.getOwnerClass().getName() + "~" + attr.getName();
        return findNamedElement(model.getModel().getObjects(), objName);
    }

    /**
     * Get the object that is associated with a given local variable.
     * @param var Local variable which is associated with an object
     * @param model DERCS model that owns the objects
     * @return The found object, or {@code null} when there is no object associated with the variable.
     */
    public static dercs.structure.runtime.Object getObjectRelatedTo(LocalVariable var, InProgressDercsModel model) throws DuplicateElementNameException {
        String objName = "VAR~" + var.getName();
        return findNamedElement(model.getModel().getObjects(), objName);
    }
}
