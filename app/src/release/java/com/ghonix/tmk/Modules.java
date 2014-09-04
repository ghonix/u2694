package com.ghonix.tmk;

import com.ghonix.tmk.TmkApp;
import com.ghonix.tmk.TmkModule;

final class Modules {
    static Object[] list(TmkApp app) {
        return new Object[] {
                new TmkModule(app)
        };
    }

    private Modules() {
        // No instances.
    }
}
