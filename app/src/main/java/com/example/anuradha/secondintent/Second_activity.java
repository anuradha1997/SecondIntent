package com.example.anuradha.secondintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {
    TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
       t2= (TextView) findViewById(R.id.tv2);
        Bundle b=getIntent().getExtras();
        String n=b.getString("name_key");
        String p=b.getString("phone_key");
        t2.setText(n+"\n"+p);
    }
}