package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    /**
     *  Implements functionality for +3 Points for Team A
     */
    public void Aplus3(View view) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    /**
     *  Implements functionality for +2 Points for Team A
     */
    public void Aplus2(View view) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    /**
     *  Implements functionality for Free Throw Points for Team A
     */
    public void AfreeThrow(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_teamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  Implements functionality for +3 Points for Team B
     */
    public void Bplus3(View view) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    /**
     *  Implements functionality for +2 Points for Team B
     */
    public void Bplus2(View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    /**
     *  Implements functionality for Free Throw Points for Team B
     */
    public void BfreeThrow(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_teamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets all scores to zero and displays both team scores
     */

    public void reset(View view) {
        scoreB = 0;
        displayForTeamB(scoreB);
        scoreA = 0;
        displayForTeamA(scoreA);
    }
}
