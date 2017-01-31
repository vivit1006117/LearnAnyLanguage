package com.example.android.learnLanguage.commonWords;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.learnLanguage.R;
import com.example.android.learnLanguage.word.Word;
import com.example.android.learnLanguage.word.WordAdapter;

import java.util.ArrayList;

import static com.example.android.learnLanguage.R.layout.custom_list_layout;

public class ColorsActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
//    AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("One", "Ondu", R.mipmap.number_one, R.raw.number_one));
        words.add(new Word("Two", "Eraḍu", R.mipmap.number_two, R.raw.number_two));
        words.add(new Word("Three", "Mūru", R.mipmap.number_three, R.raw.number_three));
        words.add(new Word("Four", "Nālku", R.mipmap.number_four, R.raw.number_four));
        words.add(new Word("Five", "Aidu", R.mipmap.number_five, R.raw.number_five));
        words.add(new Word("Six", "Āru", R.mipmap.number_six, R.raw.number_six));
        words.add(new Word("Seven", "Ēḷu", R.mipmap.number_seven, R.raw.number_seven));
        words.add(new Word("Eight", "Eṇṭu", R.mipmap.number_eight, R.raw.number_eight));
        words.add(new Word("Nine", "Ombattu", R.mipmap.number_nine, R.raw.number_nine));
        words.add(new Word("Ten", "Hattu", R.mipmap.number_ten, R.raw.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, custom_list_layout, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.color_list);

        assert listView != null;
        listView.setAdapter(itemsAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }

                Word word = words.get(position);
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioPath());
                mediaPlayer.start();
                MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {

                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release();
                    }
                };
                mediaPlayer.setOnCompletionListener(onCompletionListener);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null)
            mediaPlayer.release();
    }

//    private void audioFocus(){
//        AudioManager.OnAudioFocusChangeListener audioFocusListener = new AudioManager.OnAudioFocusChangeListener() {
//            @Override
//            public void onAudioFocusChange(int focusChange) {
//                if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
//                        focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
//                    mediaPlayer.pause();
//                    mediaPlayer.seekTo(0);
//                } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
//                    mediaPlayer.start();
//                } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
//                    mediaPlayer.release();
//                }
//            }
//        };
//
//        audioManager.requestAudioFocus(audioFocusListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//    }
}
