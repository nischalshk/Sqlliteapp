package com.aboveall.sqlliteapp.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyHelper extends SQLiteOpenHelper {

    private static final String db_name="DictionaryDb";
    private static final int db_version=1;

    //table name
    private static final String tblName="tblWord";

    //columns
    private static final String wordId="wordId";
    private static final String wordName="wordName";
    private static final String meaning="meaning";

    public MyHelper(@Nullable Context context) {
        super(context, db_name, null, db_version;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
