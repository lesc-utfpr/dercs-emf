package dercs.loader.processor;

import dercs.loader.exception.DercsLoaderException;
import dercs.loader.processor.base.AbstractModelProcessor;
import dercs.structure.runtime.Object;

/**
 * During generation objects are named according to their "owners".
 * However this information should not be included in the final output.
 */
public class ObjectNameFixer extends AbstractModelProcessor {
    @Override
    protected void run() throws DercsLoaderException {
        for(Object obj : model().getObjects()) {
            String name = obj.getName();
            if (name.contains("~"))
                name = name.substring(name.indexOf("~")+1);
            obj.setName(name);

            // recreating RuntimeInformation objects
            obj.recreateRuntimeInformationForAttributes();
        }
    }

    @Override
    public String getName() {
        return "ObjectNameFixer";
    }
}
