package com.example.page1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class aftersigin extends AppCompatActivity {
    private Button b1;
    private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftersigin);
        b1 =(Button) findViewById(R.id.changecar);
        b2 =(Button) findViewById(R.id.chooseparking);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseparking();



            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changecar();



            }
        });


    }
    public void chooseparking()
    {
        Intent intent = new Intent(this, map.class);
        startActivity(intent);
    }
    public void changecar()
    {
        Intent intent = new Intent(this, addcar.class);
        startActivity(intent);
    }


}