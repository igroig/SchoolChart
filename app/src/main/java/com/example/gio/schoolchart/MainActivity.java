package com.example.gio.schoolchart;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public static final String devision = "+-+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public String getSharedString(String key) {
        return PreferenceManager.getDefaultSharedPreferences(MainActivity.this).getString(key, "");
    }

    public void setSharedString(String key, String value){
        PreferenceManager.getDefaultSharedPreferences(MainActivity.this).edit().putString(key, value);
    }
}
