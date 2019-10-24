package edu.memphis.sampleclassexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Note: Book is a class, it is the blue print for Book.
        // To create a object based on the class(blue print), use operator 'new'
        // Here is how you create instance of the book
        Book book1 = new Book(
                        "Android Programming",
                        "Jacob",
                        "1232-1234",
                        100 );

        // create a second instance of book
        Book book2 = new Book(
                        "Java Programming",
                        "Josh Long",
                        "12323-2343",
                        200);

        // Add list of books to the book store
        // array list start from the index 0
        List<Book> bookStore = new ArrayList<>();
        bookStore.add(book1);
        bookStore.add(book2);

        // this will display the total objects in the list
        Toast.makeText(this,
                "Total # " + bookStore.size(),
                Toast.LENGTH_LONG).show();

        // Loop through the array list
        for (Book book:bookStore) {
            Log.i("Info: ", book.toString());
        }

        // Array list starts from index 0 , so when you add two objects
        // to the array list it added at index 0, and index 1
        // This will get the second object from the array list
        Book book = bookStore.get(1);
        Log.i("Info", "Getting the second book from the list :" + book);

        // What happens when you use an index to get an object that does not exists
        // for example: try to get third object (index 2) which does not get exits
        // the application will crash with exception -- Index out of bound exception
        // Book book2 = bookStore.get(2);

        // how to remove the object that is added to the array list
        // remove the first object
        bookStore.remove(0);

        //! This will display there is only one object
        Toast.makeText(this,
                "New Total # " + bookStore.size(),
                Toast.LENGTH_LONG).show();

    }


}
