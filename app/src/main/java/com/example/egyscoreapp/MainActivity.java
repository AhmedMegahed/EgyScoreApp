package com.example.egyscoreapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    // Tracks the Goal for Team A
    int goalTeamA = 0;

    // Tracks the Goal for Team B
    int goalTeamB = 0;

    // Tracks the Foul for Team A
    int foulTeamA = 0;

    // Tracks the Foul for Team B
    int foulTeamB = 0;

    // Tracks the Red card for Team A
    int RcardTeamA = 0;

    // Tracks the Red card for Team B
    int RcardTeamB = 0;

    // Tracks the Yellow  card for Team A
    int YcardTeamA = 0;

    // Tracks the Yellow card for Team B
    int YcardTeamB = 0;

    // Tracks the Corerns   for Team A
    int cornerTeamA = 0;

    // Tracks the Corerns for Team B
    int cornerTeamB = 0;


    // Tracks the Shoots   for Team A
    int shootTeamA = 0;

    // Tracks the Shoots for Team B
    int shootTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * Displays the given Goal for Team A.
     */
    public void displaygoalTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Goal for Team B.
     */
    public void displaygoalTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Foul for Team A.
     */
    public void displayfoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_a_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Foul for Team B .
     */
    public void displayfoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_b_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Redcard for Team A .
     */
    public void displayrcardTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redcard_a_team);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Redcard for Team B .
     */
    public void displayrcardTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.recard_b_team);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Yellow card for Team A .
     */
    public void displayYcardTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ycard_a_team);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Yellow card for Team B .
     */
    public void displayYcardTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ycard_b_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Corners card for Team A.
     */
    public void displaycornerTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corner_a_team);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Corners card for Team B.
     */
    public void displaycornerTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corner_b_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Shoots card for Team A.
     */
    public void displayshootTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shoot_a_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Shoots card for Team B.
     */
    public void displayshootTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shoot_b_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the Goal for Team A when clicked.
     */
    public void GoalA(View view) {
        goalTeamA = goalTeamA +1;
        displaygoalTeamA(goalTeamA);
    }

    /**
     * Increase the Goal for Team B when clicked.
     */
    public void GoalB(View view) {
        goalTeamB = goalTeamB +1;
        displaygoalTeamB(goalTeamB);
    }
    /**
     * Increase the Foul for Team A when clicked.
     */
    public void FoulA(View view) {
        foulTeamA = foulTeamA +1;
        displayfoulTeamA(foulTeamA);
    }
    /**
     * Increase the Foul for Team B when clicked.
     */
    public void FoulB(View view) {
        foulTeamB = foulTeamB +1;
        displayfoulTeamB(foulTeamB);
    }
    /**
     * Increase the Rcard for Team A when clicked.
     */
    public void RedCardA(View view) {
        RcardTeamA = RcardTeamA+1;
        displayrcardTeamA(RcardTeamA);
    }
    /**
     * Increase the Rcard for Team B when clicked.
     */
    public void RCardB(View view) {
        RcardTeamB = RcardTeamB+1;
        displayrcardTeamB(RcardTeamB);
    }
    /**
     * Increase the Ycard for Team A when clicked.
     */
    public void YCardA(View view) {
        YcardTeamA = YcardTeamA +1;
        displayYcardTeamA(YcardTeamA);
    }


    /**
     * Increase the Ycard for Team B when clicked.
     */
    public void YCardB(View view) {
        YcardTeamB = YcardTeamB +1;
        displayYcardTeamB(YcardTeamB);
    }
    /**
     * Increase the Corner for Team A when clicked.
     */
    public void CornerA(View view) {
        cornerTeamA = cornerTeamA +1;
        displaycornerTeamA(cornerTeamA);
    }

    /**
     * Increase the Corner for Team B when clicked.
     */
    public void CornerB(View view) {
        cornerTeamB = cornerTeamB +1;
        displaycornerTeamB(cornerTeamB);
    }
    /**
     * Increase the Shoot for Team A when clicked.
     */
    public void ShootA(View view) {
        shootTeamA = shootTeamA +1;
        displayshootTeamA(shootTeamA);
    }
    /**
     * Increase the Shoot for Team B when clicked.
     */
    public void ShootB(View view) {
        shootTeamB = shootTeamB +1;
        displayshootTeamB(shootTeamB);
    }

    public void Rest(View view) {
        goalTeamA = 0;
        goalTeamB =0;
        foulTeamA= 0;
        foulTeamB= 0;
        RcardTeamA=0;
        RcardTeamB=0;
        YcardTeamA=0;
        YcardTeamB=0;
        cornerTeamA=0;
        cornerTeamB=0;
        shootTeamA=0;
        shootTeamB=0;
        displaygoalTeamA(goalTeamA);
        displaygoalTeamB(goalTeamB);
        displayfoulTeamA(foulTeamA);
        displayfoulTeamB(foulTeamB);
        displayrcardTeamA(RcardTeamA);
        displayrcardTeamB(RcardTeamB);
        displayYcardTeamA(YcardTeamA);
        displayYcardTeamB(YcardTeamB);
        displaycornerTeamA(cornerTeamA);
        displaycornerTeamB(cornerTeamB);
        displayshootTeamA(shootTeamA);
        displayshootTeamB(shootTeamB);



    }
}
