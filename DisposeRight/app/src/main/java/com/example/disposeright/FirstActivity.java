package com.example.disposeright;


import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.os.Handler;


public class FirstActivity extends Activity {
    private static int TIME_OUT = 2000; //Time to launch the another activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(FirstActivity.this, HomeActivity.class);
                startActivity(i);
                FirstActivity.this.finish();
            }
        }, TIME_OUT);
    }
}