package com.rezara.androidclassproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Mytag","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Mytag","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
    Log.d("Mytag","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
    Log.d("Mytag","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
    Log.d("Mytag","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    Log.d("Mytag","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    Log.d("Mytag","onRestart");
    }
}