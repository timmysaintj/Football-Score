package com.example.tim.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks score for the Broncos
    int scoreBroncos = 0;

    // Tracks the score for the Seahawks
    int scoreSeahawks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Adds 7 points for the Broncos
    public void addSevenBroncos(View v) {
        scoreBroncos += 7;
        displayForBroncos(scoreBroncos);
    }

    //Adds 1 point for the Broncos
    public void addOneBroncos(View v) {
        scoreBroncos += 1;
        displayForBroncos(scoreBroncos);
    }

    //Adds 3 points for the Broncos
    public void addThreeBroncos(View v) {
        scoreBroncos += 3;
        displayForBroncos(scoreBroncos);
    }

    //Adds 2 points for the Broncos
    public void addTwoBroncos(View v) {
        scoreBroncos += 2;
        displayForBroncos(scoreBroncos);
    }

    //Adds 2 points (safety) for the Broncos
    public void addSafetyBroncos(View v) {
        scoreBroncos += 2;
        displayForBroncos(scoreBroncos);
    }

    // Adds 7 points for the Seahawks
    public void addSevenSeahawks(View v) {
        scoreSeahawks += 7;
        displayForSeahawks(scoreSeahawks);
    }

    // Adds 1 points for the Seahawks
    public void addOneSeahawks(View v) {
        scoreSeahawks += 1;
        displayForSeahawks(scoreSeahawks);
    }

    // Adds 3 points for the Seahawks
    public void addThreeSeahawks(View v) {
        scoreSeahawks += 3;
        displayForSeahawks(scoreSeahawks);
    }

    // Adds 2 points for the Seahawks
    public void addTwoSeahawks(View v) {
        scoreSeahawks += 2;
        displayForSeahawks(scoreSeahawks);
    }

    //Adds 2 points (safety) for the Seahawks
    public void addSafetySeahawks(View v) {
        scoreSeahawks += 2;
        displayForSeahawks(scoreSeahawks);
    }

    //Resets the score for both teams
    public void resetScores(View v) {
        scoreBroncos = 0;
        scoreSeahawks = 0;
        displayForBroncos(scoreBroncos);
        displayForSeahawks(scoreSeahawks);
    }

    public void displayForBroncos(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreBroncos);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForSeahawks(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreSeahawks);
        scoreView.setText(String.valueOf(score));
    }
}
