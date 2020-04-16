package com.example.ahmedhegazy.azkar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class FullscreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_activity);


        MediaPlayer mediaPlayer=MediaPlayer.create(FullscreenActivity.this,R.raw.neww);
        mediaPlayer.start();


        // 13000
        final Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a=new Intent(FullscreenActivity.this,Home.class);
                startActivity(a);
                finish();
            }
        },13000);

        //كود الافيقت
        ImageView image = (ImageView)findViewById(R.id.imglogo);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
        image.startAnimation(animation);
    }
}




