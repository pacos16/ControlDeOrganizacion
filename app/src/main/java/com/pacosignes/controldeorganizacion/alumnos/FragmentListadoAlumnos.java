package com.pacosignes.controldeorganizacion.alumnos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pacosignes.controldeorganizacion.R;

import java.util.ArrayList;


public class FragmentListadoAlumnos extends Fragment {
    private ArrayList<Alumno> alumnos;
    private IAlumnoListener listener;

    private RecyclerView rvListAlumnos;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list_alumnos,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        rvListAlumnos=getView().findViewById(R.id.rvAlumnos);

        RvAdapterAlumnos rvAdapterAlumnos= new RvAdapterAlumnos(this,alumnos,listener);
        rvListAlumnos.setAdapter(rvAdapterAlumnos);
        rvListAlumnos.setLayoutManager(new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL,false));


    }
    public void setAlumnos(ArrayList<Alumno> alumnos){
        this.alumnos=alumnos;
    }
    public void setListener(IAlumnoListener listener){
        this.listener=listener;
    }
}
