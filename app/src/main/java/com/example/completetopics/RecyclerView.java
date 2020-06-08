package com.example.completetopics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.Display;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends AppCompatActivity {
    ArrayList<String>  strings;
   ListView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        strings=new ArrayList<>();
        rv=findViewById(R.id.rviews);
        strings.add("Arif");
        strings.add("Zeeshan");
        strings.add("Farooq");
        strings.add("Arif");
        strings.add("Arif");
        strings.add("Arif");
        strings.add("Arif");
        strings.add("Arif");
        strings.add("Arif");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,strings);
        rv.setAdapter(arrayAdapter);
        
    }



}
