package com.example.android.learnLanguage.commonWords;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.learnLanguage.R;
import com.example.android.learnLanguage.Utilities.MapValues;
import com.example.android.learnLanguage.word.WordAdapter;

import static com.example.android.learnLanguage.R.layout.custom_list_layout;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        WordAdapter itemsAdapter = new WordAdapter(this, custom_list_layout, MapValues.readValue("numbers"), R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.number_list);

        assert listView != null;
        listView.setAdapter(itemsAdapter);
    }
}
