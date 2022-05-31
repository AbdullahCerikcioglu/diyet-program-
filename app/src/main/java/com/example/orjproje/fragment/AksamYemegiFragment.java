package com.example.orjproje.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.orjproje.R;

public class AksamYemegiFragment extends Fragment {

    ImageView imageetliekmek;
    ImageView imagesalata;
    ImageView imagesebzeyemegi;
    ImageView imagebalik;
    ImageView imagekarniyarik;
    ImageView imagekurufasulye;
    ImageView imagemeyve;
    ImageView imageet;
    ImageView imagepilav;

    TextView etliekmek;
    TextView salata;
    TextView sebze;
    TextView balik;
    TextView karniyarik;
    TextView kurufasulye;
    TextView meyve;
    TextView et;
    TextView pilav;
    TextView sonucText;
    TextView textview6;
    TextView textview7;
    int sonuc=0;
    int sonuc2=0;
    int kalori=2300;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aksam_yemegi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        imageetliekmek = view.findViewById(R.id.imageetliekmek);
        etliekmek = view.findViewById(R.id.etliekmek);
        sonucText = view.findViewById(R.id.sonucText);
        imageetliekmek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) etliekmek.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        salata = view.findViewById(R.id.salata);
        sonucText = view.findViewById(R.id.sonucText);
        imagesalata = view.findViewById(R.id.imagesalataAksam);
        imagesalata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) salata.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        sebze = view.findViewById(R.id.sebzeyemegi);
        sonucText = view.findViewById(R.id.sonucText);
        imagesebzeyemegi = view.findViewById(R.id.imagesebzeyemegi);
        imagesebzeyemegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) sebze.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        balik = view.findViewById(R.id.balik);
        sonucText = view.findViewById(R.id.sonucText);
        imagebalik = view.findViewById(R.id.imagebalik);
        imagebalik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) balik.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        karniyarik = view.findViewById(R.id.karniyarik);
        sonucText = view.findViewById(R.id.sonucText);
        imagekarniyarik = view.findViewById(R.id.imagekarniyarik);
        imagekarniyarik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) karniyarik.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        kurufasulye = view.findViewById(R.id.kurufasulye);
        sonucText = view.findViewById(R.id.sonucText);
        imagekurufasulye = view.findViewById(R.id.imagekurufasulye);
        imagekurufasulye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) kurufasulye.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        meyve = view.findViewById(R.id.meyve);
        sonucText = view.findViewById(R.id.sonucText);
        imagemeyve = view.findViewById(R.id.imagemeyveAksam);
        imagemeyve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) meyve.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        et = view.findViewById(R.id.et);
        sonucText = view.findViewById(R.id.sonucText);
        imageet = view.findViewById(R.id.imageet);
        imageet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) et.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        pilav = view.findViewById(R.id.pilav);
        sonucText = view.findViewById(R.id.sonucText);
        imagepilav = view.findViewById(R.id.imagepilav);
        imagepilav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) pilav.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        textview6 = view.findViewById(R.id.textView6);
        textview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                sonuc2 = kalori - sonuc;
                textview6.setText(String.valueOf(sonuc2));

            }
        });
        textview7 = view.findViewById(R.id.textView7);
        textview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                sonuc  =0;
                sonuc2 =0;
                sonucText.setText(String.valueOf(sonuc));
                textview6.setText("Kalan kalori için tıklayınız");
            }
        });
    }
}