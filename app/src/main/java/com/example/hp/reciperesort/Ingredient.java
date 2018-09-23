
package com.example.hp.reciperesort;

import android.content.Intent;
import android.icu.util.IndianCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Ingredient extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient);
        ImageButton bat = (ImageButton) findViewById(R.id.bat);
        ImageButton til = (ImageButton) findViewById(R.id.til);
        ImageButton bas = (ImageButton) findViewById(R.id.bas);
        ImageButton gob = (ImageButton) findViewById(R.id.gob);
        ImageButton peps = (ImageButton) findViewById(R.id.peps);
        ImageButton hom = (ImageButton) findViewById(R.id.hom);
        bat.setOnClickListener(this);
        til.setOnClickListener(this);
        bas.setOnClickListener(this);
        gob.setOnClickListener(this);
        peps.setOnClickListener(this);
        hom.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bat:
                startActivity(new Intent(Ingredient.this, BatataVada.class));
                break;
            case R.id.til:
                startActivity(new Intent(Ingredient.this, TilePaneer.class));
                break;
            case R.id.bas:
                startActivity(new Intent(Ingredient.this, BasilTomatoSoup.class));
                break;
            case R.id.gob:
                startActivity(new Intent(Ingredient.this, GobiMasaledar.class));
                break;
            case R.id.peps:
                startActivity(new Intent(Ingredient.this, PepperSalad.class));
                break;
            case R.id.hom:
                startActivity(new Intent(Ingredient.this, Home2Activity.class));
                break;




        }

    }


}