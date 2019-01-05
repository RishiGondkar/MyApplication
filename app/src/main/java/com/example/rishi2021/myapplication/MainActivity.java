package com.example.rishi2021.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public String user = "admin";
    public String password = "password";

    public void onUserSubmission(View v){
        EditText nameText = findViewById(R.id.nameText);
        EditText passText = findViewById(R.id.passText);
        TextView info = findViewById(R.id.infoText);

        if(nameText.getText().toString().equals(user) && passText.getText().toString().equals(password)){
            info.setText("Credentials are valid");
            info.setTextColor(0xff00ff00);
        }
        else{
            info.setText("Wrong password");
            info.setTextColor(0x00ff0000);
        }
        nameText.setText("");
        passText.setText("");
    }
}
