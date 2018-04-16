package com.example.usuari.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActivityShow extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent intent = this.getIntent();
        list = (ListView) this.findViewById(R.id.lvAll);
        AccesoFichero af=new AccesoFichero(this,"contacto.txt");
        final ArrayList<String> notas=af.recuperar();
        ArrayAdapter<String> adapter= new
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, notas);
        list.setAdapter(adapter);
        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {
                    @Override
                    public void
                    onItemClick(AdapterView<?> parent,
                                View view, int position, long id) {
                        Toast.makeText(ActivityShow.this, notas.get(position) , Toast.LENGTH_LONG).show();
                    }
                });

    }
    public void cerrar(View v){
        this.finish();
    }

}
