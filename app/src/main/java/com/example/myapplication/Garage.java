package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Garage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);
    }

    public void returnToMainActivity(View view){
        finish();
    }

    public void switchedCar(View view){
        if(view.getId() == R.id.btnNext){
            Toast.makeText(this, "Switched to the next car", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Switched to the previous car", Toast.LENGTH_SHORT).show();
        }
    }

    public void carSelected(View view){
        Toast.makeText(this, "Car Selected", Toast.LENGTH_SHORT).show();
    }

}