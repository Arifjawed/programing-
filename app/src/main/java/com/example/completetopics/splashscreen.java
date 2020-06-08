package com.example.completetopics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread th= new Thread(){
            public void run(){
                try {

                 sleep(3000);

                }catch(Exception ex){
                    ex.printStackTrace();

                }
                finally{

                    Intent intent =new Intent(splashscreen.this,DataSend.class);
                    startActivity(intent);
                }
            }

        };th.start();

    }
}
