package com.example.ahmedhegazy.azkar;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button Azkar_Daily=(Button)findViewById(R.id.Azkar_Daily);
        Button Forty_Nuclear=(Button)findViewById(R.id.Forty_Nuclear);
        Button God_Names=(Button)findViewById(R.id.God_Names);
        Button Counter=(Button)findViewById(R.id.Counter);
        Button ShareApp=(Button)findViewById(R.id.ShareApp);
        Button Reting=(Button)findViewById(R.id.Reting);


        Azkar_Daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,Azkar_Daily.class));
            }
        });

        Forty_Nuclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,Forty_Nuclear.class));
            }
        });

        God_Names.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,God_Names.class));
            }
        });


        Counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,Counter.class));
            }
        });


        ShareApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent myIntent=new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                startActivity(Intent.createChooser(myIntent,"Share Using"));
            }
        });


        Reting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                try
                {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=" +"com.android.chrome")));
                }catch (ActivityNotFoundException e)
                {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" +getPackageName())));
                }
            }
        });


    }
}
