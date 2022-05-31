package com.example.orjproje;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.orjproje.fragment.AksamYemegiFragment;
import com.example.orjproje.fragment.KahvaltiFragment;
import com.example.orjproje.fragment.OgleYemegiFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Sayfa2 extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    //bottom navigation view kütüphanesini kullanarak bar oluşturduk
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfa2);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.kahvalti);
    }
    KahvaltiFragment kahvaltiFragment = new KahvaltiFragment();
    OgleYemegiFragment ogleYemegiFragment = new OgleYemegiFragment();
    AksamYemegiFragment aksamYemegiFragment = new AksamYemegiFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.kahvalti:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, kahvaltiFragment).commit();
                return true;

            case R.id.ogleYemegi:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, ogleYemegiFragment).commit();
                return true;

            case R.id.aksamYemegi:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, aksamYemegiFragment).commit();
                return true;
        }
        return false;
    }
}