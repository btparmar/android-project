package com.example.poorveshvyas.login;

import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;

public class Login extends AppCompatActivity implements View.OnClickListener{
Button b;
    EditText ed,ep;
    SQLiteDatabase sd;
String str;
        // Alert Dialog Manager
    AlertDialogManager alert = new AlertDialogManager();

    // Session Manager Class
    SessionManagement session;
DataBaseHelper helper=new DataBaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      //  session = new SessionManagement(getApplicationContext());
     //   Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();



        b=(Button)findViewById(R.id.login);
        b.setOnClickListener(this);
        ed=(EditText)findViewById(R.id.email);
        ep=(EditText)findViewById(R.id.pwd);

    }

    @Override
    public void onClick(View view) {
        String str=ed.getText().toString();
        String pass=ep.getText().toString();
//String username=ed.toString();
       /* String username = ed.getText().toString();
        String password = ep.getText().toString();

        // Check if username, password is filled
        if(username.trim().length() > 0 && password.trim().length() > 0){
            // For testing puspose username, password is checked with sample data
            // username = test
            // password = test
            if(username.equals("test") && password.equals("test")){

                // Creating user login session
                // For testing i am stroing name, email as follow
                // Use user real data
                session.createLoginSession(""+ed, ""+ed);

                // Staring MainActivity
                Intent i=new Intent(Login.this,Welcome.class);
                i.putExtra("name","test");

                startActivity(i);

            }else{
                // username / password doesn't match
                alert.showAlertDialog(Login.this, "Login failed..", "Username/Password is incorrect", false);
            }
        }else{
            // user didn't entered username or password
            // Show alert asking him to enter the details
            alert.showAlertDialog(Login.this, "Login failed..", "Please enter username and password", false);
        }try {
            String na = ep.getText().toString();
            String pw = ed.getText().toString();
            Cursor c = sd.rawQuery("SELECT userid,pwd FROM Registration WHERE userid='" + ed.getText() + "'", null);

            if (c.moveToFirst()) {
                RegistrationData r = new RegistrationData();
                // Displaying record if found
                String a = c.getString(c.getColumnIndex("name"));
                String b = c.getString(c.getColumnIndex("pwd"));
                Toast.makeText(this, "name = " + a + "Pwd = " + b, Toast.LENGTH_LONG).show();
                if (a == na && b == pw) {
                    Toast.makeText(this, "Both are same", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(this, "Error" + "Not Exists", Toast.LENGTH_LONG).show();

            }

            //   Intent i=new Intent(Login.this,Welcome.class);
            //  i.putExtra("name","test");

            //startActivity(i);
        }catch (Exception e){
            Toast.makeText(this,"not login"+ e.toString(),Toast.LENGTH_LONG).show();
        }
    }
*/if(str=="" && pass==""){
            Toast.makeText(this,"provide info",Toast.LENGTH_LONG).show();
            }
        else {
            String password;
            //try{
            password = helper.searchPass(str);
            //   }catch (Exception e) {
            //     Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
            //   }
            Toast.makeText(this, password + " str = " + str + " PASS= " + pass, Toast.LENGTH_LONG).show();
             if((ep.getText().toString())==password){

            Intent i = new Intent(Login.this, Welcome.class);
            i.putExtra("name", str);
            startActivity(i);}
             else
             {
                   Toast.makeText(this,"Give Correct Information",Toast.LENGTH_LONG).show();
              }
        }
    }




    }

