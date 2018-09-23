package com.example.hp.reciperesort;

import android.content.Intent;
import android.icu.util.IndianCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Cuisine extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine);
        ImageButton wor = (ImageButton) findViewById(R.id.wor);
        ImageButton ind = (ImageButton) findViewById(R.id.ind);
        ImageButton hom = (ImageButton) findViewById(R.id.hom);

        wor.setOnClickListener(this);
        ind.setOnClickListener(this);
        hom.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.wor:
                startActivity(new Intent(Cuisine.this, World.class));
                break;
            case R.id.ind:
                startActivity(new Intent(Cuisine.this, Indian.class));
                break;
            case R.id.hom:
                startActivity(new Intent(Cuisine.this, Home2Activity.class));
                break;



        }

    }


}