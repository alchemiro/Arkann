package com.example.arkann;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class EcoCodesList extends AppCompatActivity {
    LinearLayout ll;
    ScrollView scrollView;

    private View.OnClickListener ecoCodeListener=new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            String ecoId=String.valueOf(v.getId());
            Intent ecoIntent=new Intent(v.getContext(),EcoView.class);
            ecoIntent.putExtra("id",ecoId);
            startActivity(ecoIntent);
        }
    };
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


                if (i % 100 < 10) {
                    nameOpening="A0" + String.valueOf(i);
                    btn.setText(nameOpening);

                }
            } else if (i < 200) {
                String nameOpening="B" + String.valueOf(i%100);
                btn.setText(nameOpening);

                if (i % 100 < 10) {
                    nameOpening="B0" + String.valueOf(i%100);
                    btn.setText(nameOpening);

                }
            } else if (i < 300) {
                String nameOpening="C" + String.valueOf(i%100);
                btn.setText(nameOpening);

                if (i % 100 < 10) {
                    nameOpening="C0" + String.valueOf(i%100);
                    btn.setText(nameOpening);

                }
            } else if (i < 400) {
                String nameOpening="D" + String.valueOf(i%100);
                btn.setText(nameOpening);

                if (i % 100 < 10) {
                    nameOpening="D0" + String.valueOf(i%100);
                    btn.setText(nameOpening);

                }
            } else {
                String nameOpening="E" + String.valueOf(i%100);
                btn.setText(nameOpening);
                if (i % 100 < 10) {
                    nameOpening="E0" + String.valueOf(i%100);
                    btn.setText(nameOpening);
                }
            }
            btn.setOnClickListener(ecoCodeListener);
            ll.addView(btn, params);
        }
        EcoDBManager ecoDBManager=new EcoDBManager(this);
        SQLiteEcoHelper ecoHelper=new SQLiteEcoHelper(this);
        ecoDBManager.open();
        //beginning of eco code adds
        //A00
        if(!ecoDBManager.isExist(0)){
            ecoHelper.addEco(
                    "Irregular Openings",

                    "Irregular openings are usually considered somewhat weaker than standard openings if both players play \"perfectly\". An element that many irregular openings share in common to their favor, however, is that many players have not studied the resulting positions in depth. As such, they can be a useful tool when played intentionally, similar to chess traps, to throw the other player off their preferred openings they've prepared for and played many times, and force the game onto a path that only the irregular opening player has studied. This advantage can offset the theoretical weakness; even if the other player avoids any direct blunders, they may be forced to spend time deriving the correct move through personal analysis, rather than instantly knowing the \"correct\" reply from a memorized opening book. In the same way, such strategies could be effective against older and weaker computer chess programs from the 1980s and 1990s: a chess program that heavily relied on memorized opening books from games of top players could be set adrift quickly by an irregular opening, and forced to calculate moves for itself. Such tactics no longer work on modern chess programs, however, which are significantly stronger."
            );
        }

        if(!ecoDBManager.isExist(1)){
            ecoHelper.addEco(
                    "Irregular Openings",

                    "Irregular openings are usually considered somewhat weaker than standard openings if both players play \"perfectly\". An element that many irregular openings share in common to their favor, however, is that many players have not studied the resulting positions in depth. As such, they can be a useful tool when played intentionally, similar to chess traps, to throw the other player off their preferred openings they've prepared for and played many times, and force the game onto a path that only the irregular opening player has studied. This advantage can offset the theoretical weakness; even if the other player avoids any direct blunders, they may be forced to spend time deriving the correct move through personal analysis, rather than instantly knowing the \"correct\" reply from a memorized opening book. In the same way, such strategies could be effective against older and weaker computer chess programs from the 1980s and 1990s: a chess program that heavily relied on memorized opening books from games of top players could be set adrift quickly by an irregular opening, and forced to calculate moves for itself. Such tactics no longer work on modern chess programs, however, which are significantly stronger."
            );
        }

    }

}