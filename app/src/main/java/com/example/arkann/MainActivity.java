package com.example.arkann;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button openingTreeButton, importButton, settingsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openingTreeButton=findViewById(R.id.OpeningTreeButton);
        importButton=findViewById(R.id.ImportButton);
        settingsButton=findViewById(R.id.SettingsButton);
    }
    public void openTree(View view){
        Intent treeIntent=new Intent(this,TreeFork.class);
        startActivity(treeIntent);
    }
    public void openImport(View view){
        Intent importIntent=new Intent(this,ImportInit.class);
        startActivity(importIntent);
    }
    public void openSettings(View view){
        Intent settingsIntent=new Intent(this,SettingsMain.class);
        startActivity(settingsIntent);
    }
}