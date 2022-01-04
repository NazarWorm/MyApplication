package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPlay, btnGarage, btnSettings, btnUpgrades, btnImgRemove, btnImgChange, btnResetScore, btnSave;
    ImageButton btnMastermute, btnSFXMute, btnMenuMute;
    Slider masterVolumeBar, sfxVolumeBar, manuVolumeBar;
    Dialog d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //Opens dialog_settings as Dialog window
    public void openSettingsDialog(View view){
        d = new Dialog(this);
        d.setContentView(R.layout.dialog_settings);
        d.setCancelable(true);
        d.setTitle("Settings");

        btnImgRemove = ()

        d.show();
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnGarage){
            Intent intent = new Intent(this, Garage.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(this, Upgrades.class);
            startActivity(intent);
        }
    }

    public void startGame(View view){
        Toast.makeText(this, "Game Started", Toast.LENGTH_SHORT).show();
    }
}