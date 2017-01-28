/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.learnLanguage.commonWords;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.learnLanguage.R;
import com.example.android.learnLanguage.word.Word;
import com.example.android.learnLanguage.word.WordAdapter;

import java.util.ArrayList;

import static com.example.android.learnLanguage.R.layout.custom_list_layout;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("One", "Ondu", R.mipmap.number_one));
        words.add(new Word("Two", "Eraḍu", R.mipmap.number_two));
        words.add(new Word("Three", "Mūru", R.mipmap.number_three));
        words.add(new Word("Four", "Nālku", R.mipmap.number_four));
        words.add(new Word("Five", "Aidu", R.mipmap.number_five));
        words.add(new Word("Six", "Āru", R.mipmap.number_six));
        words.add(new Word("Seven", "Ēḷu", R.mipmap.number_seven));
        words.add(new Word("Eight", "Eṇṭu", R.mipmap.number_eight));
        words.add(new Word("Nine", "Ombattu", R.mipmap.number_nine));
        words.add(new Word("Ten", "Hattu", R.mipmap.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, custom_list_layout, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.color_list);

        assert listView != null;
        listView.setAdapter(itemsAdapter);
    }
}
