package com.example.completetopics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataSend extends AppCompatActivity {

    EditText editTextone,editTexttwo;
    Button sendData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_send);

        editTextone=(EditText) findViewById(R.id.edtone);
        editTexttwo=(EditText) findViewById(R.id.edtwo);

        sendData=(Button)findViewById(R.id.btnsend);

        sendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname= editTextone.getText().toString();
                String pas= editTexttwo.getText().toString();
                int a= Integer.valueOf(pas);

                Bundle bundle1=new Bundle();//this is necessary object make to send data
                bundle1.putString("Fname",fname);//name takes string value and store into NAME
                bundle1.putInt("Password",a);
                Intent intent =new Intent(DataSend.this,MainActivity.class);//this is anotherway
                //intent.putExtra(bundle1);
                intent.putExtra("Fname",fname);
                intent.putExtra("Password",a);
                startActivity(intent);


            }
        });
    }
}
