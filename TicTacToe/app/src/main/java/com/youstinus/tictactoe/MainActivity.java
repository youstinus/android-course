package com.youstinus.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Integer person = 1;
    ArrayList<Integer> board = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPress(View view) {

        ImageView counter = (ImageView) view;

        Integer index = Integer.parseInt(counter.getTag().toString());

        if (board.get(index) > 0) {
            return;
        }

        counter.setTranslationY(-1000f);

        if (person == 1) {
            counter.setImageResource((R.drawable.yellow));
            person = 2;
        } else {
            counter.setImageResource((R.drawable.red));
            person = 1;
        }

        board.set(index, person);

        counter.animate().translationYBy(1000f).setDuration(300);


        Integer solved = solveBoard();
        if (solved > 0) {
            toastSuccess(solved);
            removeCounters();
        } else if (solved == -1) {
            toastDraw();
            removeCounters();
        }
    }

    private void removeCounters() {
        ImageView view1 = findViewById(R.id.imageView1);
        ImageView view2 = findViewById(R.id.imageView2);
        ImageView view3 = findViewById(R.id.imageView3);
        ImageView view4 = findViewById(R.id.imageView4);
        ImageView view5 = findViewById(R.id.imageView5);
        ImageView view6 = findViewById(R.id.imageView6);
        ImageView view7 = findViewById(R.id.imageView7);
        ImageView view8 = findViewById(R.id.imageView8);
        ImageView view9 = findViewById(R.id.imageView9);
        view1.setImageResource(0);
        view2.setImageResource(0);
        view3.setImageResource(0);
        view4.setImageResource(0);
        view5.setImageResource(0);
        view6.setImageResource(0);
        view7.setImageResource(0);
        view8.setImageResource(0);
        view9.setImageResource(0);
        board = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        person = 1;

    }

    private void toastSuccess(Integer person) {
        String winner = person == 1 ? "Red" : "Yellow";
        Toast.makeText(this, "Winner: " + winner + "!", Toast.LENGTH_SHORT).show();
    }

    private void toastDraw() {
        Toast.makeText(this, "It's a draw!", Toast.LENGTH_SHORT).show();
    }

    private Integer solveBoard() {
        if (
                (board.get(0) == board.get(1) && board.get(0) == board.get(2)) ||
                        (board.get(0) == board.get(3) && board.get(0) == board.get(6) ) ||
                        (board.get(0) == board.get(4) && board.get(0) == board.get(8) )){
            return board.get(0);

        } else if (
                        (board.get(2) == board.get(5) && board.get(2) == board.get(8)) ||
                        (board.get(6) == board.get(7) && board.get(6) == board.get(8) )){

            return board.get(8);
        } else if (
                        (board.get(2) == board.get(4) && board.get(2) == board.get(6))
        ) {

            return board.get(2);
        } else if (!board.contains(0)) {
            return -1;
        }

        return 0;
    }
}
