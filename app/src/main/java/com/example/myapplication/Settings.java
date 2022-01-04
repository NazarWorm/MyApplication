package com.example.myapplication;

public class Settings {

    public static boolean MASTER_VOLUME_MUTE = false;
    public static boolean SFX_VOLUME_MUTE = false;
    public static boolean MENU_VOLUME_MUTE = false;

    public static int MASTER_VOLUME = 100;
    public static int SFX_VOLUME = 100;
    public static int MENU_VOLUME = 100;

    public static int BEST_SCORE = 0;

    public static void resetSettings(){
        MASTER_VOLUME_MUTE = DefaultSettings.MASTER_VOLUME_MUTE;
        SFX_VOLUME_MUTE = DefaultSettings.SFX_VOLUME_MUTE;
        MENU_VOLUME_MUTE = DefaultSettings.MENU_VOLUME_MUTE;
        MASTER_VOLUME = DefaultSettings.MASTER_VOLUME;
        SFX_VOLUME = DefaultSettings.SFX_VOLUME;
        MENU_VOLUME = DefaultSettings.MENU_VOLUME;
    }

}
