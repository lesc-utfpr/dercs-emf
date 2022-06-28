package dercs.loader;

import dercs.Model;

/**
 * Common interface for DERCS model loaders.
 */
public interface IDercsLoader {
    /**
     * Load a DERCS model from a previously supplied source.
     *
     * @return the loaded DERCS model
     */
    Model loadDercsModel();
}
