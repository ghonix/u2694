package com.ghonix.u2694;

final class Modules {
    static Object[] list(U2694App app) {
        return new Object[] {
                new U2694Module(app),
                new DebugU2694Module()
        };
    }

    private Modules() {
        // No instances.
    }
}
