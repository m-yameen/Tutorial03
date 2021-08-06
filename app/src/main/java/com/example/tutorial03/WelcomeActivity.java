package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        msg = findViewById(R.id.txtWelcomeMessage);

        Intent intent = getIntent();
        String userdatavalue = intent.getStringExtra("userdata");
        msg.setText("Welcome " + userdatavalue);

        Toast.makeText(this, userdatavalue, Toast.LENGTH_SHORT).show();
    }
}