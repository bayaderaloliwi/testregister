package com.example.noura.testregister;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class depregister extends AppCompatActivity {
    Button r_submit;
    EditText r_ID, r_FullName, r_Password, r_repassword, r_email, r_reemail , r_address;
    String id, name, pass, repass, email, remail, address;
    CheckBox r_policy;
    TextView popup_pol;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depregister);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.clearCheck();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                                  @Override
                                                  public void onCheckedChanged(RadioGroup group, int checkedId) {
                                                      RadioButton rb = (RadioButton) group.findViewById(checkedId);
                                                      if (null != rb && checkedId > -1) {
                                                          Toast.makeText(depregister.this, rb.getText(), Toast.LENGTH_SHORT).show();
                                                      }

                                                  }
                                              }

        );


    }

}
