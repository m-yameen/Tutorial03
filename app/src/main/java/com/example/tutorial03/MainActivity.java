package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user,pass;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        btn    = findViewById(R.id.login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ValUsername = user.getText().toString();
                String ValPassword = pass.getText().toString();

                if (ValUsername.equals("admin@gmail.com") && ValPassword.equals("123456"))
                {

                    Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
                    intent.putExtra("userdata",ValUsername);
                    startActivity(intent);
                    finish();

                    Toast.makeText(MainActivity.this,"Login Successfully", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Username or Password is wrong.", Toast.LENGTH_SHORT).show();
                    Log.i("Login Screen","In Onclick");
                }
            }
        });
    }
}