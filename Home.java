package com.example.poorveshvyas.login;

import android.content.Intent;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Home extends AppCompatActivity implements  View.OnTouchListener {
    RelativeLayout r;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       try {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_home);
           r = (RelativeLayout) findViewById(R.id.activity_home);
           r.setOnTouchListener(this);
       }catch (Exception e){
           Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
       }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        try {
                   Intent i = new Intent(Home.this, Registration.class);
                    startActivity(i);


        } catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    }

