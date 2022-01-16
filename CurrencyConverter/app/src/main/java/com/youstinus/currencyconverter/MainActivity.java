package com.youstinus.currencyconverter;

import android.support.v7.app.AppCompatActivity;
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

    public void convert(View view) {
        EditText text = findViewById(R.id.dollarField);
        Double number = Double.parseDouble(text.getText().toString()) * 0.89146;
        Toast.makeText(this, String.format("%.2f€", number), Toast.LENGTH_SHORT).show();
    }
}
