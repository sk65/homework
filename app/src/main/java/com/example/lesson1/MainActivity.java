package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "DEV";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "method onCreate started");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "method onStart started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "method onResume started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "method onPause started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "method onStop started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "method onDestroy started");
    }
}