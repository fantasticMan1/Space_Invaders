package com.losjyders.joshw.space_invaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Game extends AppCompatActivity {

    // Create an anonymous implementation of OnClickListener
    OnClickListener playListener = new OnClickListener() {

        public void onClick(View v) {
            // do something when the button is clicked
        }

    };

    //add other listeners HERE

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // Capture our button from layout
        Button button = (Button)findViewById(R.id.button);
        // Register the onClick listener with the implementation above
        button.setOnClickListener(playListener);

        //implement other listeners HERE

    }

}
