package com.example.usuari.agenda;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by usuari on 20/03/2018.
 */

public class DBContactos {
    private SQLiteDatabase db=null;
    private DatabaseHelper dbhelper=null;
    Context context;
    public DBContactos(Context ctx){
        this.context = ctx;
        dbhelper = new DatabaseHelper(context);
        db = dbhelper.getWritableDatabase();
    }
    public void close(){
        dbhelper.close();
    }
    public  long altaLibro(String nombre, String mail, int edad){
        ContentValues initialValues = new ContentValues();
        initialValues.put("nombre",nombre);
        initialValues.put("mail",mail);
        initialValues.put("edad",edad);
        return db.insert("contactos",null,initialValues);
    }
    public Cursor recuperarLibros(){
        return db.query("contactos", new String[]{"_id","nombre","mail","edad"},null,null,null,null,null);
    }
}
