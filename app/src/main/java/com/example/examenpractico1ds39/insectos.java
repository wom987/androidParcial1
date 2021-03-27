package com.example.examenpractico1ds39;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class insectos extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insectos);

        videoView = (VideoView) findViewById(R.id.vv_insectos);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.insectos));

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        videoView.start();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
}