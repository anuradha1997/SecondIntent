package com.example.anuradha.secondintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    String name,ph;
    int o;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       e1= (EditText) findViewById(R.id.eg1);
        e2= (EditText) findViewById(R.id.eg2);
        b1= (Button) findViewById(R.id.bg1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 name=e1.getText().toString();
                 ph=e2.getText().toString();
                Intent i=new Intent(MainActivity.this,Second_activity.class);
                i.putExtra("name_key",name);
                i.putExtra("phone_key",ph);
                startActivity(i);

            }
        });

        }
    }
