package com.example.gaziaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    private Button add_cust_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Go to add customer view
        add_cust_btn = (Button) findViewById(R.id.add_cust_btn);
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
}