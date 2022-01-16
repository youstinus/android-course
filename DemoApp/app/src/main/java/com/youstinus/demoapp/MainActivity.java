package com.youstinus.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int cat = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        EditText myTextField = findViewById(R.id.editText);
        String text = myTextField.getText().toString();
        if (text.isEmpty()) {
            text = "Tom";
        }
        text = "Hello " + text + "!";
        TextView helloView = findViewById(R.id.helloBobTextView);
        helloView.setText(text);
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public void onClickLogin(View view) {
        EditText username = findViewById(R.id.editTextUsername);
        EditText password = findViewById(R.id.editTextPassword);

        Log.i("Username", username.getText().toString());
        Log.i("Password", password.getText().toString());
        Toast.makeText(this, "Hey, whats up!", Toast.LENGTH_SHORT).show();

    }

    public void onChangeCat(View view) {
        ImageView image = findViewById(R.id.imageView);
        if (cat == 1) {
            image.setImageResource(R.drawable.cat2);
            cat = 2;
        } else {
            image.setImageResource(R.drawable.cat);
            cat = 1;
        }
    }
}
