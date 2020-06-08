package com.example.completetopics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class array_loop extends AppCompatActivity {
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_loop);
        //array is the colloection of itmes and homoginus data type
         //we are making an array which is simple array
        textView=findViewById(R.id.tvid);

        String[] countries = {"pak","iran","india","china"};
        StringBuilder sb = new StringBuilder();
        for(String s :countries) //thi is a loop
         sb.append(s).append("\n");
        textView.setText(sb.toString()); //this is for textview show data
       // System.out.println("Zeeshan"+" "+sb.toString()); //this is for console java
       //Log.d("country",sb.toString()); //first search country parameter and check in logcat

       /*try {
            for (int i = 0; i < countries.length; i++) {
                sb.append(countries[i] + ", ");
            }
        }catch (IndexOutOfBoundsException e){
            Log.e("IOERROR", e.getMessage());
        }*/
       // System.out.println("Zeeshan"+" "+sb.toString());

        Resources res = getResources(); // for static array calling from string.xml
        String[] myBooks = res.getStringArray(R.array.dish);
        StringBuilder bilder= new StringBuilder();
        for(String s:myBooks)
            bilder.append(s).append("\n");
       // Log.d("dishes","may favourite dish is "+bilder.toString());



    }
}
