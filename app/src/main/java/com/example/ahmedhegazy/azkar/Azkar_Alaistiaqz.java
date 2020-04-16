package com.example.ahmedhegazy.azkar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Azkar_Alaistiaqz extends AppCompatActivity {

    MediaPlayer p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar__alaistiaqz);

        Button btn_p=findViewById(R.id.btn_p);
        Button btn_ar=findViewById(R.id.btn_ar);

    }

    public void p(View view) {

        if (p!=null)
        {
            p.pause();
        }
    }

    public void ar(View view) {

        if (p==null)
        {
            p=MediaPlayer.create(this,R.raw.s);
        }
        p.start();

    }
}
