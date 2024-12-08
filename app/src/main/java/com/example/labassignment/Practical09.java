package com.example.labassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Practical09 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical09);

        // Initialize Views
        EditText etName = findViewById(R.id.etName);
        EditText etCollege = findViewById(R.id.etCollege);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etContact = findViewById(R.id.etContact);
        Spinner spinnerSports = findViewById(R.id.spinnerSports);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        // Set up Spinner with sports options
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.sports_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSports.setAdapter(adapter);

        // Handle Submit Button Click
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString().trim();
                String college = etCollege.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String contact = etContact.getText().toString().trim();
                String sport = spinnerSports.getSelectedItem().toString();

                if (name.isEmpty() || college.isEmpty() || email.isEmpty() || contact.isEmpty()) {
                    Toast.makeText(Practical09.this, "Please fill all the fields !", Toast.LENGTH_SHORT).show();
                } else {
                    String message = "Registration Successful!\n\nName: " + name +
                            "\nCollege: " + college +
                            "\nEmail: " + email +
                            "\nContact: " + contact +
                            "\nSport: " + sport;
                    Toast.makeText(Practical09.this, "Registration Successful !", Toast.LENGTH_SHORT).show();
                    System.out.println(message);
                }
            }
        });
    }

    public void home(View v){
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }

}

