package com.example.arkann;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class EcoCodesList extends AppCompatActivity {
    LinearLayout ll;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_codes_list);

        scrollView=(ScrollView)findViewById(R.id.btnScroller);
        ll=(LinearLayout)findViewById(R.id.btnLayout);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        for(int i=0;i<=499;i++) {

            Button btn = new Button(this);
            btn.setId(i);
            btn.setLayoutParams(params);
            if (i < 100) {
                String nameOpening="A" + String.valueOf(i);
                btn.setText(nameOpening);
                btn.setId(Integer.parseInt(nameOpening));


                if (i % 100 < 10) {
                    nameOpening="A0" + String.valueOf(i);
                    btn.setText(nameOpening);
                    btn.setId(Integer.parseInt(nameOpening));

                }
            } else if (i < 200) {
                String nameOpening="B" + String.valueOf(i%100);
                btn.setText(nameOpening);
                btn.setId(Integer.parseInt(nameOpening));

                if (i % 100 < 10) {
                    nameOpening="B0" + String.valueOf(i%100);
                    btn.setText(nameOpening);
                    btn.setId(Integer.parseInt(nameOpening));

                }
            } else if (i < 300) {
                String nameOpening="C" + String.valueOf(i%100);
                btn.setText(nameOpening);
                btn.setId(Integer.parseInt(nameOpening));

                if (i % 100 < 10) {
                    nameOpening="C0" + String.valueOf(i%100);
                    btn.setText(nameOpening);
                    btn.setId(Integer.parseInt(nameOpening));

                }
            } else if (i < 400) {
                String nameOpening="D" + String.valueOf(i%100);
                btn.setText(nameOpening);
                btn.setId(Integer.parseInt(nameOpening));

                if (i % 100 < 10) {
                    nameOpening="D0" + String.valueOf(i%100);
                    btn.setText(nameOpening);
                    btn.setId(Integer.parseInt(nameOpening));

                }
            } else {
                String nameOpening="E" + String.valueOf(i%100);
                btn.setText(nameOpening);
                btn.setId(Integer.parseInt(nameOpening));
                if (i % 100 < 10) {
                    nameOpening="E0" + String.valueOf(i%100);
                    btn.setText(nameOpening);
                    btn.setId(Integer.parseInt(nameOpening));
                }
            }
            ll.addView(btn, params);
        }
    }
}