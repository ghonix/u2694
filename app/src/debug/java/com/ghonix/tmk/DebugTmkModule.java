package com.ghonix.tmk;

import com.ghonix.tmk.ui.DebugUiModule;

import dagger.Module;

/**
 * Created by aghoneim on 8/8/14.
 */
@Module(
        addsTo = TmkModule.class,
        includes = {
                DebugUiModule.class
        },
        overrides = true
)
public class DebugTmkModule {
}