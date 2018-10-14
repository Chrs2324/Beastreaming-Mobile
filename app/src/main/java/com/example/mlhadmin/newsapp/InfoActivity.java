package com.example.mlhadmin.newsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClick2(View view)
    {
        Intent intent = new Intent(this, TrendActivity.class);
        startActivity(intent);
    }
    public void onClick3(View view)
    {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
}
