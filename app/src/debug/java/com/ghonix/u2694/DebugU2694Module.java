package com.ghonix.u2694;

import com.ghonix.u2694.ui.DebugUiModule;

import dagger.Module;

/**
 * Created by aghoneim on 8/8/14.
 */
@Module(
        addsTo = U2694Module.class,
        includes = {
                DebugUiModule.class
        },
        overrides = true
)
public class DebugU2694Module {
}
