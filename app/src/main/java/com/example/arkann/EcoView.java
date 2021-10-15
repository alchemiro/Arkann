package com.example.arkann;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EcoView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_view);
        EcoDBManager ecoDb=new EcoDBManager(this);
    }
}