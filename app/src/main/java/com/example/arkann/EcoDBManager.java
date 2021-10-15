package com.example.arkann;

import static com.example.arkann.SQLiteEcoHelper.COLUMN_ECO_IMAGE;
import static com.example.arkann.SQLiteEcoHelper.COLUMN_ECO_TEXT;
import static com.example.arkann.SQLiteEcoHelper.ECO_TABLE;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public class EcoDBManager{
    private Context context;
    private SQLiteDatabase ecoDb;
    private SQLiteEcoHelper dbHelper;

    public EcoDBManager(Context c){
        this.context=c;
    }

    public EcoDBManager open() throws SQLException{
        this.dbHelper=new SQLiteEcoHelper(this.context);
        this.ecoDb=this.dbHelper.getWritableDatabase();
        return this;
    }

    public Cursor fetchByID(int id){
//        Cursor cursorText=this.ecoDb.query(COLUMN_ECO_TEXT,);
    }

    public void close(){
        this.dbHelper.close();
    }


    }