package com.example.siworae.databasetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by siworae on 2018/5/30.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {

    //创建表SQL语句
    public static final String Create_book = "create table Book("
            + "id integer primary key autoincrement,"
            +"author text,"
            +"price real,"
            +"pages integer,"
            +"name text";

    private Context mContext;

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version){
        super(context,name,factory,version);
        mContext = context;
    }
    public void onCreate(SQLiteDatabase db){
        db.execSQL(Create_book);
    }
}
