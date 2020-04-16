package com.example.ahmedhegazy.azkar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Azkar_Daily extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar__daily);

        final Button Fadal_Aldhikr=findViewById(R.id.Fadal_Aldhikr);
        Button Azkar_Almasa=findViewById(R.id.Azkar_Almasa);
        Button Azkar_Alsabah=findViewById(R.id.Azkar_Alsabah);
        Button Azkar_Aldhan=findViewById(R.id.Azkar_Aldhan);
        Button Azkar_Almasjid=findViewById(R.id.Azkar_Almasjid);
        Button Azkar_Alwudu=findViewById(R.id.Azkar_Alwudu);
        Button Azkar_Alsala=findViewById(R.id.Azkar_Alsala);
        Button Azkar_Altaeam=findViewById(R.id.Azkar_Altaeam);
        Button Azkar_Almanzil=findViewById(R.id.Azkar_Almanzil);
        Button Azkar_Alkhala=findViewById(R.id.Azkar_Alkhala);
        Button Azkar_Alaistiaqz=findViewById(R.id.Azkar_Alaistiaqz);
        Button Azkar_Alnuwm=findViewById(R.id.Azkar_Alnuwm);
        Button Azkar_Alhaji=findViewById(R.id.Azkar_Alhaji);


        Fadal_Aldhikr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Azkar_Daily.this,Fadal_Aldhikr.class));
            }
        });


        Azkar_Almasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Azkar_Daily.this,Azkar_Almasa.class));


            }
        });


        Azkar_Alsabah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Azkar_Daily.this,Azkar_Alsabah.class));


            }
        });


        Azkar_Aldhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Azkar_Daily.this,Azkar_Aldhan.class));


            }
        });


        Azkar_Almasjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Azkar_Daily.this,Azkar_Almasjid.class));


            }
        });


        Azkar_Alwudu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Azkar_Daily.this,Azkar_Alwudu.class));


            }
        });


        Azkar_Alsala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Azkar_Daily.this,Azkar_Alsala.class));


            }
        });


        Azkar_Altaeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Azkar_Daily.this,Azkar_Altaeam.class));


            }
        });


        Azkar_Almanzil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Azkar_Daily.this,Azkar_Almanzil.class));


            }
        });


        Azkar_Alkhala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Azkar_Daily.this,Azkar_Alkhala.class));


            }
        });


        Azkar_Alaistiaqz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Azkar_Daily.this,Azkar_Alaistiaqz.class));


            }
        });


        Azkar_Alnuwm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Azkar_Daily.this,Azkar_Alnuwm.class));


            }
        });


        Azkar_Alhaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Azkar_Daily.this,Azkar_Alhaji.class));


            }
        });

    }
}
