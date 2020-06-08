package com.example.completetopics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_storgess extends AppCompatActivity {
EditText filenames,contents;
Button btntext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_storgess);
    filenames = findViewById(R.id.edtone);
    contents = findViewById(R.id.edtwo);
    btntext =findViewById(R.id.storetextbtn);
    btntext.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String filename = filenames.getText().toString();
            String content = contents.getText().toString();

            FileOutputStream FOS;
            try{
                FOS= openFileOutput(filename , Context.MODE_PRIVATE);//openFileoutput creating the file
                FOS.write(content.getBytes());//this is for converting into byte
                FOS.close();
                Toast.makeText(file_storgess.this, filename+"saved", Toast.LENGTH_SHORT).show();
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }catch (IOException e){ e.printStackTrace();}

        }
    });
    }
}
