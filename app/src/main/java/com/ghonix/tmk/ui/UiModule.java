package com.ghonix.tmk.ui;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aghoneim on 8/11/14.
 */
@Module(
        injects = {
                MainActivity.class,
        },
        complete = false,
        library = true
)
public class UiModule {
    @Provides
    @Singleton
    AppContainer provideAppContainer() {
        return AppContainer.DEFAULT;
    }
}
