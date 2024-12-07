package com.example.labassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Practical02 extends AppCompatActivity {

    @Override
    protected  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        System.out.println("Intent Invoked !!!");
        setContentView(R.layout.activity_practical02);
        TextView tv= findViewById(R.id.tv_p2);
        tv.setText("");
//        Toast.makeText(this, "Practical 02", Toast.LENGTH_SHORT).show();

    }

    public void home(View v){
        Intent i= new Intent(this, MainActivity.class);
//        Toast.makeText(this, "Going Back to Home", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
    public void displayMessage(View v){
        String display_text= "Welcome to \n" +
                "Graphic Era University MCA";
        TextView tv= findViewById(R.id.tv_p2);
        tv.setText(display_text);
    }
}