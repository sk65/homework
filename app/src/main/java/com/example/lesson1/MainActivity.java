package com.example.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private final String TAG = "DEV";
    public static final String EXTRA_MESSAGE = "com.example.lesson1.MESSAGE";

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

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}