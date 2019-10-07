package edu.memphis.switchdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String command = "go east";

        switch (command) {
            case "go east":
                    Log.i("Info", "Payer moves to the east");
                    break;
            case "go west":
                Log.i("Info", "Payer moves to the west");
                break;
            case "go north":
                Log.i("Info", "Payer moves to the north");
                break;
            case "go south":
                Log.i("Info", "Payer moves to the soutch");
                break;
            default:
                Log.i("Info", "Sorry i don't speak elfish");
                break;
        }
    }
}
