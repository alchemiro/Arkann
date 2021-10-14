package com.example.arkann;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class EcoCodesList extends AppCompatActivity {
    LinearLayout ll =(LinearLayout) findViewById(R.id.buttonLayout);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_codes_list);
        for(int i=0;i<=499;i++){
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        Button btn=new Button(this);
        btn.setId(i);
        if(i<100){
            btn.setText("A"+String.valueOf(i));
            if(i%100<10){
                btn.setText("A0"+String.valueOf(i));
            }
        }
        else if(i<200){
            btn.setText("B"+String.valueOf(i));
            if(i%100<10){
                btn.setText("B0"+String.valueOf(i));
            }
        }
        else if(i<300){
            btn.setText("C"+String.valueOf(i));
            if(i%100<10){
                btn.setText("C0"+String.valueOf(i));
            }
        }
        else if (i<400){
            btn.setText("D"+String.valueOf(i));
            if(i%100<10){
                btn.setText("D0"+String.valueOf(i));
            }
        }
        else{
            btn.setText("E"+String.valueOf(i));
            if(i%100<10){
                btn.setText("E0"+String.valueOf(i));
            }
        }
        }
    }
}