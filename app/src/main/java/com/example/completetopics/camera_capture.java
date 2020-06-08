package com.example.completetopics;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class camera_capture extends AppCompatActivity {
 // ImageButton ibutton;
    Button imgbtns;
  ImageView iview;
  private static final int Camera_Request=1888;//its a random no its up to u use any no
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_capture);

        imgbtns =findViewById(R.id.imgbtn);
        iview =findViewById(R.id.img);
       //below the  code for open camera TODO SHOW ME FIRTS
        imgbtns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camIntent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camIntent,Camera_Request);
            }
        });
    }

    //now we showing the picture into imageview as picture/sms/anythings return from system so we use onresult function
//short cut key to use function alrt+Ins
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    //1stperemter :request code wo code leiker ata hai jo hmne intent k throw pass kia hai and check karegen using if condition data wahi hai
    //2nd peremter :resultcode check the Ok kia result aya hai ya ni
    //3rd paremter :data is me hamra picture ka data ayega
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == Camera_Request && resultCode == RESULT_OK)
        {
            Bitmap photo =(Bitmap) data.getExtras().get("data");//get the photo and store in variable photo
            iview.setImageBitmap(photo);//show the picture

        }

    }
}
