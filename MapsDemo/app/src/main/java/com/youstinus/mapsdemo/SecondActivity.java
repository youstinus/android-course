package com.youstinus.mapsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Username");
        if (name != null) {
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        }

        populateList();
    }

    protected void onMainActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
        startActivity(intent);
    }

    private void populateList() {
        ListView listView = findViewById(R.id.listView2);

        final ArrayList<String> list = new ArrayList<>();

        list.add(String.format("%s:%s", 65, 20));
        list.add(String.format("%s:%s", 20, 30));
        list.add(String.format("%s:%s", -20, 50));
        list.add(String.format("%s:%s", 30, -20));
        list.add(String.format("%s:%s", 15, -40));

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                intent.putExtra("cord", list.get(position));

                startActivity(intent);
            }
        });

    }


}
