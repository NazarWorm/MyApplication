package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.slider.Slider;

import java.util.Set;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    //Creating Variables
    Button btnPlay, btnGarage, btnSettings, btnUpgrades, btnImgRemove, btnImgChange, btnResetScore, btnSave;
    ImageButton btnMasterMute, btnSFXMute, btnMenuMute;
    SeekBar masterVolumeBar, sfxVolumeBar, menuVolumeBar;
    Dialog d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Opens Settings Window/Dialog
    public void openSettingsDialog(View view){
        //Creating Dialog
        d = new Dialog(this);
        //Setting Dialogs Layout
        d.setContentView(R.layout.dialog_settings);
        //Setting Dialog Properties
        d.setCancelable(true);
        d.setTitle("Settings");

        //Declaring Buttons And SeekBars In The Dialog Window
        btnImgRemove = (Button)d.findViewById(R.id.btnImgRemove);
        btnImgChange = (Button)d.findViewById(R.id.btnImgChange);
        btnResetScore = (Button)d.findViewById(R.id.btnResetScore);
        btnSave = (Button)d.findViewById(R.id.btnSave);
        btnMasterMute = (ImageButton) d.findViewById(R.id.btnMasterMute);
        btnSFXMute = (ImageButton) d.findViewById(R.id.btnSFXMute);
        btnMenuMute = (ImageButton) d.findViewById(R.id.btnMenuMute);
        masterVolumeBar = (SeekBar) d.findViewById(R.id.masterVolumeBar);
        sfxVolumeBar = (SeekBar) d.findViewById(R.id.sfxVolumeBar);
        menuVolumeBar = (SeekBar) d.findViewById(R.id.menuVolumeBar);

        //Setting Dialog Buttons OnClick
        btnImgRemove.setOnClickListener(this::dialogOnClick);
        btnImgChange.setOnClickListener(this::dialogOnClick);
        btnResetScore.setOnClickListener(this::dialogOnClick);
        btnSave.setOnClickListener(this::dialogOnClick);
        btnMasterMute.setOnClickListener(this::dialogOnClick);
        btnSFXMute.setOnClickListener(this::dialogOnClick);
        btnMenuMute.setOnClickListener(this::dialogOnClick);

        masterVolumeBar.setOnSeekBarChangeListener(this);
        sfxVolumeBar.setOnSeekBarChangeListener(this);
        menuVolumeBar.setOnSeekBarChangeListener(this);

        //Showing Dialog
        d.show();
    }

    //Switching Between Main, Garage and Upgrade Activities
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

    //Starts The Game
    public void startGame(View view){
        Toast.makeText(this, "Game Started", Toast.LENGTH_SHORT).show();
    }

    //Responds To Dialog Buttons Clicked
    public void dialogOnClick(View view){
        switch (view.getId()){
            //Master Volume Mute
            case R.id.btnMasterMute:
                    Settings.MASTER_VOLUME_MUTE = !Settings.MASTER_VOLUME_MUTE;
                    Toast.makeText(this, "Master Volume Muted : " + Settings.MASTER_VOLUME_MUTE, Toast.LENGTH_SHORT).show();
                Log.d("VOLUME", "Master");
                break;
            //SFX Volume Mute
            case R.id.btnSFXMute:
                Settings.SFX_VOLUME_MUTE = !Settings.SFX_VOLUME_MUTE;
                Toast.makeText(this, "SFX Volume Muted : " + Settings.SFX_VOLUME_MUTE, Toast.LENGTH_SHORT).show();
                Log.d("VOLUME", "SFX");
                break;
            //Menu Volume Mute
            case R.id.btnMenuMute:
                Settings.MENU_VOLUME_MUTE = !Settings.MENU_VOLUME_MUTE;
                Toast.makeText(this, "Menu Volume Muted : " + Settings.MENU_VOLUME_MUTE, Toast.LENGTH_SHORT).show();
                Log.d("VOLUME", "Menu");
                break;
        }
    }

    //Responds To Dialog SeekBars Changes
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}