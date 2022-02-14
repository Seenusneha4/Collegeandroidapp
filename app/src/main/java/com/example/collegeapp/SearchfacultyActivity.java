package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SearchfacultyActivity extends AppCompatActivity {
    EditText e1;
    AppCompatButton b1,b2;
    String getFacultyName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchfaculty);
        e1=(EditText)findViewById(R.id.facultyname);
        b1=(AppCompatButton)findViewById(R.id.search);
        b2=(AppCompatButton)findViewById(R.id.backtodash);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }

}