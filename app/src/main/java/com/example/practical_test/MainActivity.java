package com.example.practical_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void launchSPM(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SPM.class);
        startActivity(intent);
    }

    public void launchOlevel(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, Olevel.class);
        startActivity(intent);
    }

    public void launchUEC(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, UEC.class);
        startActivity(intent);
    }
}
