package com.example.proyectosoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btniniciosesion;
    Button btnRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btniniciosesion= findViewById(R.id.btn_ingresar);
        btnRegistro= findViewById(R.id.btn_registro);

        btniniciosesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,MenuActivity.class);
                startActivity(i);
            }
        });

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(MainActivity.this,ResgitroActivity.class);
                startActivity(a);
            }
        });

    }
}