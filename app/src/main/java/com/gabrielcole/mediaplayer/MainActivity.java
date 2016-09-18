package com.gabrielcole.mediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mPlayButton;
    private Button mStopButton;
    private Button mResetButton;

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMediaPlayer = MediaPlayer.create(this, R.raw.no_romeo);

        mPlayButton = (Button)findViewById(R.id.play_button);
        mPlayButton.setOnClickListener(this);
        mStopButton = (Button)findViewById(R.id.stop_button);
        mStopButton.setOnClickListener(this);
        mResetButton = (Button)findViewById(R.id.reset_button);
        mResetButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.play_button:
                mMediaPlayer.start();
                Log.v("PLAYER", mMediaPlayer.getDuration() + "");
                break;
            case R.id.stop_button:
                mMediaPlayer.pause();
                break;
            case R.id.reset_button:
                mMediaPlayer.reset();
                mMediaPlayer = MediaPlayer.create(this, R.raw.no_romeo);
                break;
        }
    }
}
