package com.example.android.nbascorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        int labScore = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        /**
         * Reset the score for both teams back to zero.
         */
        public void resetScore (View view) {
            labScore = 0;
            dalScore = 0;
            displayForLab(labScore);
            displayForDal(dalScore);
        }

        /**
         * Increase the score for Team A by 3 points.
         */
        public void addThreeForLab(View view) {
            labScore = labScore + 3;
            displayForLab(labScore);

        }

        /**
         * Increase the score for Team A by 2 points.
         */
        public void addTwoForLab(View view) {
            labScore = labScore + 2;
            displayForLab(labScore);

        }

        /**
         *
         Increase the score for Team A by 1 points.
         */
        public void addOneForLab (View view) {
            labScore = labScore +1;
            displayForLab(labScore);
        }

        /**
         * Displays the given score for Los Angeles Lakers.
         */
        public void displayForLab(int score) {
            TextView scoreView = (TextView) findViewById(R.id.labscore);
            scoreView.setText(String.valueOf(score));
        }

        int dalScore = 0;

        /**
         * Increase the score for Dallas Mavericks by 3 points.
         */
        public void addThreeForDal (View view) {
            dalScore = dalScore + 3;
            displayForDal(dalScore);

        }

        /**
         * Increase the score for Dallas Mavericks by 2 points.
         */
        public void addTwoForDal (View view) {
            dalScore = dalScore + 2;
            displayForDal(dalScore);

        }

        /**
         * Increase the score for  Dallas Mavericks by 1 points.
         */
        public void addOneForDal (View view) {
            dalScore = dalScore +1;
            displayForDal(dalScore);
        }


        /**
         * Displays the given score for Dallas Mavericks.
         */
        public void displayForDal(int score) {
            TextView scoreView = (TextView) findViewById(R.id.dalscore);
            scoreView.setText(String.valueOf(score));
        }

    }


