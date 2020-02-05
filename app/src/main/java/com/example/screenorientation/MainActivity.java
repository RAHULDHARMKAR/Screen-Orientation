package com.example.screenorientation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setTitle("Main Activity");

    }

    public void openFirstActivity(View view) {


        startActivity(new Intent(MainActivity.this, FirstActivity.class));

    }
}
