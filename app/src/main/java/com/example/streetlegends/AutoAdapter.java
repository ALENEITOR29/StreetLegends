package com.example.streetlegends;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AutoAdapter extends RecyclerView.Adapter<AutoAdapter.AutoViewHolder> {
    private final String[] nombres = {
        "Skyline GT-R R34", "Supra MK4", "Mazda RX-7",
        "Honda NSX", "Lancer Evolution IX", "Impreza WRX STI"
    };
    private final String[] marcas = {"NISSAN", "TOYOTA", "MAZDA", "HONDA", "MITSUBISHI", "SUBARU"};
    private final String[] datos = {
        "1999–2002  •  Deportivo japonés", "1993–2002  •  Motor 2JZ",
        "1992–2002  •  Motor rotativo", "1990–2005  •  Motor V6",
        "2005–2007  •  Tracción integral", "2004–2007  •  Inspirado en rally"
    };
    private final int[] imagenes = {
        R.drawable.skyline, R.drawable.supra, R.drawable.rx7,
        R.drawable.nsx, R.drawable.evo, R.drawable.subaru
    };

    @NonNull @Override
    public AutoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_auto, parent, false);
        return new AutoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AutoViewHolder holder, int position) {
        holder.txtNombre.setText(nombres[position]);
        holder.txtMarca.setText(marcas[position]);
        holder.txtDatos.setText(datos[position]);
        holder.imgAuto.setImageResource(imagenes[position]);
    }

    @Override public int getItemCount() { return nombres.length; }

    static class AutoViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAuto;
        TextView txtNombre, txtMarca, txtDatos;
        AutoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAuto = itemView.findViewById(R.id.imgAuto);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtMarca = itemView.findViewById(R.id.txtMarca);
            txtDatos = itemView.findViewById(R.id.txtDatos);
        }
    }
}
