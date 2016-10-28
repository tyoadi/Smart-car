package com.example.myself.semarca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by myself on 26/11/2015.
 */
public class SplashScreen extends Activity {
    private  static int SPLASH_TIME_OUT = 3000;
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {
            /*
            *showing splash screen eith a timmer.
             */

            public void run() {
                //methode will be execute once the timer is over
                //start your app main activity
                Intent i = new Intent(SplashScreen.this, com.example.myself.semarca.MainActivity.class);
                startActivity(i);

                //close activity
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
