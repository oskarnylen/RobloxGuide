package com.edu.chalmers.robloxguide;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoopBlockActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop_block);

        TextView title = (TextView) findViewById(R.id.mainTitle);
        TextView description = (TextView) findViewById(R.id.mainDescriptionText);
        TextView exampleText = (TextView) findViewById(R.id.exempelText);

        Typeface font = Typeface.createFromAsset(getAssets(), "BradBunR.ttf");

        title.setTypeface(font);
        description.setTypeface(font);
        exampleText.setTypeface(font);

        ImageButton backButton = (ImageButton) findViewById(R.id.tillbakaButton);
        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                finish();
            }
        });

        ImageButton homeButton = (ImageButton) findViewById(R.id.hemButton);
        homeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                Intent intent = new Intent(LoopBlockActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |  Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        ImageButton fourButton = (ImageButton) findViewById(R.id.fourButton);
        fourButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                Intent intent = new Intent(LoopBlockActivity.this, NumberBlockActivity.class);
                startActivity(intent);
            }
        });

        ImageButton mainButton = (ImageButton) findViewById(R.id.mainButton);
        mainButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                Intent intent = new Intent(LoopBlockActivity.this, MainBlockActivity.class);
                startActivity(intent);
            }
        });

        ImageButton forwardButton1 = (ImageButton) findViewById(R.id.forwardButton1);
        forwardButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                Intent intent = new Intent(LoopBlockActivity.this, ForwardBlockActivity.class);
                startActivity(intent);
            }
        });

        ImageButton forwardButton2 = (ImageButton) findViewById(R.id.forwardButton2);
        forwardButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                Intent intent = new Intent(LoopBlockActivity.this, ForwardBlockActivity.class);
                startActivity(intent);
            }
        });

        ImageButton rotateButton = (ImageButton) findViewById(R.id.rotationRightButton);
        rotateButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                Intent intent = new Intent(LoopBlockActivity.this, ForwardBlockActivity.class);
                startActivity(intent);
            }
        });
    }
}
