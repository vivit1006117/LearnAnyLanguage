package com.example.android.learnLanguage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        for (String word : words){
            addView(word, rootView);
        }
    }

    private void addView(String word, LinearLayout rootView) {
        TextView wordView  = new TextView(this);
        wordView.setText(word);
        rootView.addView(wordView);
    }
}
