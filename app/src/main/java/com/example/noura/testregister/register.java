package com.example.noura.testregister;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class register extends AppCompatActivity{


    Button r_submit;
    EditText r_ID, r_FullName, r_Password, r_repassword, r_email, r_reemail , r_address;
    String id, name, pass, repass, email, remail, address;
    CheckBox r_policy;
    TextView popup_pol;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        r_ID = (EditText) findViewById(R.id.ID);
        r_FullName = (EditText) findViewById(R.id.FullName);
        r_Password = (EditText) findViewById(R.id.Password);
        r_repassword = (EditText) findViewById(R.id.repassword);
        r_email = (EditText) findViewById(R.id.email);
        r_reemail = (EditText) findViewById(R.id.reemail);
        r_address= (EditText) findViewById(R.id.address);
        r_policy= (CheckBox) findViewById(R.id.policy);


    }

    public void policy_pop(View view)
    {

        Intent i = new Intent(getApplicationContext(),policy.class);
        startActivity(i);

    }

public  void userReg(View view){

    id = r_ID.getText().toString();
    name = r_FullName.getText().toString();
    pass = r_Password.getText().toString();
    repass= r_repassword.getText().toString();
    email = r_email.getText().toString();
    remail = r_reemail.getText().toString();
    address= r_address.getText().toString();
  /**  if( r_ID.getText().toString().length() == 0 ){
        r_ID.setError( " ID is required!" );}
    if( r_FullName.getText().toString().length() == 0 ){
        r_FullName.setError( "Name is required!" );}
    if( r_Password.getText().toString().length() == 0 ){
        r_Password.setError( "Password is required!" );}
    if( r_email.getText().toString().length() == 0 ){
        r_email.setError( "Email is required!" );}
    if( r_reemail.getText().toString().length() == 0 ){
        r_reemail.setError( "Re Enter your email" );}
    if( r_address.getText().toString().length() == 0 ){
        r_address.setError("Address is required!");}
    if (!r_policy.isChecked()){
        r_policy.setError("you must agree to policy");}*/

   // else {
        if( !pass.equals(repass )){
            r_repassword.setError( "Password dose not match" );}
        else {
    String method = "register";
    BackgroundTask backgroundTask = new BackgroundTask(this);
    backgroundTask.execute(method, id, name, pass, email,address);
    Intent i = new Intent(getApplicationContext(),login.class);
    startActivity(i);}//}
}
}
