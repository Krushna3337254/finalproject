package com.example.krushnanrathod.kids;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class Poems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_poems );

        VideoView videoView =(VideoView)findViewById(R.id.videoView1);

        String path = "android.resource://" + getPackageName() + "/" + R.raw.mastani;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }
}
