package com.ghonix.tmk.ui.debug;

import android.app.Activity;
import android.app.Application;
import android.view.ViewGroup;

import com.ghonix.tmk.R;
import com.ghonix.tmk.ui.AppContainer;

import javax.inject.Inject;

/**
 * Created by aghoneim on 9/3/14.
 */
public class DebugAppContainer implements AppContainer {

    @Inject
    public DebugAppContainer() {

    }

    @Override
    public ViewGroup get(Activity activity, Application app) {
        activity.setContentView(R.layout.debug_activity_frame);
        return (ViewGroup) activity.findViewById(R.id.debug_content);
    }
}
