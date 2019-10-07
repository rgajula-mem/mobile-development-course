package edu.memphis.exploringmethodoverloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.i("Info ", printStuff(10));
        Log.i("Info", printStuff("John Doe"));
        Log.i("Info", printStuff(17, "John Doe"));
    }

    private String printStuff(int myInt){
        return "The paramater for printStuff is Int = " + myInt;

    }

    private String printStuff(String myString){
        return "The parameter for printStuff is String = " + myString;
    }

    private String printStuff(int myInt, String myString){
        return "The parameter for printStuff is myInt, myString "
                + myInt + ", " + myString;
    }


}
