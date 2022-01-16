package com.youstinus.griddemo;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void on1(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
        mPlayer.start();
    }
    public void on2(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.goodevening);
        mPlayer.start();
    }
    public void on3(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.hello);
        mPlayer.start();
    }
    public void on4(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.howareyou);
        mPlayer.start();
    }
    public void on5(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.ilivein);
        mPlayer.start();
    }
    public void on6(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.mynameis);
        mPlayer.start();
    }
    public void on7(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.please);
        mPlayer.start();
    }
    public void on8(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.welcome);
        mPlayer.start();
    }
}
