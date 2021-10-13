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
            btn.setText("A"+i.toString());
            if(i%100<10){
                btn.setText("A0"+i.toString());
            }
        }
        else if(i<200){
            btn.setText("B"+i.toString());
            if(i%100<10){
                btn.setText("B0"+i.toString());
            }
        }
        else if(i<300){
            btn.setText("C"+i.toString());
            if(i%100<10){
                btn.setText("C0"+i.toString());
            }
        }
        else if (i<400){
            btn.setText("D"+i.toString());
            if(i%100<10){
                btn.setText("D0"+i.toString());
            }
        }
        else{
            btn.setText("E"+i.toString());
            if(i%100<10){
                btn.setText("E0"+i.toString());
            }
        }
        }
    }
}