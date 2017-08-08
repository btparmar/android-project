package com.example.poorveshvyas.login;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Poorvesh Vyas on 2/14/2017.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    private  static  final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="Expenditure.db";
    private  static final  String TABLE_NAME="Registration";
    private static  final  String COLUMN_ID="id";
    private  static final String COLUMN_NAME="name";
    private static  final String COLUMN_EMAILID="email";
    private static  final  String COLUMN_PASS="pass";
    SQLiteDatabase db;
 //  private static final String TABLE_CREATE="create table "+TABLE_NAME+ "("+COLUMN_ID+", "+COLUMN_EMAILID +" text not null, "+COLUMN_NAME+" text not null, "+COLUMN_PASS+" text not null);";
private  static  final  String TABLE_CREATE="create table Registration (id integer primary key not null," +
        "name text not null, email text not null, pass text not null);";
   // private  static  final  String TABLE_CREATE="create table Registration (id int," +
  //          "name text, email text, pass text);";

    //String TABLE_CREATE="create table "+TABLE_NAME+ "("+COLUMN_ID +" int not null,"+COLUMN_NAME+" text not null,"+COLUMN_EMAILID+" text not null,"+COLUMN_PASS+" text not null);";

    public DataBaseHelper(Context context){
        super(context ,DATABASE_NAME,null,DATABASE_VERSION);
   }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db=db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query = "DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
    public void insertContact(Contact c){

        db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        String query ="select * from Registration";
         Cursor cursor=db.rawQuery(query,null);
        int count=cursor.getCount();
        values.put(COLUMN_ID ,count);
        values.put(COLUMN_NAME,c.getName());
        values.put(COLUMN_EMAILID,c.getEmail());
        values.put(COLUMN_PASS,c.getPass());
        db.insert(TABLE_NAME,null,values);
    }
    public String searchPass(String uname){
        db=this.getReadableDatabase();
        String query="select email,pass from "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query,null);
        String a,b;
        b="not found";
        if(cursor.moveToFirst()){
            do {
                    a=cursor.getString(0);
                if(a.equals(uname)) {
                    b = cursor.getString(1);
                    break;
                }
            }while (cursor.moveToNext());
        }
        return b;
    }
}
