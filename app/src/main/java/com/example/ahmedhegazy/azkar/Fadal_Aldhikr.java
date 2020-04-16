package com.example.ahmedhegazy.azkar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fadal_Aldhikr extends AppCompatActivity {

    MediaPlayer p4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fadal__aldhikr);

        Button btn_ar3=findViewById(R.id.btn_ar3);
        Button btn_p3=findViewById(R.id.btn_p3);

    }

    public void btn_ar3(View view) {

        if (p4==null)
        {
            p4=MediaPlayer.create(this,R.raw.fa);
        }
        p4.start();
    }

    public void btn_p3(View view) {

        if (p4!=null)
        {
            p4.pause();
        }
    }
}
