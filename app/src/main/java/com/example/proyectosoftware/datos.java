package com.example.proyectosoftware;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class datos extends AppCompatActivity {

    FragmentTransaction transaction;
    Fragment fragmentInicio_datos, fragment_listaEstudi, fragment_listaEstadistica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        fragmentInicio_datos = new Inicio_datosFragment();
        fragment_listaEstudi= new ListaEstudiantesFragment();
        fragment_listaEstadistica= new EstadisticaFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragments,fragmentInicio_datos).commit();

    }

    public void OnClick(View view){
        transaction= getSupportFragmentManager().beginTransaction();

        switch (view.getId()){


            case R.id.button12:transaction.replace(R.id.contenedorFragments,fragment_listaEstudi).commit();
                break;
            case R.id.button13:transaction.replace(R.id.contenedorFragments,fragment_listaEstadistica).commit();
                break;


        }



    }
}