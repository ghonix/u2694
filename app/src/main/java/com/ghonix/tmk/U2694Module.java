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
                U2694App.class
        }
)
public class U2694Module {

    private final U2694App app;

    public U2694Module(U2694App app) {
        this.app = app;
    }

    @Provides @Singleton
    Application provideApplication() {
        return app;
    }
}
