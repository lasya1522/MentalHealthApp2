package com.example.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AccountActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button logIn;
    Button start;

//does not display when app is run yet
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        start = findViewById(R.id.logInBtn);


        username = findViewById(R.id.usernameText);
        password = findViewById(R.id.passwordText);
        logIn = findViewById(R.id.logInBtn);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logIn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(AccountActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                });
                //set username as "Willow", Password as "test"
                if(username.getText().equals("willow")){
                    if(password.getText().toString().equals("test")){
                        AlertDialog.Builder builder = new AlertDialog.Builder(
                                AccountActivity.this);
                        builder.setTitle("Login Succesful!");
                        builder.setMessage("Welcome Back!");

                        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                        AlertDialog alert = builder.create();
                        alert.show();
                    }
                    else{ //invalid toast message
                        Toast.makeText(getApplicationContext(), "Invalid Username or Password",
                                Toast.LENGTH_SHORT).show();
                        //Toast.makeText(AccountActivity.this, "", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });
    }
}