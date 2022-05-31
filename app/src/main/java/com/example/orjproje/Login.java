package com.example.orjproje;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    EditText loginmail;
    EditText loginpasw;
    Button btn3;
    TextView txt2;
    FirebaseAuth mauth;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginmail = findViewById(R.id.loginEmail);
        loginpasw = findViewById(R.id.edtPas2);
        btn3 = findViewById(R.id.btn3);
        txt2 = findViewById(R.id.textView2);
        mauth = FirebaseAuth.getInstance();
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginuser();
               // Intent sayfaIki = (new Intent(getApplicationContext(), Sayfa2.class));
             //   startActivity(sayfaIki);

            }
        });
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Register.class));

            }
        });



    }
        public void loginuser()
        {
            String email=loginmail.getText().toString();
            String password=loginpasw.getText().toString();
            if(TextUtils.isEmpty(email))
            {
                loginmail.setError("E-mail boş olamaz.");
                loginmail.requestFocus();
        }
            else if(TextUtils.isEmpty(password))
            {
                loginpasw.setError("Parola boş olamaz.");
                loginpasw.requestFocus();
            }
            else {
                mauth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(getApplicationContext(), "Kullanıcı Girişi Başarılı", Toast.LENGTH_SHORT).show();
                            //startActivity(new Intent(getApplicationContext(), MainActivity.class));
                          //  finish();
                            Intent sayfaIki = (new Intent(getApplicationContext(), Sayfa2.class));
                           startActivity(sayfaIki);

                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Kullanıcı girişi başarısız "+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }

                });


            }


    }
}