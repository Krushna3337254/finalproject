package com.example.krushnanrathod.kids;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button learning,game,poems,story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        learning=findViewById( R.id.kidslearning );
        game=findViewById( R.id.kidsgames );
        poems=findViewById( R.id.videopoems );
        story=findViewById( R.id.Storytelling );

        learning.setOnClickListener( this );
        game.setOnClickListener( this );
        poems.setOnClickListener( this );
        story.setOnClickListener( this );
//        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
   }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.kidslearning:
                startActivity( new Intent( MainActivity.this,Kids_Learning.class ) );
                break;


            case R.id.kidsgames:
                startActivity( new Intent( MainActivity.this,Kids_Games.class ) );
                break;

            case R.id.videopoems:
                startActivity( new Intent( MainActivity.this,Videopoems.class ) );
                break;

            case R.id.Storytelling:
                break;

        }
    }
}
