package com.wiredpanda.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class SplashScreen extends Activity {


    //Timer to keep the splash screen/launch screen active.
    private final int SPLASH_DISPLAY_LENGTH = 5000;

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);


        //Hide the action bar
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getActionBar().hide();

        setContentView(R.layout.splash_screen);


        //Do some cool stuff here.


        //Actions to take after SPLASH_DISPLAY_LENGTH is up.
        //Currently it goes to MainActivity.class
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run(){
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                finish();
            }

        }, SPLASH_DISPLAY_LENGTH);


    }


}
