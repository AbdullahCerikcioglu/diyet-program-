package com.example.orjproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class  MainActivity extends AppCompatActivity {

    Button btn;
    FirebaseAuth mauth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.logoutButton);
        mauth= FirebaseAuth.getInstance();
        btn.setOnClickListener(view -> {
            mauth.signOut();
            startActivity(new Intent(getApplicationContext(), Register.class));
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mauth.getCurrentUser();
        if (user == null)
        {
            startActivity(new Intent(MainActivity.this, Login.class));
        }
    }
}