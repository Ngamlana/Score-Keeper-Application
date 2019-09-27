package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Increase the goals that are scored by team A, and it increases by 1.
     */

    public void oneGoalForTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the fouls that are made by team A, and it increases by 1.
     */

    public void oneFoulForTeamA(View view){
        foulTeamA = foulTeamA + 1;
        displayFoulsForTeamA(foulTeamA);

    }

    /**
     * Increase the goals that are scored by team B, and it increases by 1.
     */

    public void oneGoalForTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Increase the fouls that are made by team B, and it increases by 1.
     */

    public void oneFoulForTeamB(View view){
        foulTeamB = foulTeamB + 1;
        displayFoulsForTeamB(foulTeamB);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team A.
     */

    public void displayFoulsForTeamA(int foul){
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team B.
     */

    public void displayFoulsForTeamB(int foul){
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * reset goals and fouls to 0.
     */

    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulsForTeamA(foulTeamA);
        displayFoulsForTeamB(foulTeamB);
    }

}
