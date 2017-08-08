package com.example.poorveshvyas.login;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity  implements  View.OnClickListener{
Button b1;
    SQLiteOpenHelper sd;
    SQLiteDatabase db;
    DBhelper d;
    EditText n,eid,p;
    DataBaseHelper helper=new DataBaseHelper(this);
    public static  final  String TABLE_NAME="Registration";
    public static final  String name="name";public static  final String userid="userid";
    public static  final String pwd="password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
     /*   try {
            String create = "create table " + TABLE_NAME + "(" + userid + " text not null, " + name + " text not null, " + pwd + " text not null);";
            db.execSQL(create);
        }catch (Exception e){
            Toast.makeText(this,"Database not Created" +e.toString(),Toast.LENGTH_LONG).show();
        }*/
        b1=(Button)findViewById(R.id.register);
        b1.setOnClickListener(this);
        n=(EditText)findViewById(R.id.name);eid=(EditText)findViewById(R.id.email);
        p=(EditText)findViewById(R.id.pwd);

    }
    @Override
    public void onClick(View view) {
        String na=n.getText().toString();
        String eidd=eid.getText().toString();
        String pa=p.getText().toString();
     /* SQLiteDatabase db=new DBhelper(getApplicationContext()).getWritableDatabase();
        if(db!=null){
            Toast.makeText(this,"Database is created",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Error!!!",Toast.LENGTH_LONG).show();
        }*/


           /* if (n.getText().toString().equals("") ||eid.getText().toString().equals("")||p.getText().toString().equals("")) {
                Toast.makeText(getApplicationContext(), "plz fill all fields", Toast.LENGTH_LONG).show();
            } else {
               /* Intent intent = new Intent();
                intent.putExtra("name", n.getText().toString());
                intent.putExtra("email id", eid.getText().toString());
                intent.putExtra("password", p.getText().toString());
                setResult(RESULT_OK, intent);
                finish();*/
               // RegistrationData r = new RegistrationData();
              //  r.setName(n.toString());
              //  r.setUserid(eid.toString());
              //  r.setPwd(p.toString());
               // DBhelper d;
//                if (requestCode == Constants.ADD_RECORD) {
                 //   sd.insertRecord(r);
//               }
               /* try{
                    db.execSQL("INSERT INTO Registration VALUES('"+n.getText()+"','"+eid.getText()+
                        "','"+p.getText()+"');");
                Toast.makeText(this,"Record Added",Toast.LENGTH_LONG).show();
                clearText();

         }catch (Exception e){
         Toast.makeText(this,"Not Added" +e.toString(),Toast.LENGTH_LONG).show();*/
        Contact c=new Contact();
        c.setName(na);
        c.setEmail(eidd);
        c.setPass(pa);
        if(na!=" " & eidd!=" " & pa!=""){
            {
        //c.setId(i);
      //  try {
            helper.insertContact(c);
            Toast.makeText(this,"Inserted",Toast.LENGTH_LONG).show();
            Intent i=new Intent(Registration.this,Login.class);
            startActivity(i);
     //   }catch (Exception e) {
     ////       Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
      //  }

        }} else { Toast.makeText(this,"provide info",Toast.LENGTH_LONG).show();
        }}




    public void clearText()
    {
        p.setText("");
        eid.setText("");
        p.setText("");

    }
}
