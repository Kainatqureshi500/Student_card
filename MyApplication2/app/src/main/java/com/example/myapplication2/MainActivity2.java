package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name, rollno,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.t1);
        rollno=findViewById(R.id.t2);
        email=findViewById(R.id.t3);

        Intent intent =getIntent();
        String Name=intent.getStringExtra("Name");
        String Rollno=intent.getStringExtra("Rollno");
        String Email=intent.getStringExtra("Email");

        name.setText(Name);
        rollno.setText(Rollno);
        email.setText(Email);

    }
}