package com.example.android.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**int scoreTeamA =0;
    int scoreTeamB = 0;
     */
    int scoreTeamA = 0;
    int addShotOnTargeTTeamA = 0;
    int addShotOffTargeTTeamA = 0;
    int addPossessionTeamA = 0;
    int addCornersTeamA = 0;
    int addYellowCardTeamA = 0;
    int addRedCardTeamA = 0;

    int scoreTeamB = 0;
    int addShotOnTargeTTeamB = 0;
    int  addShotOffTargeTTeamB= 0;
    int addPossessionTeamB = 0;
    int addCornersTeamB = 0;
    int addYellowCardTeamB= 0;
    int addRedCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * The code below will add 3 points to TeamA score when the
     * button +3 Points is clicked
     */
    public void addscoreA(View view) {

        if (scoreTeamA< 30) {
            scoreTeamA += 1;
            displayForTeamA(scoreTeamA);
        }

    }

    /**
     * The code below will add 2 points to TeamA score when the
     * button +2 Points is clicked
     */
    public void addShotOnTargeTForTeamA(View view) {

        if (addShotOnTargeTTeamA < 30) {
            addShotOnTargeTTeamA += 1;
            displayShotOnTargeTForTeamA(addShotOnTargeTTeamA);
        }
    }

    /**
     * The code below will add 1 point to TeamA score when the
     * button Free Throw is clicked
     */
    public void addShotOffTargeTForTeamA(View view) {

        if (addShotOffTargeTTeamA < 30) {
            addShotOffTargeTTeamA += 1;
            displayShotOffTargeTForTeamA(addShotOffTargeTTeamA);
        }
    }

    /**
     * The code below will add 1 point to TeamA score when the
     * button Free Throw is clicked
     */
    public void addPossessionForTeamA(View view) {

        if (addPossessionTeamA < 30) {
            addPossessionTeamA += 55;
            displayPossessionForTeamA(addPossessionTeamA);
        }
    }


    /**
     * The code below will add 3 points to TeamB score when the
     * button +3 Points is clicked
     */
    public void addCornersForTeamA(View view) {

        if (addCornersTeamA< 30) {
            addCornersTeamA += 1;
            displayCornersForTeamA(addCornersTeamA);
        }
    }

    /**
     * The code below will add 2 points to TeamB score when the
     * button +2 Points is clicked
     */
    public void addYellowCardForTeamA(View view) {

        if (addYellowCardTeamA < 30) {
            addYellowCardTeamA += 1;
            displayYellowCardForTeamA(addYellowCardTeamA);
        }
    }

    /**
     * The code below will add 1 point to TeamB score when the
     * button Free Throw is clicked
     */
    public void addRedCardForTeamA(View view) {

        if (addRedCardTeamA < 30) {
            addRedCardTeamA += 1;
            displayRedCardForTeamA(addRedCardTeamA);
        }
    }

    /**
     * The code below will add 3 points to TeamA score when the
     * button +3 Points is clicked
     */
    public void addscoreB(View view) {

        if (scoreTeamB< 30) {
            scoreTeamB += 1;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * The code below will add 2 points to TeamA score when the
     * button +2 Points is clicked
     */
    public void addShotOnTargeTForTeamB(View view) {

        if (addShotOnTargeTTeamB < 30) {
            addShotOnTargeTTeamB += 1;
            displayShotOnTargeTForTeamB(addShotOnTargeTTeamB);
        }
    }

    /**
     * The code below will add 1 point to TeamA score when the
     * button Free Throw is clicked
     */
    public void addShotOffTargeTForTeamB(View view) {

        if (addShotOffTargeTTeamB < 30) {
            addShotOffTargeTTeamB += 1;
            displayShotOffTargeTForTeamB(addShotOffTargeTTeamB);
        }
    }

    /**
     * The code below will add 1 point to TeamA score when the
     * button Free Throw is clicked
     */
    public void addPossessionForTeamB(View view) {

        if (addPossessionTeamB < 30) {
            addPossessionTeamB += 45;
            displayPossessionForTeamB(addPossessionTeamB);
        }
    }


    /**
     * The code below will add 3 points to TeamB score when the
     * button +3 Points is clicked
     */
    public void addCornersForTeamB(View view) {

        if (addCornersTeamB < 30) {
            addCornersTeamB += 1;
            displayCornersForTeamB(addCornersTeamB);
        }
    }

    /**
     * The code below will add 2 points to TeamB score when the
     * button +2 Points is clicked
     */
    public void addYellowCardForTeamB(View view) {

        if (addYellowCardTeamB < 30) {
            addYellowCardTeamB += 1;
            displayYellowCardForTeamB(addYellowCardTeamB);
        }
    }

    /**
     * The code below will add 1 point to TeamB score when the
     * button Free Throw is clicked
     */
    public void addRedCardForTeamB(View view) {

        if (addRedCardTeamB < 30) {
            addRedCardTeamB += 1;
            displayRedCardForTeamB(addRedCardTeamB);
        }
    }




    /**
     * To reset score for Team A and Team B
     * when the button is clicked
     */
    public void restScore(View view) {

        scoreTeamA = 0;
        addShotOnTargeTTeamA = 0;
        addShotOffTargeTTeamA = 0;
        addPossessionTeamA = 0;
        addCornersTeamA = 0;
        addYellowCardTeamA = 0;
        addRedCardTeamA = 0;

        scoreTeamB = 0;
        addShotOnTargeTTeamB = 0;
        addShotOffTargeTTeamB= 0;
        addPossessionTeamB = 0;
        addCornersTeamB = 0;
        addYellowCardTeamB= 0;
        addRedCardTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayShotOnTargeTForTeamA(addShotOnTargeTTeamA );
        displayShotOffTargeTForTeamA(addShotOffTargeTTeamA);
        displayPossessionForTeamA(addPossessionTeamA);
        displayCornersForTeamA(addCornersTeamA);
        displayYellowCardForTeamA(addYellowCardTeamA);
        displayRedCardForTeamA(addRedCardTeamA );

        displayForTeamB(scoreTeamB);
        displayShotOnTargeTForTeamB(addShotOnTargeTTeamB);
        displayShotOffTargeTForTeamB(addShotOffTargeTTeamB);
        displayPossessionForTeamB(addPossessionTeamB);
        displayCornersForTeamB(addCornersTeamB);
        displayYellowCardForTeamB(addYellowCardTeamB);
        displayRedCardForTeamB(addRedCardTeamB);


    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Displays the Shot On Target for Team A.
     */
    public void displayShotOnTargeTForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shot_on_target_textA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Displays the Shot Off Target for Team A.
     */
    public void displayShotOffTargeTForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shot_off_target_textA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Displays the Possession for Team A.
     */
    public void displayPossessionForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pos_textA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Displays the Possession for Team A.
     */
    public void displayCornersForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corners_textA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Displays the Possession for Team A.
     */
    public void displayYellowCardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_textA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Displays the Possession for Team A.
     */
    public void displayRedCardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_textA);
        scoreView.setText(String.valueOf(score));
    }






    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Displays the Shot On Target for Team A.
     */
    public void displayShotOnTargeTForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shot_on_target_textB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Displays the Shot Off Target for Team A.
     */
    public void displayShotOffTargeTForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shot_off_target_textB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Displays the Possession for Team A.
     */
    public void displayPossessionForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pos_textB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Displays the Possession for Team A.
     */
    public void displayCornersForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corners_textB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Displays the Possession for Team A.
     */
    public void displayYellowCardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_textB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This Displays the Possession for Team A.
     */
    public void displayRedCardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_textB);
        scoreView.setText(String.valueOf(score));
    }


}
