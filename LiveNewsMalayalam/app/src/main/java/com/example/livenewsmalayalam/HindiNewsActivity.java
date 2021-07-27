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

public class HindiNewsActivity extends AppCompatActivity {
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


                if (tvTitletest.equals("Republic")) {


                    String videoId = "QwBcy3Kb6QQ";


                    youTubePlayer.loadVideo(videoId, 0);
                }

                if (tvTitletest.equals("Aaj Tak")) {


                    String videoId = "cnX9fQEq59A";


                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (tvTitletest.equals("NDTV")) {


                    String videoId = "MN8p-Vrn6G0";


                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (tvTitletest.equals("India TV")) {


                    String videoId = "k9MyH_YJp-0";


                    youTubePlayer.loadVideo(videoId, 0);
                }
                if (tvTitletest.equals("India Today")) {


                    String videoId = "heFq-5rmUTY";


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