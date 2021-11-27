package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,rollno,email;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= findViewById(R.id.t1);
        rollno=findViewById(R.id.t2);
        email=findViewById(R.id.t3);
        button=findViewById(R.id.b1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name= name.getText().toString();
                String Rollno= rollno.getText().toString();
                String Email=email.getText().toString();
                Intent intent =new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name",Name);
                intent.putExtra("Rollno",Rollno);
                intent.putExtra("Email",Email);
                startActivity(intent);
            }
        });

    }
    }
