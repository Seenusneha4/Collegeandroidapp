package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1,b2;
    String getName,getMobNo,getEmail,getPassword,getConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.mobno);
        ed3=(EditText)findViewById(R.id.email);
        ed4=(EditText)findViewById(R.id.password);
        ed5=(EditText)findViewById(R.id.confpass);
        b1=(AppCompatButton)findViewById(R.id.regbtn);
        b2=(AppCompatButton)findViewById(R.id.backtologbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getMobNo=ed2.getText().toString();
                getEmail=ed3.getText().toString();
                getPassword=ed4.getText().toString();
                getConfirmPassword=ed5.getText().toString();

                if (getPassword.equals(getConfirmPassword))
                {
                    Toast.makeText(getApplicationContext(),getName , Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getMobNo,Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getEmail,Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getConfirmPassword,Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),"matching",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Password and confirm password doesnot matching",Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}