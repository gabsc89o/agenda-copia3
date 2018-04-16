package com.example.usuari.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityFind extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        Intent intent = this.getIntent();
    }
    public void find(View v){
        TextView edtfind= (TextView) this.findViewById(R.id.tvFind);
        EditText buscar=(EditText)this.findViewById(R.id.edtBuscar);
        String b = buscar.getText().toString();
        for(contactos p : MainActivity.l){
            if(p.getName().toLowerCase().equals(b.toLowerCase()))
                edtfind.setText(p.getName());
        }
    }
    public void cerrar(View v){
        this.finish();
    }
}
