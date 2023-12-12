package com.actividad4.proyecto_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Spinner miSpinner = findViewById(R.id.miSpinner);
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,
                R.array.opcionuno_spinner, android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        miSpinner.setAdapter(adaptador);

        Spinner miSpinner2 = findViewById(R.id.miSpinner2);
        ArrayAdapter<CharSequence> adaptador2 = ArrayAdapter.createFromResource(this,
                R.array.opciondos_spinner, android.R.layout.simple_spinner_item);
        adaptador2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        miSpinner2.setAdapter(adaptador2);

        Button botonRegresar = findViewById(R.id.botonRegresar);
        botonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}