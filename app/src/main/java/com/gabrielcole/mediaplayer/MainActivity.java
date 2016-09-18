package com.gabrielcole.mediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private ImageView mPlayIcon;
    private ImageView mPauseIcon;
    private ImageView mStopIcon;

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMediaPlayer = MediaPlayer.create(this, R.raw.no_romeo);

        mPlayIcon = (ImageView)findViewById(R.id.play_icon);
        mPlayIcon.setOnClickListener(this);
        mPauseIcon = (ImageView)findViewById(R.id.pause_icon);
        mPauseIcon.setOnClickListener(this);
        mStopIcon = (ImageView)findViewById(R.id.stop_icon);
        mStopIcon.setOnClickListener(this);
        mPauseIcon.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.play_icon:
                mMediaPlayer.start();
                mPlayIcon.setVisibility(View.INVISIBLE);
                mPauseIcon.setVisibility(View.VISIBLE);
                break;
            case R.id.pause_icon:
                mMediaPlayer.pause();
                mPauseIcon.setVisibility(View.INVISIBLE);
                mPlayIcon.setVisibility(View.VISIBLE);
                break;
            case R.id.stop_icon:
                mMediaPlayer.reset();
                mPlayIcon.setVisibility(View.VISIBLE);
                mPauseIcon.setVisibility(View.INVISIBLE);
                mMediaPlayer = MediaPlayer.create(this, R.raw.no_romeo);
                break;
        }
    }
}
