package dercs.loader;

import dercs.Model;
import dercs.loader.exception.DercsLoaderException;

/**
 * Common interface for DERCS model loaders.
 */
public interface IDercsLoader {
    /**
     * Load a DERCS model from a previously supplied source.
     *
     * @return the loaded DERCS model
     */
    Model loadDercsModel() throws DercsLoaderException;
}
