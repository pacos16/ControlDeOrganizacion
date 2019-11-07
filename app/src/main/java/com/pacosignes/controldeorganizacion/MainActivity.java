package com.pacosignes.controldeorganizacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    MenuItem miSaludar;
    MenuItem miDespedir;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case(R.id.miSaludar):
                Intent intent=new Intent(this, com.pacosignes.controldeorganizacion.banderas.MainActivity.class);
                startActivity(intent);
                return true;
            case(R.id.miDespedir):
                Intent intent1=new Intent(this,com.pacosignes.controldeorganizacion.alumnos.MainActivity.class);
                startActivity(intent1);
                return true;
                default:
                    return false;



        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        final Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        miSaludar=findViewById(R.id.miSaludar);


        button= findViewById(R.id.button);
        button.setText("Ocultar");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionBar ab= getSupportActionBar();
                if (ab.isShowing()){
                    button.setText("Mostrar");
                    ab.hide();
                }else{
                    button.setText("Ocultar");
                    ab.show();
                }
            }
        });



    }
}
