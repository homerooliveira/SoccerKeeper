package com.example.android.soccerkeeper;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int foulTeamA = 0;
    private int scoreTeamB = 0;
    private int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given value for viewId
     */
    public void displayFor(@IdRes int viewId, int value) {
        TextView scoreView = (TextView) findViewById(viewId);
        scoreView.setText(String.valueOf(value));
    }

    /**
     * Increase the score for Team A by 1 points.
     */
    public void addOneForTeamA(View view) {
        scoreTeamA += 1;
        displayFor(R.id.team_a_score, scoreTeamA);
    }

    /**
     * Increase the fouls for Team A by 1 points.
     */
    public void addOneFoulForTeamA(View view) {
        foulTeamA += 1;
        displayFor(R.id.team_a_foul, foulTeamA);
    }

    /**
     * Increase the score for Team B by 1 points.
     */
    public void addOneForTeamB(View view) {
        scoreTeamB += 1;
        displayFor(R.id.team_b_score, scoreTeamB);
    }

    /**
     * Increase the fouls for Team B by 1 points.
     */
    public void addOneFoulForTeamB(View view) {
        foulTeamB += 1;
        displayFor(R.id.team_b_foul, foulTeamB);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        foulTeamA = 0;
        scoreTeamB = 0;
        foulTeamB = 0;
        displayFor(R.id.team_a_score, scoreTeamA);
        displayFor(R.id.team_a_foul, foulTeamA);
        displayFor(R.id.team_b_score, scoreTeamB);
        displayFor(R.id.team_b_foul, foulTeamB);
    }
}
