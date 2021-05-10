package com.example.mytripplanner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mytripplanner.adapter.RecentsAdapter;
import com.example.mytripplanner.model.RecentData;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class loginsuccess extends AppCompatActivity  {

    public static final String destination = "desti";
    Intent intent = getIntent();


    RecyclerView recyclerView;
    RecentsAdapter recentsAdapter;


    private TextView textView4;
    private TextView showpeople;
    private Button participants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsuccess);
        TextView showname = (TextView)findViewById(R.id.username);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi,").append(" ").append(name);
        showname.setText(stringBuilder);

        List<RecentData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentData("Nilgiri Hills","India","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentData("Nilgiri Hills","India","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentData("Nilgiri Hills","India","From $300",R.drawable.recentimage2));

        setRecyclerView(recentsDataList);


    }

    private void setRecyclerView(List<RecentData> recentsDatalist){

        recyclerView = findViewById(R.id.recents_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this,recentsDatalist);
        recyclerView.setAdapter(recentsAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent(this,settings.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onbuttonclick(View view){
        Intent intent = new Intent(this,enter_details.class);
        startActivity(intent);
    }


}