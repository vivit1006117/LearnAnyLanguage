package com.example.android.learnLanguage.word;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.learnLanguage.R;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int backGroundColor;

    public WordAdapter(Context context, int custom_list_layout, ArrayList<Word> words, int backgroundColor) {
        super(context, custom_list_layout, words);
        this.backGroundColor = backgroundColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        assert listItemView == null;
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_layout, parent, false);

        Word currentAndroidFlavor = getItem(position);

        ImageView imagePath = (ImageView) listItemView.findViewById(R.id.related_image);
        imagePath.setImageResource(currentAndroidFlavor.getImagePath());
        imagePath.setVisibility(currentAndroidFlavor.getImageVisibility());

        View textField = listItemView.findViewById(R.id.text_field);
        int color = ContextCompat.getColor(getContext(), backGroundColor);
        textField.setBackgroundColor(color);

        TextView formLanguage = (TextView) listItemView.findViewById(R.id.from_text);
        formLanguage.setText(currentAndroidFlavor.getFromLanguageText());

        TextView toLanguage = (TextView) listItemView.findViewById(R.id.to_text);
        toLanguage.setText(currentAndroidFlavor.getToLanguageText());

        return listItemView;
    }
}
