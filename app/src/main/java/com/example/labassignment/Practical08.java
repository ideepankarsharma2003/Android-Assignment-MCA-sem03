package com.example.labassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Practical08 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical08);

    }
    public void home(View v){
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void login(View v){
        Toast.makeText(this, "Successfully Logged In !", Toast.LENGTH_SHORT).show();
    }
}
