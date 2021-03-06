package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {
    AppCompatButton b1,b2,b3,b4,b5,b6;
    SharedPreferences mypref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mypref=getSharedPreferences("login",MODE_PRIVATE);
        b1=(AppCompatButton)findViewById(R.id.addstudent);
        b2=(AppCompatButton)findViewById(R.id.addfaculty);
        b3=(AppCompatButton)findViewById(R.id.searchstudent);
        b4=(AppCompatButton)findViewById(R.id.searchfaculty);
        b5=(AppCompatButton)findViewById(R.id.viewwebsite);
        b6=(AppCompatButton)findViewById(R.id.logout);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddstudentActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddfacultyActivity.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SearchstudentActivity.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SearchfacultyActivity.class);
                startActivity(i);
            }
        }));
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     Intent i=new Intent(getApplicationContext(),ViewwebsiteActivity.class);
                     startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myEdit= mypref.edit();
                myEdit.clear();
                myEdit.commit();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}