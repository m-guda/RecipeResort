package com.example.hp.reciperesort;

import android.content.Intent;
import android.icu.util.IndianCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class World extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world);
        ImageButton mar = (ImageButton) findViewById(R.id.mar);
        ImageButton tem = (ImageButton) findViewById(R.id.tem);
        ImageButton foc = (ImageButton) findViewById(R.id.foc);
        ImageButton hot = (ImageButton) findViewById(R.id.hot);
        ImageButton che = (ImageButton) findViewById(R.id.che);
        ImageButton hom = (ImageButton) findViewById(R.id.hom);
        mar.setOnClickListener(this);
        tem.setOnClickListener(this);
        foc.setOnClickListener(this);
        hot.setOnClickListener(this);
        che.setOnClickListener(this);
        hom.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mar:
                startActivity(new Intent(World.this, CheesePizza.class));
                break;
            case R.id.tem:
                startActivity(new Intent(World.this, TempuraPrawns.class));
                break;
            case R.id.foc:
                startActivity(new Intent(World.this, FocaciaBread.class));
                break;
            case R.id.hot:
                startActivity(new Intent(World.this, HotnSour.class));
                break;
            case R.id.che:
                startActivity(new Intent(World.this, CheeseSouffle.class));
                break;
            case R.id.hom:
                startActivity(new Intent(World.this, Home2Activity.class));
                break;




        }

    }


}