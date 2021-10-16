package com.example.arkann;

import static android.icu.text.MessagePattern.ArgType.SELECT;
import static com.example.arkann.SQLiteEcoHelper.COLUMN_ECO_NAME;
import static com.example.arkann.SQLiteEcoHelper.COLUMN_ECO_TEXT;
import static com.example.arkann.SQLiteEcoHelper.COLUMN_ID;
import static com.example.arkann.SQLiteEcoHelper.ECO_TABLE;
import static com.example.arkann.EcoBitmapUtils.getImage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;

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

    public boolean isExist(int id){
        String expr="WHERE"+COLUMN_ID+"="+id+";";
        String textQuery="SELECT EXISTS(SELECT * FROM"+ ECO_TABLE + expr+")";
        Cursor textCursor=ecoDb.rawQuery(textQuery,null);
        if(textCursor.moveToFirst()){
            return true;
        }
        else return false;
    }

    public String fetchTextById(int id){
        String expr="WHERE"+COLUMN_ID+"="+id+";";
        String textQuery="SELECT"+COLUMN_ECO_TEXT+"FROM"+ECO_TABLE + expr;
        Cursor textCursor=ecoDb.rawQuery(textQuery,null);
        String text = null;
        if(textCursor.moveToFirst()){
        //if there are results, loop through them and insert into return list
            int columnId=textCursor.getInt(0);
            text=textCursor.getString(2);
        }
        else{
        //do nothing
        }
        textCursor.close();
        ecoDb.close();
        return text;
    }

    public String fetchNameByID(int id){
        String expr="WHERE"+COLUMN_ID+"="+id+";";
        String textQuery="SELECT"+COLUMN_ECO_NAME+"FROM"+ECO_TABLE + expr;
        Cursor textCursor=ecoDb.rawQuery(textQuery,null);
        String name = null;
        if(textCursor.moveToFirst()){
            //if there are results, loop through them and insert into return list
            int columnId=textCursor.getInt(0);
            name=textCursor.getString(1);
        }
        else{
            //do nothing
        }
        textCursor.close();
        ecoDb.close();
        return name;
    }


    public void close(){
        this.dbHelper.close();
    }



    }