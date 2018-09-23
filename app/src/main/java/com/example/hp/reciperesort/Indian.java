package com.example.hp.reciperesort;

import android.content.Intent;
import android.icu.util.IndianCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Indian extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);
        ImageButton hyd = (ImageButton) findViewById(R.id.hyd);
        ImageButton med = (ImageButton) findViewById(R.id.med);
        ImageButton dho = (ImageButton) findViewById(R.id.dho);
        ImageButton nee = (ImageButton) findViewById(R.id.nee);
        ImageButton dal = (ImageButton) findViewById(R.id.dal);
        ImageButton hom = (ImageButton) findViewById(R.id.hom);
        hyd.setOnClickListener(this);
        med.setOnClickListener(this);
        dho.setOnClickListener(this);
        nee.setOnClickListener(this);
        dal.setOnClickListener(this);
        hom.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hyd:
                startActivity(new Intent(Indian.this, HyderabadiBiryani.class));
                break;
            case R.id.med:
                startActivity(new Intent(Indian.this, MedhuVada.class));
                break;
            case R.id.dho:
                startActivity(new Intent(Indian.this, Dhokla.class));
                break;
            case R.id.nee:
                startActivity(new Intent(Indian.this, NeerDosa.class));
                break;
            case R.id.dal:
                startActivity(new Intent(Indian.this, DalMakhni.class));
                break;
            case R.id.hom:
                startActivity(new Intent(Indian.this, Home2Activity.class));
                break;

        }

    }


}