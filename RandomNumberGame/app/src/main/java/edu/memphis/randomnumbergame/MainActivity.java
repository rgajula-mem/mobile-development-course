package edu.memphis.randomnumbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int leftRandomValue;
    private int rightRandomValue;
    private int points=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leftRandomValue = getRandomNumber(1, 100);
        rightRandomValue = getRandomNumber(1, 100);

        // text view reference
        TextView leftTextView=(TextView)findViewById(R.id.leftRandomButton);
        // set the value of the left button
        leftTextView.setText(String.valueOf(leftRandomValue));

        // get the reference for the right button
        TextView rightTextView=(TextView)findViewById(R.id.rightRandomButton);

        // String valueOf --> Converts the int to String
        rightTextView.setText(String.valueOf(rightRandomValue));

    }


    public void leftButtonOnClick(View view){

        leftRandomValue = getRandomNumber(1, 100);
        // text view reference
        TextView leftTextView=(TextView)findViewById(R.id.leftRandomButton);
        leftTextView.setText(String.valueOf(leftRandomValue));


        if (leftRandomValue > rightRandomValue){
            points++;
        }

        // get the reference of the points text view
        TextView pointTextView = (TextView)findViewById(R.id.pointTextViewId);
        // set text with the points
        pointTextView.setText("Total Points:  " + String.valueOf(points));

    }

    public void rightButtonOnClick(View view){

        rightRandomValue = getRandomNumber(1, 100);
        // text view reference
        TextView leftTextView=(TextView)findViewById(R.id.rightRandomButton);
        leftTextView.setText(String.valueOf(rightRandomValue));


        if (rightRandomValue > leftRandomValue){
            points++;
        }

        // get the reference of the points text view
        TextView pointTextView = (TextView)findViewById(R.id.pointTextViewId);
        // set text with the points
        pointTextView.setText("Total Points:  " + String.valueOf(points));

    }

    private int getRandomNumber(int min, int max){
        Random random = new Random();
        int nextRandom = random.nextInt((max-min)+1)+ min;
        return nextRandom;

    }
}
