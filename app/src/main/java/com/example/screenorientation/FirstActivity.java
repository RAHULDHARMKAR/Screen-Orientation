package com.example.screenorientation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        getSupportActionBar().setTitle("First Activity");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}
