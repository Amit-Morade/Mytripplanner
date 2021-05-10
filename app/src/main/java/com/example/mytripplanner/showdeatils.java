package com.example.mytripplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class showdeatils extends AppCompatActivity {
    private TextView destinationtext;
    private TextView noofpeopletext;
    private TextView startdatetext;
    private TextView enddatetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdeatils);

        Intent intent = getIntent();
        String desti = intent.getStringExtra("destination").toString();
        String noofpeople = intent.getStringExtra("noofpeople").toString();
        String startdate = intent.getStringExtra("startdate").toString();
        String enddate = intent.getStringExtra("enddate").toString();

        destinationtext.setText(desti);
        noofpeopletext.setText(noofpeople);
        startdatetext.setText(startdate);
        enddatetext.setText(startdate);
    }
}