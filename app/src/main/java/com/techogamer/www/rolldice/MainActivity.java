package com.techogamer.www.rolldice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton = findViewById(R.id.roll_button);

        final ImageView dice1 = findViewById(R.id.dice1_img);
        final ImageView dice2 = findViewById(R.id.dice2_img);

        final int[] dice = new int[]{
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r1 = new Random();
                int d1 = r1.nextInt(6);
                dice1.setImageResource(dice[d1]);

                Random r2 = new Random();
                int d2 = r2.nextInt(6);
                dice2.setImageResource(dice[d2]);

            }
        });
    }
}
