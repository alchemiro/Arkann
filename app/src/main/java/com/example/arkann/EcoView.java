package com.example.arkann;

import static com.example.arkann.EcoBitmapUtils.decodeSampledBitmap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class EcoView extends AppCompatActivity {
    TextView openingText, openingName;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_view);
        openingName=findViewById(R.id.nameText);
        openingText=findViewById(R.id.explText);
        image=findViewById(R.id.imgView);
        EcoDBManager ecoDb=new EcoDBManager(this);
        ecoDb.open();
        Bundle bundle=getIntent().getExtras();
        if(bundle.isEmpty()){
            String errorString="error";
            Toast toast=Toast.makeText(this,errorString,Toast.LENGTH_LONG);
        }
        else{
            String ecoCode=bundle.getString("ecoCode");
            int id=bundle.getInt("id");
            openingText.setText(ecoDb.fetchTextById(id));
            openingName.setText(ecoDb.fetchNameByID(id));
            try {
                image.setImageBitmap(decodeSampledBitmap(EcoView.this,ecoCode));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}