package com.example.hp.reciperesort;

import android.content.Intent;
import android.icu.util.IndianCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Festival extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival);
        ImageButton alm = (ImageButton) findViewById(R.id.alm);
        ImageButton pis = (ImageButton) findViewById(R.id.pis);
        ImageButton coi = (ImageButton) findViewById(R.id.coi);
        ImageButton aam = (ImageButton) findViewById(R.id.aam);
        ImageButton sha = (ImageButton) findViewById(R.id.sha);
        ImageButton hom = (ImageButton) findViewById(R.id.hom);
        alm.setOnClickListener(this);
        pis.setOnClickListener(this);
        coi.setOnClickListener(this);
        aam.setOnClickListener(this);
        sha.setOnClickListener(this);
        hom.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.alm:
                startActivity(new Intent(Festival.this, AlmondKulfi.class));
                break;
            case R.id.pis:
                startActivity(new Intent(Festival.this, PistaPhirni.class));
                break;
            case R.id.coi:
                startActivity(new Intent(Festival.this, Cointreau.class));
                break;
            case R.id.aam:
                startActivity(new Intent(Festival.this, AamShrikhand.class));
                break;
            case R.id.sha:
                startActivity(new Intent(Festival.this, ShahiTukda.class));
                break;
            case R.id.hom:
                startActivity(new Intent(Festival.this, Home2Activity.class));
                break;


        }

    }


}