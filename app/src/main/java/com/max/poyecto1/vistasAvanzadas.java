package com.max.poyecto1;
import com.max.poyecto1.Adapter.AdapterDatos;
import com.max.poyecto1.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class vistasAvanzadas extends AppCompatActivity {
    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_vistas_avanzadas);

        recycler=findViewById(R.id.recyclerId);
        //recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)); //una sola columna
        recycler.setLayoutManager(new GridLayoutManager(this,2));  //varias columnas

        listDatos=new ArrayList<String>();

        for (int i=0;i<=50;i++){
            listDatos.add("Dato #"+i+" ");
        }
        AdapterDatos adapter=new AdapterDatos(listDatos);
        recycler.setAdapter(adapter);
    }
}
