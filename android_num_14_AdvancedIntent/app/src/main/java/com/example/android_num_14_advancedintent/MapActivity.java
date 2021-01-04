package com.example.android_num_14_advancedintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MapActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        open_map();
    }
    private void open_map()
    {
        Intent map = new Intent(Intent.ACTION_VIEW);
        startActivity(map);
        finish();//Close XML after opening
    }
}