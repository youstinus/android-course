package com.youstinus.storagedemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.xmlpull.v1.XmlSerializer;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.youstinus.storagedemo", Context.MODE_PRIVATE);

        sharedPreferences.edit().putString("username", "rob").apply();

        String username = sharedPreferences.getString("username", "");

        Log.i("username", username);

        ArrayList<String> friends = new ArrayList<>();

        friends.add("Monica");
        friends.add("Chandler");

        // serialize friends to string from object first
        sharedPreferences.edit().putString("friends", "serialized");
    }
}
