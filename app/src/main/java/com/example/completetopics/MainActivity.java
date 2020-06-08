package com.example.completetopics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
   TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(TextView) findViewById(R.id.gettext);
       /* Intent it = getIntent();
        String fname= it.getStringExtra("Firstname");// it will be right to work
         txt.setText("First name "+fname);*/

//        Bundle bundle2 = getIntent().getExtras();
        String name = getIntent().getExtras().getString("Fname");// string name=bundle2.getstring("fname");
        int pasw=getIntent().getExtras().getInt("Password");
//        txt.setText("Text Here :" +name);
     //   txt.setText(String.valueOf("Password is "+pasw)+"Text Here :" +name);
        txt.setText("name"+name+"password"+pasw);

        }


    }




