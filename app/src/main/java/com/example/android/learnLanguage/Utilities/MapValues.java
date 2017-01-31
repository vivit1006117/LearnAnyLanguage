package com.example.android.learnLanguage.Utilities;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;

import com.example.android.learnLanguage.R;
import com.example.android.learnLanguage.commonWords.ColorsActivity;
import com.example.android.learnLanguage.word.Word;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class MapValues extends AppCompatActivity {

    public static ArrayList<Word> readValue(String readType) {
        JsonFactory jsonFactory = new JsonFactory();
        try {
            JsonParser jsonParser = jsonFactory.createJsonParser(new File("/Users/kvivek/LearnAnyLanguage/app/src/resourses/EnglishToKannada.json"));
            jsonParser.setCodec(new ObjectMapper());
            JsonNode jsonNode = jsonParser.readValueAsTree();
            System.out.println(readJsonData(jsonNode.get(readType)).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Word> ss = new ArrayList<>();
//        ss.add(new Word("One", "sdfgd", R.mipmap.number_one, MediaPlayer.create(ColorsActivity.class, R.raw.number_one)));
        return ss;
    }

    static ArrayList<Word> readJsonData(JsonNode jsonNodes) {
        Iterator<Map.Entry<String, JsonNode>> iterator = jsonNodes.fields();
        ArrayList<Word> words = new ArrayList<>();
        while (iterator.hasNext()) {
            Map.Entry<String, JsonNode> entry = iterator.next();
            String value = entry.getValue().textValue();
//            words.add(new Word(entry.getKey(), value, R.mipmap.number_one, R.raw.number_one));
        }
        System.out.println(words.toString());
        return words;
    }
}
