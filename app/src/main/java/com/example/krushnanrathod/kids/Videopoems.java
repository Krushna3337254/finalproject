package com.example.krushnanrathod.kids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Videopoems extends AppCompatActivity {
    TextView poems;
    Button Eng, Hin, Mar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_videopoems );

        poems=findViewById( R.id.textView );
        Eng=findViewById( R.id.English );
        Hin=findViewById( R.id.Hindi );
        Mar=findViewById( R.id.Marathi );


    }
}
