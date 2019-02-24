package com.example.health.v7;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class settings extends AppCompatActivity {

    Button en,hi,ta;
    String l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadLocale();
        setContentView(R.layout.activity_settings);
        en = findViewById(R.id.button12);
        hi = findViewById(R.id.button13);
        ta = findViewById(R.id.button14);
        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setLocale("en");
                newintent(l);

            }
        });

        hi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                setLocale("hi");
                newintent(l);

            }
        });

        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setLocale("ta");
                newintent(l);
            }
        });

    }

    private void newintent(String l) {

        Intent back = new Intent(this,HomePage.class);
        back.putExtra("locale",l);
        startActivity(back);

    }

    private void setLocale(String lang) {

        l = lang;
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings",MODE_PRIVATE).edit();
        editor.putString("my_lang",lang);
        editor.apply();

    }

    public void loadLocale(){

        SharedPreferences pref = getSharedPreferences("Settings",Activity.MODE_PRIVATE);
        String lang = pref.getString("my_lang","");
        setLocale(lang);

    }

}
