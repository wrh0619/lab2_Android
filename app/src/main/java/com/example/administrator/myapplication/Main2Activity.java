package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class Main2Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityLife","调用onCreate()");
         }
        @Override
        protected void onStart(){
            super.onStart();
            Log.i("MainActivityLife","调用onstart()");
        }
        @Override
        protected void onResume(){
            super.onResume();
            Log.i("MainActivityLife","调用onresume()");
        }
        @Override
        protected void onPause() {
            super.onPause();
            Log.i("MainActivityLife","调用onpause()");
         }
         @Override
        protected void onStop() {
            super.onStop();
            Log.i("MainActivityLife","调用onstop()");
          }
          @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.i("MainActivityLife","调用ondestroy()");
         }
        protected void onRestart() {
            super.onRestart();
            Log.i("MainActivityLife","调用onRestart()");
        }
    }


