package com.actividad4.proyecto_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Item> listaActividades = new ArrayList<>();
        listaActividades.add(new Item(true, "TAREA 1", "Desarrollo de software", Item.TipoActividad.TRABAJO, Item.EstatusActividad.PENDIENTE));
        listaActividades.add(new Item(false, "TAREA 2", "Tareas domésticas", Item.TipoActividad.CASA, Item.EstatusActividad.PENDIENTE));
        listaActividades.add(new Item(true, "TAREA 3", "Desarrollo de software", Item.TipoActividad.TRABAJO, Item.EstatusActividad.PENDIENTE));
        listaActividades.add(new Item(false, "TAREA 4", "Tareas domésticas", Item.TipoActividad.CASA, Item.EstatusActividad.PENDIENTE));
        listaActividades.add(new Item(true, "TAREA 5", "Desarrollo de software", Item.TipoActividad.TRABAJO, Item.EstatusActividad.PENDIENTE));
        listaActividades.add(new Item(false, "TAREA 6", "Tareas domésticas", Item.TipoActividad.CASA, Item.EstatusActividad.PENDIENTE));
        listaActividades.add(new Item(true, "TAREA 7", "Desarrollo de software", Item.TipoActividad.TRABAJO, Item.EstatusActividad.COMPLETADA));
        listaActividades.add(new Item(false, "TAREA 8", "Tareas domésticas", Item.TipoActividad.CASA, Item.EstatusActividad.COMPLETADA));
        listaActividades.add(new Item(true, "TAREA 9", "Desarrollo de software", Item.TipoActividad.TRABAJO, Item.EstatusActividad.COMPLETADA));
        listaActividades.add(new Item(false, "TAREA 10", "Tareas domésticas", Item.TipoActividad.CASA, Item.EstatusActividad.COMPLETADA));
        listaActividades.add(new Item(true, "TAREA 11", "Desarrollo de software", Item.TipoActividad.TRABAJO, Item.EstatusActividad.COMPLETADA));
        listaActividades.add(new Item(false, "TAREA 12", "Tareas domésticas", Item.TipoActividad.CASA, Item.EstatusActividad.COMPLETADA));

        List<Item> listaPendientes = listaActividades.stream()
                .filter(item -> item.getEstatus() == Item.EstatusActividad.PENDIENTE) // o .equals si es una cadena
                .collect(Collectors.toList());
        RecyclerView recyclerViewP = findViewById(R.id.myRecyclerViewP);
        recyclerViewP.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(listaPendientes);
        recyclerViewP.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        List<Item> listaCompletada = listaActividades.stream()
                .filter(item -> item.getEstatus() == Item.EstatusActividad.COMPLETADA) // o .equals si es una cadena
                .collect(Collectors.toList());
        RecyclerView recyclerViewC = findViewById(R.id.myRecyclerViewC);
        recyclerViewC.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapterC = new MyAdapter(listaCompletada);
        recyclerViewC.setAdapter(adapterC);
        adapterC.notifyDataSetChanged();

        Button botonAbrir = findViewById(R.id.botonAbrir);
        botonAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}