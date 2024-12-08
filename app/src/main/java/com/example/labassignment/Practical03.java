package com.example.labassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Practical03 extends AppCompatActivity {

    @Override
    protected  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        System.out.println("Intent Invoked !!!");
        setContentView(R.layout.activity_practical03);

    }

    public void home(View v){
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
}