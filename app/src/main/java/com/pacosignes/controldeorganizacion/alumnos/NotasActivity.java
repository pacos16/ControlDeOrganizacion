package com.pacosignes.controldeorganizacion.alumnos;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.pacosignes.controldeorganizacion.R;

import java.util.ArrayList;


public class NotasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        final Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Notas");


        Alumno alumno=(Alumno) getIntent().getSerializableExtra("alumno");
        ArrayList<Asignatura> asignaturas=(ArrayList<Asignatura>)
                getIntent().getSerializableExtra("asignaturas");


        FragmentListadoAsignaturas fragment=
                (FragmentListadoAsignaturas) getSupportFragmentManager().findFragmentById(R.id.fragmentNotas);

        fragment.setAlumno(alumno);
        fragment.setAsignaturas(asignaturas);


    }


}
