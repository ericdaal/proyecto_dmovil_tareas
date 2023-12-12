package com.actividad4.proyecto_v1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    // ... Constructor, variables, etc.
    private List<Item> items;

    public MyAdapter(List<Item> items) {
        this.items = items;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(itemView);
    }
    public void eliminarItem(int position) {
        items.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Item item = items.get(position);
        holder.deleteButton.setOnClickListener(view -> {
            int positionActual = holder.getAdapterPosition();
            if (positionActual != RecyclerView.NO_POSITION) {
                eliminarItem(positionActual);
            }
        });

        holder.openButton.setOnClickListener(view -> {
            // Manejar clic en botón Abrir
        });
        holder.infoTextView.setText(item.getNombre());
        holder.infoTextView.setOnClickListener(view -> {
            // Manejar clic en TextView
        });
    }

    @Override
    public int getItemCount() {
        // Retorna el número total de elementos
        return items.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        Button deleteButton, openButton;
        TextView infoTextView;

        MyViewHolder(View view) {
            super(view);
            deleteButton = view.findViewById(R.id.deleteButton);
            openButton = view.findViewById(R.id.openButton);
            infoTextView = view.findViewById(R.id.infoTextView);
        }
    }
}
