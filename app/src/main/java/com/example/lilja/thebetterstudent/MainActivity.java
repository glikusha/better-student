package com.example.lilja.thebetterstudent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * declaring global
     * variables *
     */

    int scoreStudentA = 0;
    int scoreStudentB = 0;
    int clikedStudentA = 0; // shows how many times the grade was clicked for student A
    int clikedStudentB = 0;
    int averageA = 0;
    int averageB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForStudentA(scoreStudentA);
        displayForStudentB(scoreStudentB);
    }

    public void display(String score) {
        TextView scoreView = (TextView) findViewById(R.id.the_best_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Student A.
     * <p>
     * When the corresponding button is pressed it adds 5, 4, 3 or 2 points.
     * <p>
     * When anything is pressed the clickedStudent is added by 1. Later it will help to count average
     */

    public void displayForStudentA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.student_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addFiveStudentA(View v) {
        scoreStudentA += 5;
        clikedStudentA += 1;
        displayForStudentA(scoreStudentA);
    }

    public void addFourStudentA(View v) {
        scoreStudentA += 4;
        clikedStudentA += 1;
        displayForStudentA(scoreStudentA);

    }

    public void addThreeStudentA(View v) {
        scoreStudentA += 3;
        clikedStudentA += 1;
        displayForStudentA(scoreStudentA);

    }

    public void addTwoStudentA(View v) {
        scoreStudentA += 2;
        clikedStudentA += 1;
        displayForStudentA(scoreStudentA);

    }

    public void AverageStudentA(View v) {
        averageA = scoreStudentA / clikedStudentA;
        displayForStudentA(averageA);
    }

    /**
     * The student b
     * <p>
     * When the corresponding button is pressed it adds 5, 4, 3 or 2 points.
     * <p>
     * When anything is pressed the clickedStudent is added by 1. Later it will help to count average
     */
    public void displayForStudentB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.student_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addFiveStudentB(View v) {
        scoreStudentB += 5;
        clikedStudentB += 1;
        displayForStudentB(scoreStudentB);
    }

    public void addFourStudentB(View v) {
        scoreStudentB += 4;
        clikedStudentB += 1;
        displayForStudentB(scoreStudentB);

    }

    public void addThreeStudentB(View v) {
        scoreStudentB += 3;
        clikedStudentB += 1;
        displayForStudentB(scoreStudentB);

    }

    public void addTwoStudentB(View v) {
        scoreStudentB += 2;
        clikedStudentB += 1;
        displayForStudentB(scoreStudentB);

    }

    public void AverageStudentB(View v) {
        averageB = scoreStudentB / clikedStudentB;
        displayForStudentB(averageB);
    }

    /* counting the better student result and displaying the result in a textview
    * @param View v
    *
    * */
    public void reset(View v) {

        //so that we don't devide by 0, we display a message:

        if (clikedStudentA == 0 || clikedStudentB == 0) {
            display("Hey, the other student should also partisipate. Give him a grade");
        } else {

            if ((scoreStudentA / clikedStudentA) > (scoreStudentB / clikedStudentB)) {
                display("Student A is better");
            } else if ((scoreStudentA / clikedStudentA) < (scoreStudentB / clikedStudentB)) {
                display("Student B is better");
            } else {
                display("They are both smart");
            }
        }
    }

    /*
    * The function to reset all the results. Connected to the button.
    * Makes all variables 0 again and display blank
    * @param View v
    *
    * */
    public void resetAll(View v) {
        scoreStudentB = 0;
        displayForStudentB(scoreStudentB);
        scoreStudentA = 0;
        displayForStudentA(scoreStudentA);
        display(" ");
        clikedStudentB = 0;
        clikedStudentA = 0;
    }
}