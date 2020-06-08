package com.example.completetopics;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alerts_Dialoguess extends AppCompatActivity {
Button alrtbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts__dialoguess);
        alrtbtn=findViewById(R.id.alrtbox);
                alrtbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder builder=new AlertDialog.Builder(alerts_Dialoguess.this);
                        builder.setMessage("Are you want to delete this");
                        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                             alerts_Dialoguess.this.finish();//this is finishing activity class name
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();//this is cancilling the dialog
                            }
                        });
                        AlertDialog alertDialog =builder.create(); //creating alertdialog
                        alertDialog.show();//for showing on screen

                    }
                });
    }
}
