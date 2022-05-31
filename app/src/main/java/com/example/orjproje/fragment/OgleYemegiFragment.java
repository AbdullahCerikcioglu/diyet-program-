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


public class OgleYemegiFragment extends Fragment {

    ImageView tavukdoner;
    ImageView hamburger;
    ImageView corba;
    ImageView guvec;
    ImageView pizza;
    ImageView kuruyemis;
    ImageView meyve;
    ImageView iskender;
    ImageView salata;

    TextView tavukdonerText;
    TextView hamburgerText;
    TextView corbaText;
    TextView guvecText;
    TextView pizzaText;
    TextView kuruyemisText;
    TextView meyveText;
    TextView iskenderText;
    TextView salataText;
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
        return inflater.inflate(R.layout.fragment_ogle_yemegi , container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        tavukdonerText = view.findViewById(R.id.tavukdoner);
        sonucText = view.findViewById(R.id.sonucText);
        tavukdoner = view.findViewById(R.id.imageYumurta);
        tavukdoner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) tavukdonerText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        hamburgerText = view.findViewById(R.id.hamburger);
        sonucText = view.findViewById(R.id.sonucText);
        hamburger = view.findViewById(R.id.imageCay);
        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) hamburgerText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        corbaText = view.findViewById(R.id.corba);
        sonucText = view.findViewById(R.id.sonucText);
        corba = view.findViewById(R.id.imageEkmek);
        corba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) corbaText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        guvecText = view.findViewById(R.id.guvec);
        sonucText = view.findViewById(R.id.sonucText);
        guvec = view.findViewById(R.id.imagePatates);
        guvec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) guvecText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        pizzaText = view.findViewById(R.id.pizza);
        sonucText = view.findViewById(R.id.sonucText);
        pizza = view.findViewById(R.id.imageKatmer);
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) pizzaText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        kuruyemisText = view.findViewById(R.id.kuruyemis);
        sonucText = view.findViewById(R.id.sonucText);
        kuruyemis = view.findViewById(R.id.imagePeynir);
        kuruyemis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) kuruyemisText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        meyveText = view.findViewById(R.id.meyve);
        sonucText = view.findViewById(R.id.sonucText);
        meyve = view.findViewById(R.id.imageRecel);
        meyve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) meyveText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        iskenderText = view.findViewById(R.id.iskender);
        sonucText = view.findViewById(R.id.sonucText);
        iskender = view.findViewById(R.id.imageZeytin);
        iskender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) iskenderText.getText());
                sonucText.setText(String.valueOf(sonuc));
            }
        });
        salataText = view.findViewById(R.id.salata);
        sonucText = view.findViewById(R.id.sonucText);
        salata = view.findViewById(R.id.imageBal);
        salata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc+=Integer.parseInt((String) salataText.getText());
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