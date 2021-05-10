package com.example.mytripplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLogin(View view){
        EditText username = (EditText)findViewById(R.id.username);
        String name = String.valueOf(username.getText());
        Intent intent = new Intent(this,loginsuccess.class);
        intent.putExtra("name",name);
        startActivity(intent);
        finish();
    }
}