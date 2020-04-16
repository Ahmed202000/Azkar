package com.example.ahmedhegazy.azkar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Counter extends AppCompatActivity {

    private int mCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        final TextView txtCount=findViewById(R.id.txtCount);

        Button btnCount=findViewById(R.id.btnCount);
        ImageView imgClear=findViewById(R.id.imgClear);

        imgClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtCount.clearFocus();

            }
        });



        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mCount ++;
                txtCount.setText(Integer.toString(mCount));
            }
        });
    }

}
