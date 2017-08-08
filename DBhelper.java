package com.example.poorveshvyas.login;
import android.content.ContentValues;
import android.content.Context;
import android.database.*;
import  android.database.sqlite.*;

/**
 * Created by Poorvesh Vyas on 2/14/2017.
 */

public class DBhelper  extends SQLiteOpenHelper{
private  static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME="CanteenExpenditure.db";
    public static  final  String TABLE_NAME="Registration";
    public static final  String name="name";public static  final String userid="userid";
    public static  final String pwd="password";

    public DBhelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        // super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase s) {
        String create="create table "+TABLE_NAME+ "("+userid +" text not null, "+name+" text not null, "+pwd+" text not null);";
        s.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase s, int i, int i1) {
s.execSQL("drop table if exists"+TABLE_NAME);
        onCreate(s);
    }

    private SQLiteDatabase sd;/*
   public void insertRecord(RegistrationData r){
sd=this.getReadableDatabase();
       ContentValues contentValues=new ContentValues();
       contentValues.put(userid,r.getUserid());
       contentValues.put(name,r.getName());
       contentValues.put(pwd,r.getPwd());
       sd.insert(TABLE_NAME,null,contentValues);
       sd.close();

   }
    public String getSingleEntry(String name){
        Cursor cursor=sd.query("TABLE_NAME",null,"name=?",new String[]{name},null,null,null);
        if(cursor.getCount()<1)
        {
            cursor.close();
            return "NOT EXIST";
        } cursor.moveToFirst();
        String password= cursor.getString(cursor.getColumnIndex("pwd"));
        cursor.close();
        return password;*/
    }

  /*  protected void onDestroy() {
        db.close();
        super.onDestroy();
    }*/

