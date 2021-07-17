package com.example.lightdarkmodedemo;

import android.content.Context;
import android.content.SharedPreferences;

public class SaveState {
    Context context;
    SharedPreferences sharedPreferences;

    public SaveState(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("preferences",Context.MODE_PRIVATE);
    }
    public void setState(boolean bValue){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("bkey",bValue);
        editor.apply();
    }
    public boolean getState(){
        return sharedPreferences.getBoolean("bkey",false);
    }
}
