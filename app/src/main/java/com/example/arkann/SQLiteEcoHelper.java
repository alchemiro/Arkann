package com.example.arkann;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteEcoHelper extends SQLiteOpenHelper {

    public static final String ECO_TABLE="ECO_TABLE";
    public static final String COLUMN_ECO_TEXT="ECO_TEXT";
    public static final String COLUMN_ID="ECO_ID";
    public static final String COLUMN_ECO_NAME="ECO_NAME";

    public SQLiteEcoHelper(@Nullable Context context) {
        super(context, "eco.db", null, 1);
    }

    //onCreate is called the first time it's accessed, this should have the initializer code
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement=( "CREATE TABLE "
                + ECO_TABLE
                + " ( "
                + COLUMN_ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                +COLUMN_ECO_NAME
                +" TEXT, "
                + COLUMN_ECO_TEXT
                + " TEXT);"
        );
        db.execSQL(createTableStatement);
    }

    //onUpgrade is called when the version of the database changes. Prevents previous users apps from breaking when you change the database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addEco(String name, String text) throws SQLiteException {
        SQLiteDatabase ecoDb=this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_ECO_TEXT, text);
        cv.put(COLUMN_ECO_NAME, name);
        ecoDb.insert( ECO_TABLE, null, cv );
    }


}
