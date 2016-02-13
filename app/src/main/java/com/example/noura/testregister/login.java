package com.example.noura.testregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class
        login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

//test
    public  void resReg(View view){
        Intent i = new Intent(getApplicationContext(),register.class);
        startActivity(i);}
    public  void depReg(View view){
        Intent i = new Intent(getApplicationContext(),depregister.class);
        startActivity(i);}
//
}
