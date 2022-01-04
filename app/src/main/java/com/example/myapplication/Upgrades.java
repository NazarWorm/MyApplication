package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Upgrades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrades);
    }

    public void returnToMainActivity(View view){
        finish();
    }

    public void upgraded(View view){
        if(view.getId() == R.id.btnBoost){
            Toast.makeText(this, "Boost Ability Upgraded", Toast.LENGTH_SHORT).show();
        }else if(view.getId() == R.id.btnGhost){
            Toast.makeText(this, "Ghost Ability Upgraded", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Gold Rush Ability Upgraded", Toast.LENGTH_SHORT).show();
        }
    }

}