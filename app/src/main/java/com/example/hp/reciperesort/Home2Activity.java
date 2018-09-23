package com.example.hp.reciperesort;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home2Activity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        ImageButton cui = (ImageButton) findViewById(R.id.cui);
        ImageButton hea = (ImageButton) findViewById(R.id.hea);
        ImageButton sta = (ImageButton) findViewById(R.id.sta);
        ImageButton des = (ImageButton) findViewById(R.id.des);
        ImageButton tip = (ImageButton) findViewById(R.id.tip);


        cui.setOnClickListener(this);
        sta.setOnClickListener(this);
        hea.setOnClickListener(this);
        des.setOnClickListener(this);
        tip.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cui:
                startActivity(new Intent(Home2Activity.this, Cuisine.class));
                break;
            case R.id.sta:
                startActivity(new Intent(Home2Activity.this, Ingredient.class));
                break;
            case R.id.hea:
                startActivity(new Intent(Home2Activity.this, Health.class));
                break;
            case R.id.des:
                startActivity(new Intent(Home2Activity.this, Festival.class));
                break;
            case R.id.tip:
                startActivity(new Intent(Home2Activity.this, Tips.class));
                break;

        }

    }


}