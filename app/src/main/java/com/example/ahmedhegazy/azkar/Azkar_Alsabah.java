package com.example.ahmedhegazy.azkar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Azkar_Alsabah extends AppCompatActivity {

    MediaPlayer p2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar__alsabah);

        Button btn_p2=findViewById(R.id.btn_p2);
        Button btn_ar2=findViewById(R.id.btn_ar2);

    }

    public void btn_ar2(View view) {

        if (p2==null)
        {
            p2=MediaPlayer.create(this,R.raw.sa);
        }
        p2.start();

    }

    public void btn_p2(View view) {

        if (p2!=null)
        {
            p2.pause();
        }

    }
}
