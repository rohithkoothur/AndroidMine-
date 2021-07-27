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

public class MalayalamNewsActivity extends AppCompatActivity {
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


                if (tvTitletest.equals("Janam")) {


                    String videoId = "_WK30gnY3_4";


                    youTubePlayer.loadVideo(videoId, 0);
                }

                if (tvTitletest.equals("Mathruboomi")) {


                    String videoId = "z3EoIQAKJ5c";


                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (tvTitletest.equals("Asianet News")) {


                    String videoId = "JstrU2QnMY0";


                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (tvTitletest.equals("Kairali News")) {


                    String videoId = "ET5Y3H3Jusc";


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