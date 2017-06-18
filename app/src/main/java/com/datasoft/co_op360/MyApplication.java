package com.datasoft.co_op360;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by mehedi on 5/9/17.
 */

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(new FlowConfig.Builder(this).build());
    }

    /*@Override
    public void onCreate() {

        super.onCreate();

        Thread.setDefaultUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread thread, Throwable e) {
                        handleUncaughtException(thread, e);
                    }
                });
    }

    private void handleUncaughtException(Thread thread, Throwable e) {

        e.printStackTrace();

        // The following shows what I'd like, though it won't work like this.
        Toast.makeText(getApplicationContext(), "App Crashed", Toast.LENGTH_SHORT).show();

        Log.e("App Crashed", "" + thread.getStackTrace());

        // Add some code logic if needed based on your requirement
    }*/
}
