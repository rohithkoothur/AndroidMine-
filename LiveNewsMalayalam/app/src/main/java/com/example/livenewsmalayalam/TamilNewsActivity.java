package com.example.livenewsmalayalam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class TamilNewsActivity extends AppCompatActivity {
    TextView myTitle;
    YouTubePlayerView youTubePlayerView;
    String tvTitletest;
    String tvTitletest1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myTitle = (TextView) findViewById(R.id.myTitle);


        Intent intent = getIntent();
        tvTitletest = intent.getStringExtra("tvTitletest");


        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {


            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {


                if (tvTitletest.equals("Sun News")) {


                    String videoId = "xnk9g38W_5w";


                    youTubePlayer.loadVideo(videoId, 0);
                }

                if (tvTitletest.equals("Puthiyathalaimurai")) {


                    String videoId = "JddGlT64N2s";


                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (tvTitletest.equals("Polimer News")) {


                    String videoId = "yKMT5aJl7yI";


                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (tvTitletest.equals("News18 Tamil")) {


                    String videoId = "EZy0RAxG8OI";


                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (tvTitletest.equals("Jaya Plus")) {


                    String videoId = "IfsBdgz4TZk";


                    youTubePlayer.loadVideo(videoId, 0);
                }


            }
        });


        playutub();


    }

    private void playutub() {

        ;


        myTitle.setText(tvTitletest);

    }


}