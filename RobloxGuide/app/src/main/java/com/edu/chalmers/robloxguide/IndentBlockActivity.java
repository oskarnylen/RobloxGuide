package com.edu.chalmers.robloxguide;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class IndentBlockActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indent_block);

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
                Intent intent = new Intent(IndentBlockActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |  Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });


        ImageButton loopButton = (ImageButton) findViewById(R.id.loopButton1);
        loopButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                Intent intent = new Intent(IndentBlockActivity.this, LoopBlockActivity.class);
                startActivity(intent);
            }
        });

        ImageButton loopButton2 = (ImageButton) findViewById(R.id.loopButton2);
        loopButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                Intent intent = new Intent(IndentBlockActivity.this, LoopBlockActivity.class);
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
                Intent intent = new Intent(IndentBlockActivity.this, NumberBlockActivity.class);
                startActivity(intent);
            }
        });

        ImageButton twoButton = (ImageButton) findViewById(R.id.twoButton);
        twoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                Intent intent = new Intent(IndentBlockActivity.this, NumberBlockActivity.class);
                startActivity(intent);
            }
        });

        ImageButton forwardButton = (ImageButton) findViewById(R.id.forwardButton);
        forwardButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                Intent intent = new Intent(IndentBlockActivity.this, ForwardBlockActivity.class);
                startActivity(intent);
            }
        });

        ImageButton rotateRightButton = (ImageButton) findViewById(R.id.rotateRightButton);
        rotateRightButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                Intent intent = new Intent(IndentBlockActivity.this, ForwardBlockActivity.class);
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
                Intent intent = new Intent(IndentBlockActivity.this, MainBlockActivity.class);
                startActivity(intent);
            }
        });
    }
}
