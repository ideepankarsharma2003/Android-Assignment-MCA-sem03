package com.example.labassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Practical01 extends AppCompatActivity {

    @Override
    protected  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        System.out.println("Intent Invoked !!!");
        setContentView(R.layout.activity_practical01);
//        Toast.makeText(this, "Practical 01", Toast.LENGTH_SHORT).show();

    }

    public void home(View v){
        Intent i= new Intent(this, MainActivity.class);
//        Toast.makeText(this, "Going Back to Home", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
}