package com.example.gaziaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    private Button add_cust_btn;
    private ScrollView scrollView;
    String fileName = "customers.csv";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linear_layout = (LinearLayout) findViewById(R.id.ll_scroll);
        String[] textArray = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};


        for( int i = 0; i < textArray.length; i++ )
        {
            TextView tv = new TextView(this);
            tv.setTextSize(30);
            tv.setText(textArray[i]);
            tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            linear_layout.addView(tv);
        }
        //view_cust_data();

        //Go to add customer view
        add_cust_btn = (Button) findViewById(R.id.btn_add_cust);
        add_cust_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddPersonActivity();
            }
        });
    }

    public void openAddPersonActivity(){
        Intent intent = new Intent(this, AddPersonActivity.class);
        startActivity(intent);
    }

    public void add_data(){
        System.out.println("In add_data");



    }
/*
    public void view_cust_data(){
        System.out.println("In view_cust_data");
        //View customer data - Read from file
        try {
            FileInputStream fileIn=openFileInput(fileName);
            InputStreamReader InputRead=new InputStreamReader(fileIn);
            char[] inputBuffer=new char[200];
            String s="";
            int charRead = 0;

            while ((charRead=InputRead.read(inputBuffer))>0) {
                // char to string conversion
                String readstring=String.copyValueOf(inputBuffer,0,charRead);
                s +=readstring;
            }
            InputRead.close();
            scrollView = (ScrollView) findViewById(R.id.scrollView);

            Toast.makeText(getBaseContext(), s,Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}