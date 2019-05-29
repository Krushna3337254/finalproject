package com.example.krushnanrathod.kids;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {
    ImageView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        try {

            requestWindowFeature(Window.FEATURE_NO_TITLE);                                      //makes and activity full screen            or removes the title bar
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            //Hiding the status bar

            super.onCreate( savedInstanceState );
            setContentView( R.layout.activity_splash_screen );

            ConstraintLayout constraintLayout = findViewById(R.id.layout);

            AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
            animationDrawable.setEnterFadeDuration(3000);
            animationDrawable.setExitFadeDuration(1000);
            animationDrawable.start();


           i=findViewById( R.id.imageView );

            Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha);
            i.startAnimation(fadeInAnimation);

            //creating thread that will sleep for 3 seconds
            Thread t = new Thread() {
                public void run() {
                    try {
                        //sleep thread for 3 seconds, time in milliseconds


                        sleep(3000);
                        //start new activity
                        Intent i = new Intent(Splash_Screen.this, MainActivity.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.translate, R.anim.fade_out);

                        //destroying Splash activity
                        finish();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            //start thread
            t.start();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}