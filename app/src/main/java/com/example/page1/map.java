package com.example.page1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class map extends AppCompatActivity {
    private Button a1;
    private Button a2;
    private Button a3;
    private Button a4;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        a1 =(Button) findViewById(R.id.a1);
        a2 =(Button) findViewById(R.id.a2);
        a3 =(Button) findViewById(R.id.a3);
        a4 =(Button) findViewById(R.id.a4);
        b1 =(Button) findViewById(R.id.b1);
        b2 =(Button) findViewById(R.id.b2);
        b3 =(Button) findViewById(R.id.b3);
        b4 =(Button) findViewById(R.id.b4);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparking2();



            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparking3();



            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparking4();



            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparking5();



            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparking6();



            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparking7();



            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparking8();



            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparking9();



            }
        });



    }
    public void openparking2()
    {
        Intent intent = new Intent(this, parking2.class);
        startActivity(intent);
    }
    public void openparking3()
    {
        Intent intent = new Intent(this, parking3.class);
        startActivity(intent);
    }
    public void openparking4()
    {
        Intent intent = new Intent(this, parking4.class);
        startActivity(intent);
    }
    public void openparking5()
    {
        Intent intent = new Intent(this, parking5.class);
        startActivity(intent);
    }
    public void openparking6()
    {
        Intent intent = new Intent(this, parking6.class);
        startActivity(intent);
    }
    public void openparking7()
    {
        Intent intent = new Intent(this, parking7.class);
        startActivity(intent);
    }
    public void openparking8()
    {
        Intent intent = new Intent(this, parking8.class);
        startActivity(intent);
    }
    public void openparking9()
    {
        Intent intent = new Intent(this, parking9.class);
        startActivity(intent);
    }


}