package com.example.krushnanrathod.kids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Kids_Games extends AppCompatActivity {
    Button guess_game,match_number,catch_number,sub_run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_kids__games );


        guess_game=findViewById( R.id.guess_game );
        match_number=findViewById( R.id.match_number );
        catch_number=findViewById( R.id.catch_number );
        sub_run=findViewById( R.id.sub_run );
    }
}
