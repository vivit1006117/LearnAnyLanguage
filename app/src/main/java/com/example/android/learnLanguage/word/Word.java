package com.example.android.learnLanguage.word;

import android.view.View;

public class Word {
    private final String fromLanguageText;
    private final String toLanguageText;
    private int imagePath;
    private int imageVisibility;

    public Word(String fromLanguageText, String toLanguageText, int imagePath) {
        this.fromLanguageText  =fromLanguageText;
        this.toLanguageText  = toLanguageText;
        this.imagePath = imagePath;
        this.imageVisibility = View.VISIBLE;
    }

    public Word(String fromLanguageText, String toLanguageText) {
        this.fromLanguageText = fromLanguageText;
        this.toLanguageText = toLanguageText;
        this.imageVisibility = View.GONE;
    }

    public String getFromLanguageText() {
        return fromLanguageText;
    }

    public String getToLanguageText() {
        return toLanguageText;
    }

    public int getImagePath() {
        return imagePath;
    }

    public int getImageVisibility() {
        return imageVisibility;
    }
}
