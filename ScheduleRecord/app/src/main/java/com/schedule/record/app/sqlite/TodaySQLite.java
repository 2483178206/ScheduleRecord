package com.schedule.record.app.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TodaySQLite extends SQLiteOpenHelper {

    String CREAT_TABLE="create table today(dayid varchar(32) primary key, checkbox bit,remind bit,time datetime,title varchar(128),important char(2),diary text, nameid char(12))";
    public TodaySQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
