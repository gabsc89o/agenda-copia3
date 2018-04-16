package com.example.usuari.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static List<contactos> l = new ArrayList<contactos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void agregar2(View v){
        Intent intent=new Intent(this,ActivityAdd.class);
        this.startActivity(intent);
    }
    public void vertodos(View v){
        Intent intent=new Intent(this,ActivityShow.class);
        this.startActivity(intent);
    }
    public void find(View v){
        Intent intent=new Intent(this,ActivityFind.class);
        this.startActivity(intent);
    }
    public void borrar(View v){
        AccesoFichero af=new AccesoFichero(this,"contacto.txt");
        af.limpiarFichero();
    }
}
