package com.example.gaziaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddPersonActivity extends AppCompatActivity {
    EditText txt_name;
    EditText txt_phone;
    String mName;
    String mPhone;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);
        mButton = (Button)findViewById(R.id.btn_save_person);
        mButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Get variables from input
                        txt_name = (EditText) findViewById(R.id.txt_name);
                        mName = txt_name.getText().toString();
                        txt_phone = (EditText) findViewById(R.id.txt_phone);
                        mPhone = txt_phone.getText().toString();

                        // Append to file
                        
                    }
                }
        );



    }
}