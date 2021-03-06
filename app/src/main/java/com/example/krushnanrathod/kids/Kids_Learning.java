package com.example.krushnanrathod.kids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Kids_Learning extends AppCompatActivity implements View.OnClickListener {
    TextView learning;
    Button eng, hin, pract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_kids__learning );

        learning=findViewById( R.id.learning );
        eng=findViewById( R.id.English );
        hin=findViewById( R.id.Hindi );
        pract=findViewById( R.id.practice );


        eng.setOnClickListener( this );
        hin.setOnClickListener( this );
        pract.setOnClickListener( this );


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.English:
                Intent i=new Intent( Kids_Learning.this, Eng_Learning.class );
                overridePendingTransition(R.anim.alpha, R.anim.alpha);
                startActivity( i );
                break;

            case R.id.Hindi:
                Intent i1=new Intent( Kids_Learning.this, Hin_Learning.class );
                overridePendingTransition(R.anim.alpha, R.anim.alpha);
                startActivity( i1 );
                break;

            case R.id.practice:
                Intent i2=new Intent( Kids_Learning.this, Gestures.class );
                overridePendingTransition(R.anim.alpha, R.anim.alpha);
                startActivity( i2 );
                break;

        }
    }

}
