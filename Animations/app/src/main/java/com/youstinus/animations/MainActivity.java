package com.youstinus.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Float w = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View view) {
        ImageView bart = findViewById(R.id.imageView);
        ImageView homer = findViewById(R.id.imageView2);

        bart.animate().alpha(w).scaleX(0.5f+w/2).scaleY(0.5f+w/2).rotation(360*w).setDuration(2000);
        w = (w + 1) % 2;
        homer.animate().alpha(w).scaleX(0.5f+w/2).scaleY(0.5f+w/2).rotation(360*w).setDuration(2000);
    }
}
