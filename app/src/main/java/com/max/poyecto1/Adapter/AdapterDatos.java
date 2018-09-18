package com.max.poyecto1.Adapter;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.max.poyecto1.R;
import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {
    ArrayList<String>listDatos;

    public AdapterDatos(ArrayList<String> listDatos) {
        this.listDatos = listDatos;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardvew,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.asignarDatos(listDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {  //Se da referencia de lo que se va a presentar en el recycler
        private TextView dato;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            dato=itemView.findViewById(R.id.dato);
        }

        public void asignarDatos(String datos) {
            dato.setText(datos);
        }
    }
}
