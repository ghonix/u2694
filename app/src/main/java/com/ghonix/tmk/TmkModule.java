package com.ghonix.tmk;

import android.app.Application;

import com.ghonix.tmk.ui.UiModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aghoneim on 8/8/14.
 */
@Module(
        includes = {
                UiModule.class
        },
        injects = {
                TmkApp.class
        }
)
public class TmkModule {

    private final TmkApp app;

    public TmkModule(TmkApp app) {
        this.app = app;
    }

    @Provides @Singleton
    Application provideApplication() {
        return app;
    }
}
