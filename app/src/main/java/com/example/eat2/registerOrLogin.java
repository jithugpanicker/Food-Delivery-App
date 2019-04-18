package com.example.eat2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registerOrLogin extends AppCompatActivity {
    private Button register;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_or_login);
        register=findViewById(R.id.register);
        login=findViewById(R.id.login);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Activity();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });


    }
    public void openMain2Activity(){
        Intent intent= new Intent(this,registration.class);
        startActivity(intent);

    }
    public void openLoginActivity(){
        Intent intent= new Intent(this,login.class);
        startActivity(intent);
}}
