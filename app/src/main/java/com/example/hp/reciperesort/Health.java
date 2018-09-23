package com.example.hp.reciperesort;

import android.content.Intent;
import android.icu.util.IndianCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Health extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        ImageButton bro = (ImageButton) findViewById(R.id.bro);
        ImageButton hon = (ImageButton) findViewById(R.id.hon);
        ImageButton whi = (ImageButton) findViewById(R.id.whi);
        ImageButton pep = (ImageButton) findViewById(R.id.pep);
        ImageButton cel = (ImageButton) findViewById(R.id.cel);
        ImageButton hom = (ImageButton) findViewById(R.id.hom);
        bro.setOnClickListener(this);
        hon.setOnClickListener(this);
        whi.setOnClickListener(this);
        pep.setOnClickListener(this);
        cel.setOnClickListener(this);
        hom.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bro:
                startActivity(new Intent(Health.this, BrocolliOmelette.class));
                break;
            case R.id.hon:
                startActivity(new Intent(Health.this, HoneyGrapefruit.class));
                break;
            case R.id.whi:
                startActivity(new Intent(Health.this, WhiteBean.class));
                break;
            case R.id.pep:
                startActivity(new Intent(Health.this, PepperChicken.class));
                break;
            case R.id.cel:
                startActivity(new Intent(Health.this, CelerySoup.class));
                break;
            case R.id.hom:
                startActivity(new Intent(Health.this, Home2Activity.class));
                break;

        }

    }


}