package com.ghonix.tmk.ui;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

import com.ghonix.tmk.R;
import com.ghonix.tmk.U2694App;

import javax.inject.Inject;

public class MainActivity extends Activity {

    @Inject Application application;
    @Inject AppContainer appContainer;

    private static final String TAG = MainActivity.class.getSimpleName();
    private ViewGroup container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        U2694App.get(this).inject(this);

        container = appContainer.get(this, application);
        getLayoutInflater().inflate(R.layout.activity_main, container);

        Log.d(TAG, "Test -> " + String.valueOf(application != null));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
