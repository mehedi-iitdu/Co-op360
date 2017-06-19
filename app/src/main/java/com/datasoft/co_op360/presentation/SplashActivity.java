package com.datasoft.co_op360.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.datasoft.co_op360.presentation.fieldofficer.ui.activities.FoMainActivity;
import com.datasoft.co_op360.presentation.login.LoginActivity;
import com.datasoft.co_op360.storage.sharedprefereces.SecureSharedPreferences;

/**
 * Created by mehedi on 3/16/17.
 */

public class SplashActivity extends AppCompatActivity {

    public static int SPLASH_TIME_OUT = 1000;
    private SecureSharedPreferences msecureSharedPreferences;
    private Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        msecureSharedPreferences = SecureSharedPreferences.getInstance(this, "MyPref");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (msecureSharedPreferences.getBoolean("is_loggedIn", false)) {

                    mIntent = new Intent(SplashActivity.this, FoMainActivity.class);
                    startActivity(mIntent);
                    finish();
                } else {

                    mIntent = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(mIntent);
                    finish();
                }

                /*mIntent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(mIntent);
                finish();*/

            }

        }, SPLASH_TIME_OUT);

        //throw new RuntimeException("This is a crash");

    }

}
