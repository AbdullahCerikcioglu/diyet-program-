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

public class Register extends AppCompatActivity {

    EditText edtmail;
    EditText edtpasw;
    Button btn2;
    FirebaseAuth mauth;
    TextView textView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtmail = findViewById(R.id.edtmail);
        edtpasw = findViewById(R.id.edtpas);
        btn2 = findViewById(R.id.btn2);
        mauth = FirebaseAuth.getInstance();
        textView = findViewById(R.id.textView);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createUser();
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Login.class));
            }
        });
    }

        public void createUser()
        {
            String email= edtmail.getText().toString();
            String password=edtpasw.getText().toString();
            if(TextUtils.isEmpty(email))
            {
                edtmail.setError("E posta boş olamaz.");
                edtmail.requestFocus();
            }
            else if(TextUtils.isEmpty(password))
            {
                edtmail.setError("Şifre Boş olamaz");
                edtmail.requestFocus();
            }
            else {
                mauth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(getApplicationContext(), "Kayıt Başarılı", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), Login.class));
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "Kayıt Başarısız:"+task.getException(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }



        }



    }
