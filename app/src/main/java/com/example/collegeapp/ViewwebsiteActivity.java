package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.EditText;

public class ViewwebsiteActivity extends AppCompatActivity {
    WebView e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewwebsite);
        e1=(WebView)findViewById(R.id.web);
        e1.loadUrl("https://www.mzce.ac.in/");
    }
}