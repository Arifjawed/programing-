package com.example.completetopics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class RadioCboxLVeiw extends AppCompatActivity {

    RadioGroup radioGroup;
    CheckBox checkBox;
    ListView listView;
    String[] city ={"karachi","hyderabd","sukkhur","lahore"};// custome array
    Spinner spnerlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_cbox_lveiw);
        radioGroup=findViewById(R.id.rgroup);
        //below code is showing the radio button work also we use image into raio button
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rbone =(RadioButton) findViewById(R.id.ronebtn);
                if(rbone.isChecked()){
                    Toast.makeText(getApplicationContext(),"Male",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Female",Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox=findViewById(R.id.chckone);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()){
                    Toast.makeText(getApplicationContext(),"Male",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Female",Toast.LENGTH_SHORT).show();
                }

            }
        });

        //above code showing the checkbox button work
        //listview is called colloection of items
        listView =(ListView) findViewById(R.id.lstveiw);
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city);//1 parameter class name second set layout template 3rd array name or source name where u want to get data it can be array or databse whatever
         listView.setAdapter(arrayAdapter);

//now we are making onclicklistener of listveiw for searching index of each array element which is place into array
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int index=position;
                Toast.makeText(getApplicationContext(),"you selected city : " +city[index],Toast.LENGTH_SHORT).show();
            }
        });

        //above code showing the listview work


        spnerlist= (Spinner) findViewById(R.id.spner);
        ArrayAdapter<String> arrayAdapterSpiner=new  ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,city);
        spnerlist.setAdapter(arrayAdapterSpiner);
        spnerlist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                int index=spnerlist.getSelectedItemPosition();
                Toast.makeText(getApplicationContext(),"you selected city : " +city[index],Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






    }
}
