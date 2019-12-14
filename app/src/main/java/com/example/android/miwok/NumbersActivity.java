package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // ceate an array of words
        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");


//        Log.v("NumbersActivity","words at index 0: " + words.get(0));
//        Log.v("NumbersActivity","words at index 1: " + words.get(1));
//        Log.v("NumbersActivity","words at index 2: " + words.get(2));
//        Log.v("NumbersActivity","words at index 3: " + words.get(3));
//        Log.v("NumbersActivity","words at index 4: " + words.get(4));
//        Log.v("NumbersActivity","words at index 5: " + words.get(5));
    }
}
