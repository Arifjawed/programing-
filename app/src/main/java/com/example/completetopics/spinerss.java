package com.example.completetopics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class spinerss extends AppCompatActivity {
Spinner spinner;//drop down

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinerss);
        final String[] country ={"iran","pak","india","china"};
    spinner =(Spinner)findViewById(R.id.spnr);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,country);//1 parameter class name second set layout template 3rd array name or source name where u want to get data it can be array or databse whatever
       // arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(arrayAdapter);//finished only for showing data in spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int index=spinner.getSelectedItemPosition();
                Toast.makeText(getApplicationContext(), "this is my country "+country[index], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(spinerss.this, "Please Select one", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
