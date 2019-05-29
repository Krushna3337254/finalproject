package com.example.krushnanrathod.kids;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Switch;

import tyrantgit.explosionfield.ExplosionField;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button learning,game,poems,story;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );




       /* explosionField=ExplosionField.attach2Window( this );
        addListener(findViewById( R.id.main ));*/

        learning=findViewById( R.id.kidslearning );
        game=findViewById( R.id.kidsgames );
        poems=findViewById( R.id.videopoems );
        story=findViewById( R.id.Storytelling );

        learning.setOnClickListener( this );
        game.setOnClickListener( this );
        poems.setOnClickListener( this );
        story.setOnClickListener( this );
 }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.kidslearning:

                Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out);
                learning.startAnimation(fadeInAnimation);
                startActivity( new Intent( MainActivity.this,Kids_Learning.class ) );
             /*   Animation RightSwipe = AnimationUtils.loadAnimation(MainActivity.this, R.anim.right);
                ScreenAnimation.startAnimation(RightSwipe);*/

                overridePendingTransition(R.anim.left, R.anim.left);

                break;


            case R.id.kidsgames:
                startActivity( new Intent( MainActivity.this,Kids_Games.class ) );
                overridePendingTransition(R.anim.left, R.anim.left);

                break;

            case R.id.videopoems:
                startActivity( new Intent( MainActivity.this,Videopoems.class ) );
                overridePendingTransition(R.anim.left, R.anim.left);

                break;

            case R.id.Storytelling:
                break;

        }
    }


}
