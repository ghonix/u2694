package com.ghonix.tmk;

final class Modules {
    static Object[] list(TmkApp app) {
        return new Object[] {
                new TmkModule(app),
                new DebugTmkModule()
        };
    }

    private Modules() {
        // No instances.
    }
}
