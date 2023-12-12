package com.actividad4.proyecto_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Item> listaActividades = new ArrayList<>();
        listaActividades.add(new Item(true, "Trabajo en proyecto", "Desarrollo de software", Item.TipoActividad.TRABAJO, Item.EstatusActividad.PENDIENTE));
        listaActividades.add(new Item(false, "Limpieza de casa", "Tareas domésticas", Item.TipoActividad.CASA, Item.EstatusActividad.COMPLETADA));

        // En tu actividad o fragmento
        RecyclerView recyclerView = findViewById(R.id.myRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(listaActividades);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}