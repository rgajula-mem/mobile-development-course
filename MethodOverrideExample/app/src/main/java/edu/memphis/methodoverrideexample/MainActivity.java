package edu.memphis.methodoverrideexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Book book = new AndroidProgrammingForBeginners
                ("978-1-78953-850-2",
                        "Android Programming for Beginners",
                        "Build in-depth, full featured Android");



        Log.i("Book Information = " , book.bookInfo());
    }
}
