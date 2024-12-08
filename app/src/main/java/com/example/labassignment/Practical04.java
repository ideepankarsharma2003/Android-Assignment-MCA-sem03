package com.example.labassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Practical04 extends AppCompatActivity {

    @Override
    protected  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        System.out.println("Intent Invoked !!!");
        setContentView(R.layout.activity_practical04);

    }

    public void home(View v){
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void toast(View v){
        Toast.makeText(this, "This is the toast message", Toast.LENGTH_LONG).show();
    }
}