package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddstudentActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    AppCompatButton b1,b2;
    String getName,getRollNo,getAdmissionNo,getCollege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addstudent);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.rollno);
        e3=(EditText)findViewById(R.id.adno);
        e4=(EditText)findViewById(R.id.college);
        b1=(AppCompatButton)findViewById(R.id.submit);
        b2=(AppCompatButton)findViewById(R.id.backtodash);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=e1.getText().toString();
                getRollNo=e2.getText().toString();
                getAdmissionNo=e3.getText().toString();
                getCollege=e4.getText().toString();
                Toast.makeText(getApplicationContext(),getName, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getRollNo,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getAdmissionNo,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getCollege,Toast.LENGTH_LONG).show();
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