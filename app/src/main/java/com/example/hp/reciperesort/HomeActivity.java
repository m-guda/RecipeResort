package com.example.hp.reciperesort;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button cui = (Button) findViewById(R.id.cui);
        Button ing = (Button) findViewById(R.id.ing);
        Button hea = (Button) findViewById(R.id.hea);
        Button fes = (Button) findViewById(R.id.fes);
        cui.setOnClickListener(this);
        ing.setOnClickListener(this);
        hea.setOnClickListener(this);
        fes.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cui:
                startActivity(new Intent(HomeActivity.this, CheesePizza.class));
                break;
            case R.id.ing:
                startActivity(new Intent(HomeActivity.this, FocaciaBread.class));
                break;
            case R.id.hea:
                startActivity(new Intent(HomeActivity.this, TempuraPrawns.class));
                break;
            case R.id.fes:
                startActivity(new Intent(HomeActivity.this, Festival.class));
                break;

        }

    }


}