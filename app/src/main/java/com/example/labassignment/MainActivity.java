package com.example.labassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rootLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void practical_01(View v){
//        Toast.makeText(this, "Going To Practical 01", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical01.class);
        System.out.println("Firing the intent.");
        startActivity(i);
    }
    public void practical_02(View v){
//        Toast.makeText(this, "Going To Practical 02", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical02.class);
        System.out.println("Firing the intent.");
        startActivity(i);
    }
}