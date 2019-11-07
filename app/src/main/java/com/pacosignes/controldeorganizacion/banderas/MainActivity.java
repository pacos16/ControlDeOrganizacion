package com.pacosignes.controldeorganizacion.banderas;

import android.os.Bundle;
import android.widget.ListView;
import com.pacosignes.controldeorganizacion.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private CountryParser countryParser;
    private CountryAdapter countryAdapter;
    private Country[] countries;
    private ListView lvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banderas);
        final Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Banderas");
        lvMain= findViewById(R.id.lvMain);
        countryParser=new CountryParser(this);
        countryParser.parse();
        countries=countryParser.getCountries();
        countryAdapter=new CountryAdapter(this,countries);

        lvMain.setAdapter(countryAdapter);
    }
}
