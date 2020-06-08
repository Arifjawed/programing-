package com.example.completetopics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity implements View.OnClickListener {

    float a,b,result;
    EditText editText1,editText2;
    TextView textView;
    Button addbtn,subbtn,multbtn,divbtn,cncelbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        textView=(TextView) findViewById(R.id.txtveiw);
        editText1=(EditText)findViewById(R.id.fno);
        editText2=(EditText)findViewById(R.id.sno);
        addbtn =(Button)findViewById(R.id.addnobtn);
        subbtn =(Button)findViewById(R.id.minobtn);
        multbtn =(Button)findViewById(R.id.multinobtn);
        divbtn =(Button)findViewById(R.id.divnobtn);
        cncelbtn =(Button)findViewById(R.id.cannobtn);

        addbtn.setOnClickListener(this);
        subbtn.setOnClickListener(this);
        multbtn.setOnClickListener(this);
        divbtn.setOnClickListener(this);
        cncelbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.addnobtn:
                a=Integer.valueOf (editText1.getText().toString());
                b=Integer.valueOf (editText2.getText().toString());
                result =a+b;
                textView.setText("your result is : "+result);

                break;
            case R.id.minobtn:
                a=Integer.valueOf (editText1.getText().toString());
                b=Integer.valueOf (editText2.getText().toString());
                result =a-b;
                textView.setText("your result is : "+result);

                break;
            case R.id.multinobtn:
                a=Integer.valueOf (editText1.getText().toString());
                b=Integer.valueOf (editText2.getText().toString());
                result =a*b;
                textView.setText("your result is : "+result);
                break;
            case R.id.divnobtn:
                a=Float. parseFloat(editText1.getText().toString());
                b=Float. parseFloat(editText2.getText().toString());
                result =a/b;
                textView.setText("your result is : "+result);
                break;
            case R.id.cannobtn:
                textView.setText("");
                editText1.setText("");
                editText2.setText("");

                break;
        }

    }
}
