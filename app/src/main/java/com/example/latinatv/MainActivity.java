package com.example.latinatv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.exoplayer2.ui.PlayerView;

import am.mediastre.mediastreamplatformsdkandroid.MediastreamPlayer;
import am.mediastre.mediastreamplatformsdkandroid.MediastreamPlayerConfig;

public class MainActivity extends AppCompatActivity {

    private FrameLayout container;
    private PlayerView playerView;
    private MediastreamPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediastreamPlayerConfig config = new MediastreamPlayerConfig();
        //config.id = "5ce7109c7398b977dc0744cd";
        config.id = "5d796a3d68048e23dd54bafb";
        //config.environment = MediastreamPlayerConfig.Environment.DEV;
        config.accountID = "5ce70c587398b977dc0743b5";
        //config.type = MediastreamPlayerConfig.VideoTypes.LIVE;
        config.type = MediastreamPlayerConfig.VideoTypes.VOD;
        playerView = findViewById(R.id.player_view);
        container = findViewById(R.id.main_media_frame);
        player = new MediastreamPlayer(this, config, container, playerView);
    }

    @Override
    public void onBackPressed() {
        player.releasePlayer();
        this.finish();
    }
}
