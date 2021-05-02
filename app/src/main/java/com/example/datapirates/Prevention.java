package com.example.datapirates;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;
import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.Vector;

public class Prevention extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

        getSupportActionBar().hide();//hides actionbar


        VideoView videoView=findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.prevention;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        VideoView videoView1=findViewById(R.id.videoView1);
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.symptoms;
        Uri uri1 = Uri.parse(videoPath1);
        videoView1.setVideoURI(uri1);

        MediaController mediaController1 = new MediaController(this);
        videoView1.setMediaController(mediaController1);
        mediaController1.setAnchorView(videoView1);
    }


}