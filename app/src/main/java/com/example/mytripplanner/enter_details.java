package com.example.mytripplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class enter_details extends AppCompatActivity{

    private EditText destinationtext;
    private EditText noofpeopletext;
    private EditText startdatetext;
    private EditText enddatetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_details);
    }

    public void onbuttonclick(View view){
        destinationtext = (EditText)findViewById(R.id.destination);
        noofpeopletext = (EditText)findViewById(R.id.noofpeople);
        startdatetext = (EditText)findViewById(R.id.startdate);
        enddatetext = (EditText)findViewById(R.id.enddate);

        String desti = destinationtext.getText().toString();
        String noofpeople = noofpeopletext.getText().toString();
        String startdate = startdatetext.getText().toString();
        String enddate = enddatetext.getText().toString();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Destination - ")
                .append(desti)
                .append("\n")
                .append("Number of people - ")
                .append(noofpeople)
                .append("\n")
                .append("Start date - ")
                .append(startdate)
                .append("\n")
                .append("End Date - ")
                .append(enddate);

        String message = stringBuilder.toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,message);
        startActivity(intent);
    }

}