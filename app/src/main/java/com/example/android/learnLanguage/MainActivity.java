package com.example.android.learnLanguage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.learnLanguage.commonWords.ColorsActivity;
import com.example.android.learnLanguage.commonWords.FamilyActivity;
import com.example.android.learnLanguage.commonWords.NumbersActivity;
import com.example.android.learnLanguage.commonWords.PhrasesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        genericCLickHandling(NumbersActivity.class, R.id.numbers);
        genericCLickHandling(ColorsActivity.class, R.id.colors);
        genericCLickHandling(FamilyActivity.class, R.id.family);
        genericCLickHandling(PhrasesActivity.class, R.id.phrases);
    }

    private void genericCLickHandling(final Class activityClassToBeCalled, int idOfText) {
        TextView numbers = (TextView) findViewById(idOfText);

        assert numbers != null;
        numbers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, activityClassToBeCalled);
                startActivity(numbersIntent);
            }
        });
    }
}
