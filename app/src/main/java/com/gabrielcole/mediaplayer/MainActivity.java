package com.gabrielcole.mediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        mStopButton = (Button)findViewById(R.id.stop_button);
        mResetButton = (Button)findViewById(R.id.reset_button);

    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.play_button:
        }
    }
}
