package edu.memphis.samples;

import android.content.Context;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView textValue = findViewById(R.id.value_text);
                String stringValue = textValue.getText().toString();
                int originalValue = Integer.parseInt(stringValue);
                int newValue = MyWorker.doubleTheValue(originalValue);
                textValue.setText(Integer.toString(newValue));

                //Log.i("info", "In the oncreate");

                //Toast.makeText(getApplicationContext(), "Our message", Toast.LENGTH_SHORT).show();
                Snackbar.make(view, "Changed value " + originalValue + " to " + newValue, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void topClick(View c){

        Toast.makeText(this, "Top button clicked", Toast.LENGTH_SHORT).show();

        Log.i("info", "In the topCick");
    }

    public void bottomClick(View b){


        Toast.makeText(this, "Bottom button clicked", Toast.LENGTH_SHORT).show();
        Log.i("info", "In the bottomClick");
    }
}
