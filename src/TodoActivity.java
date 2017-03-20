package com.example.demo;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

// if TodoActivity extends AppCompatActivity , Everything functions well
public class TodoActivity extends DaggerAppCompatActivity {

    @Inject
    App app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        setContentView(R.layout.activity_todo);
        Log.e("app________",String.valueOf(app));
    }
}
