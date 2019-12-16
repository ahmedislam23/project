package com.example.page1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {
    private Button button;
    private Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        button =(Button) findViewById(R.id.sginin);
        b2 =(Button) findViewById(R.id.sginup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensginin();



            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensginup();



            }
        });


    }
    public void opensginin()
    {
        Intent intent = new Intent(this, sginin.class);
        startActivity(intent);
    }
    public void opensginup()
    {
        Intent intent = new Intent(this, sginup.class);
        startActivity(intent);
    }


}