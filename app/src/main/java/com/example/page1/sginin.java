package com.example.page1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sginin extends AppCompatActivity {
    private Button button;
    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Cursor cursor;
    Button _btnLogin;
    EditText _txtEmail, _txtPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sginin);
        _txtEmail=(EditText)findViewById(R.id.edittext1);
        _txtPass=(EditText)findViewById(R.id.edittext2);
        _btnLogin=(Button)findViewById(R.id.login);
        openHelper=new DataBaseHelper(this);
        db = openHelper.getReadableDatabase();

     
        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = _txtEmail.getText().toString();
                String pass = _txtPass.getText().toString();

                cursor = db.rawQuery("SELECT *FROM " + DataBaseHelper.TABLE_NAME + " WHERE " + DataBaseHelper.COL_5 + "=? AND " + DataBaseHelper.COL_4 + "=?", new String[]{email, pass});
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                        aftersigin();

                    } else {
                        Toast.makeText(getApplicationContext(), "Login error", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


    }
    public void aftersigin()
    {
        Intent intent = new Intent(this, aftersigin.class);
        startActivity(intent);
    }
}