package com.example.health.v7;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Locale;

import static android.content.Context.MODE_PRIVATE;


public class about extends android.support.v4.app.Fragment {

    String l;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_about, null);
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


    @Override
    public void onStart() {
        super.onStart();
        //loadLocale();
    }

    /*private void setLocale(String lang) {

        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
    }

    public void loadLocale(){

        SharedPreferences pref = getSharedPreferences("Settings",MODE_PRIVATE);
        String lang = pref.getString("my_lang","");
        setLocale(lang);

    }*/
}