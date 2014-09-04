package com.ghonix.u2694.ui;

import com.ghonix.u2694.ui.debug.DebugAppContainer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aghoneim on 9/3/14.
 */
@Module(
        injects = DebugAppContainer.class,
        complete = false,
        library = true,
        overrides = true
)
public class DebugUiModule {

    @Provides @Singleton AppContainer providesAppContainer( DebugAppContainer debugAppContainer) {
        return debugAppContainer;
    }

}
