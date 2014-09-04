package com.ghonix.u2694.ui;

import android.app.Activity;
import android.app.Application;
import android.view.ViewGroup;

/**
 * Created by aghoneim on 9/3/14.
 */
public interface AppContainer {

    ViewGroup get(Activity activity, Application app);

    AppContainer DEFAULT = new AppContainer() {
        @Override
        public ViewGroup get(Activity activity, Application app) {
            return (ViewGroup) activity.findViewById(android.R.id.content);
        }
    };
}
