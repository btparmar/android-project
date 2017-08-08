package com.example.poorveshvyas.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Welcome extends AppCompatActivity implements View.OnClickListener {
TextView t;
   ;String p=new String();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        t=(TextView) findViewById(R.id.textView3);
Button b=(Button)findViewById(R.id.logout);
        b.setOnClickListener(this);

        p=getIntent().getStringExtra("name");
        t.setText(p);
    }

    @Override
    public void onClick(View view) {


        Intent i=new Intent(Welcome.this,Login.class);
        startActivity(i);
}
        //    }
}
