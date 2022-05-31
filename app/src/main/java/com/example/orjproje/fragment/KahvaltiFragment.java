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


public class KahvaltiFragment extends Fragment {
    ImageView yumurta;
    ImageView cay;
    ImageView ekmek;
    ImageView katmer;
    ImageView patates;
    ImageView peynir;
    ImageView recel;
    ImageView zeytin;
    ImageView bal;

    TextView peynirText;
    TextView zeytinText;
    TextView balText;
    TextView recelText;
    TextView katmerText;
    TextView patatesText;
    TextView yumurtaText;
    TextView cayText;
    TextView dilimEkmekText;
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
        return inflater.inflate(R.layout.fragment_kahvalti, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        yumurtaText = view.findViewById(R.id.yumurta);
        sonucText = view.findViewById(R.id.sonucText);
        yumurta = view.findViewById(R.id.imageYumurta);
        yumurta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) yumurtaText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        cayText = view.findViewById(R.id.cay);
        sonucText = view.findViewById(R.id.sonucText);
        cay = view.findViewById(R.id.imageCay);
        cay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) cayText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        dilimEkmekText = view.findViewById(R.id.ekmek);
        sonucText = view.findViewById(R.id.sonucText);
        ekmek = view.findViewById(R.id.imageEkmek);
        ekmek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) dilimEkmekText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        patatesText = view.findViewById(R.id.patates);
        sonucText = view.findViewById(R.id.sonucText);
        patates = view.findViewById(R.id.imagePatates);
        patates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) patatesText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        katmerText = view.findViewById(R.id.katmer);
        sonucText = view.findViewById(R.id.sonucText);
        katmer = view.findViewById(R.id.imageKatmer);
        katmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) katmerText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        peynirText = view.findViewById(R.id.peynir);
        sonucText = view.findViewById(R.id.sonucText);
        peynir = view.findViewById(R.id.imagePeynir);
        peynir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) peynirText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        recelText = view.findViewById(R.id.recel);
        sonucText = view.findViewById(R.id.sonucText);
        recel = view.findViewById(R.id.imageRecel);
        recel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) recelText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        zeytinText = view.findViewById(R.id.zeytin);
        sonucText = view.findViewById(R.id.sonucText);
        zeytin = view.findViewById(R.id.imageZeytin);
        zeytin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) zeytinText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        balText = view.findViewById(R.id.bal);
        sonucText = view.findViewById(R.id.sonucText);
        bal = view.findViewById(R.id.imageBal);
        bal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) balText.getText());
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