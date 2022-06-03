package com.example.py7.perpustakaan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class Register extends AppCompatActivity {

    TextView btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnSignIn = (TextView) findViewById(R.id.signIn);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    Intent intent = new Intent(com.example.py7.perpustakaan.Register.this, PeminjamanActivity.class);

                    com.example.py7.perpustakaan.Register.this.startActivity(intent);
                    finish();
            }
        });
    }
}