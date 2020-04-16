package com.example.ahmedhegazy.azkar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Azkar_Almasa extends AppCompatActivity {

    MediaPlayer p3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar__almasa);

        Button btn_p3=findViewById(R.id.btn_p3);
        Button btn_ar3=findViewById(R.id.btn_ar3);

    }



    public void btn_ar3(View view) {

        if (p3==null)
        {
            p3=MediaPlayer.create(this,R.raw.mas);
        }
        p3.start();

    }

    public void btn_p3(View view) {

        if (p3!=null)
        {
            p3.pause();
        }
    }
}
