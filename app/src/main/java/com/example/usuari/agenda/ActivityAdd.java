package com.example.usuari.agenda;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ActivityAdd extends AppCompatActivity {
    List<contactos> l = new ArrayList<contactos>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Intent intent=this.getIntent();
    }
    public void agregar(View v){
        EditText nombre=(EditText)this.findViewById(R.id.edtNombre);
        EditText mail=(EditText)this.findViewById(R.id.edtMail);
        EditText edtEdad=(EditText) this.findViewById(R.id.edtEdad);
        int edad=Integer.parseInt(edtEdad.getText().toString());
        String n = nombre.getText().toString();
        String m = mail.getText().toString();
        contactos c = new contactos(n,edad,m);
        MainActivity.l.add(c);
        AccesoFichero af=new AccesoFichero(this,"contacto.txt");
        af.guardar(c.toString());
        Toast.makeText(this,"Se ha guardado correctamente ", Toast.LENGTH_LONG).show();
        this.finish();
       /* DBLibros adp=new DBLibros(this);
        adp.altaLibro(titulo,autor,dbPrecio);
        adp.close();
        this.finish();*/
    }
}
