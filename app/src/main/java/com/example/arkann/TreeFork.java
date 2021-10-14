package com.example.arkann;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TreeFork extends AppCompatActivity {
    Button ecoButton,gamesButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_fork);
        ecoButton=findViewById(R.id.EcoButton);
        gamesButton=findViewById(R.id.GamesButton);
    }
    public void openEco(View view){
        Intent ecoIntent=new Intent(this,EcoCodesList.class);
        startActivity(ecoIntent);
    }

    public void openGames(View view) {
        Intent gamesIntent=new Intent(this,gamesList.class);
    }

    public void backClick(View view){
        finish();
    }
}