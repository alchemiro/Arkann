package com.example.arkann;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TreeFork extends AppCompatActivity {
    Button ecoButton=findViewById(R.id.EcoButton);
    Button gamesButton=findViewById(R.id.GamesButton);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_fork);
    }
    public void openEco(View view){
        Intent ecoIntent=new Intent(this,EcoCodesList.class);
        startActivity(ecoIntent);
    }
}