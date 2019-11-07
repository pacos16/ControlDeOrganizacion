package com.pacosignes.controldeorganizacion.alumnos;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.pacosignes.controldeorganizacion.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements IAlumnoListener {
    private ArrayList<Alumno> alumnos;
    private ArrayList<Asignatura> asignaturas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumnos);
        final Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Alumnos");
        Parser parser=new Parser(this);
        parser.parse();
        alumnos=parser.getAlumnos();
        asignaturas= parser.getAsignaturas();
        FragmentListadoAlumnos fragmentAlumnos= (FragmentListadoAlumnos)getSupportFragmentManager()
                .findFragmentById(R.id.fragmentAlumnos);

        fragmentAlumnos.setAlumnos(alumnos);
        fragmentAlumnos.setListener(this);


    }

    @Override
    public void onAlumnoSeleccionado(int posicion) {


        boolean hayDetalle= false;//(getSupportFragmentManager().findFragmentById())!=null);
        if(hayDetalle){

        }else {
            Intent i=new Intent(this,NotasActivity.class);
            i.putExtra("alumno",alumnos.get(posicion));
            i.putExtra("asignaturas",asignaturas);
            startActivity(i);
        }
    }
}
