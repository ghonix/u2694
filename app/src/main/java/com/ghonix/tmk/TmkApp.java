package com.ghonix.tmk;

import android.app.Application;
import android.content.Context;

import dagger.ObjectGraph;
import hugo.weaving.DebugLog;

/**
 * Created by aghoneim on 8/8/14.
 */
public class TmkApp extends Application {
    private ObjectGraph objectGraph;


    @Override
    public void onCreate() {
        super.onCreate();

        buildObjectGraphAndInject();
    }

    @DebugLog
    public void buildObjectGraphAndInject() {
        objectGraph = ObjectGraph.create(Modules.list(this));
        objectGraph.inject(this);
    }

    public void inject(Object o) {
        objectGraph.inject(o);
    }

    public static TmkApp get(Context context) {
        return (TmkApp) context.getApplicationContext();
    }

}
