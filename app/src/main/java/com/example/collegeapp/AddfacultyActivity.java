package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddfacultyActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5;
    AppCompatButton b1,b2;
    String getFacultyName,getDepartment,getQualification,getMobileNO,getEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfaculty);
        e1=(EditText)findViewById(R.id.facultyname);
        e2=(EditText)findViewById(R.id.dept);
        e3=(EditText)findViewById(R.id.quali);
        e4=(EditText)findViewById(R.id.mobileno);
        e5=(EditText)findViewById(R.id.email);
        b1=(AppCompatButton)findViewById(R.id.submit);
        b2=(AppCompatButton)findViewById(R.id.backtodash);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFacultyName=e1.getText().toString();
                getDepartment=e2.getText().toString();
                getQualification=e3.getText().toString();
                getMobileNO=e4.getText().toString();
                getEmail=e5.getText().toString();
                Toast.makeText(getApplicationContext(), getFacultyName, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getDepartment,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getQualification,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getMobileNO,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getEmail,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}