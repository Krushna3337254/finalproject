package com.example.krushnanrathod.kids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Videopoems extends AppCompatActivity implements View.OnClickListener {
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

        Eng.setOnClickListener( this );
        Hin.setOnClickListener( this );
        Mar.setOnClickListener( this );


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.English:
                Intent i=new Intent( Videopoems.this, Poems.class );
                overridePendingTransition(R.anim.alpha, R.anim.alpha);
                startActivity( i );
                break;

            case R.id.Hindi:
                Intent i1=new Intent( Videopoems.this, Poems.class );
                overridePendingTransition(R.anim.alpha, R.anim.alpha);
                startActivity( i1 );
                break;

            case R.id.Marathi:
                Intent i2=new Intent( Videopoems.this, Poems.class );
                overridePendingTransition(R.anim.alpha, R.anim.alpha);
                startActivity( i2 );
                break;


        }
    }
}
