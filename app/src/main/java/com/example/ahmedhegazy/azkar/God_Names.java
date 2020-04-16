package com.example.ahmedhegazy.azkar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class God_Names extends AppCompatActivity {

    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_god__names);



        Button btn_pause=findViewById(R.id.btn_pause);
        Button btn_play_arrow=findViewById(R.id.btn_play_arrow);


    }

    public void play_arrow(View view)
    {
        if (player==null)
        {
            player=MediaPlayer.create(this,R.raw.a);
        }
        player.start();
    }


    public void pause(View view)
    {
        if (player!=null)
        {
            player.pause();

        }

    }
}
