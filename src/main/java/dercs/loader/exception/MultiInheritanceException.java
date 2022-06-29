package dercs.loader.exception;

import dercs.structure.Class;

import java.util.List;

public class MultiInheritanceException extends DercsLoaderException {
    Class dercsClass;
    //List<Class> superClasses;

    public MultiInheritanceException(Class cls/*, List<Class> superClasses*/) {
        super(ERROR_501 + "\t[" + cls.getName() + "]");
        this.dercsClass = cls;
        //this.superClasses = superClasses;
    }
}
