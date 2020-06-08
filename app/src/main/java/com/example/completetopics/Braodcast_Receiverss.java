package com.example.completetopics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Braodcast_Receiverss extends AppCompatActivity {

    BroadcastReceiver broadcast =new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
      int level=intent.getIntExtra("level",0);//1 paramter of level is a keyword return battery level of a system second zero paramter for incase no return anything it return 0
            ProgressBar progressBar =(ProgressBar) findViewById(R.id.prgbar);//progress bar initializing
            progressBar.setProgress(level);

            TextView tv=(TextView) findViewById(R.id.txtfield); //its for show in textview
            tv.setText("Battry Level: " +Integer.toString(level)+"%");


        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_braodcast__receiverss);
          registerReceiver(broadcast,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

    }
}
