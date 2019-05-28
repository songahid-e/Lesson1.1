package com.example.lesson11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static String LOG_TAG;
    String test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LOG_TAG = MainActivity.class.getSimpleName();
        test = null;

        Log.d(LOG_TAG, "Hello World");

        try {
            int iTest = Integer.parseInt(test);
        } catch (Exception ex) {
            Log.e(LOG_TAG, "EXCEPTION CAUGHT WHILE PARSING!");
            ex.printStackTrace();
        }
    }
}
