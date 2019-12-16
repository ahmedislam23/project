package com.example.page1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sginup extends AppCompatActivity {
    private Button button;
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button _btnreg, _btnlogin;
    EditText _txtfname, _txtlname, _txtpass, _txtemail, _txtphone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sginup);

        openHelper = new DataBaseHelper(this);
        _txtfname = (EditText)findViewById(R.id.fn);
        _txtlname = (EditText)findViewById(R.id.ln);
        _txtpass = (EditText)findViewById(R.id.pass);
        _txtemail = (EditText)findViewById(R.id.email);
        _txtphone = (EditText)findViewById(R.id.ph);
        _btnlogin=(Button)findViewById(R.id.login);
        _btnreg=(Button)findViewById(R.id.s);


        _btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db=openHelper.getWritableDatabase();
                String fname=_txtfname.getText().toString();
                String lname=_txtlname.getText().toString();
                String pass=_txtpass.getText().toString();
                String email=_txtemail.getText().toString();
                String phone=_txtphone.getText().toString();
                insertdata(fname, lname,pass,email,phone);
                Toast.makeText(getApplicationContext(), "register successfully",Toast.LENGTH_LONG).show();
                openaddcar();

            }
        });


    }
    public void openaddcar()
    {
        Intent intent = new Intent(this, addcar.class);
        startActivity(intent);
    }
    public void insertdata(String fname, String lname, String pass, String email, String phone){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DataBaseHelper.COL_2, fname);
        contentValues.put(DataBaseHelper.COL_3, lname);
        contentValues.put(DataBaseHelper.COL_4, pass);
        contentValues.put(DataBaseHelper.COL_5, email);
        contentValues.put(DataBaseHelper.COL_6, phone);
        long id = db.insert(DataBaseHelper.TABLE_NAME, null, contentValues);
    }

}