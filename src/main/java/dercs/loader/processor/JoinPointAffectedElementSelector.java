package dercs.loader.processor;

import dercs.loader.exception.DercsLoaderException;
import dercs.loader.processor.base.AbstractModelProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JoinPointAffectedElementSelector extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("JoinPointsExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        //TODO
    }

    @Override
    public String getName() {
        return "JoinPointAffectedElementSelector";
    }
}
