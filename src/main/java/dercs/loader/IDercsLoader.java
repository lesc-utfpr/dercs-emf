package dercs.loader;

import dercs.Model;

public interface IDercsLoader {
    /**
     * Load a DERCS model from a previously supplied source.
     *
     * @return the loaded DERCS model
     */
    Model loadDercsModel();
}
