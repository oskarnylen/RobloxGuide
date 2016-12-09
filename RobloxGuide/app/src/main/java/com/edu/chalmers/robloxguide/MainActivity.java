package com.edu.chalmers.robloxguide;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        TextView title = (TextView) findViewById(R.id.descriptionTextView);

        Typeface font = Typeface.createFromAsset(getAssets(), "BradBunR.ttf");

        title.setTypeface(font);

        ImageButton mainButton = (ImageButton) findViewById(R.id.mainButton);

        mainButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainBlockActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        ImageButton forwardButton = (ImageButton) findViewById(R.id.forwardButton);

        forwardButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ForwardBlockActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        ImageButton loopButton = (ImageButton) findViewById(R.id.loopButton);

        loopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LoopBlockActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        ImageButton callFunctionButton = (ImageButton) findViewById(R.id.anropaFunktionButton);

        callFunctionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CallFunctionBlockActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        ImageButton defineFunctionButton = (ImageButton) findViewById(R.id.funktionButton);

        defineFunctionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DefineFunctionBlockActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        ImageButton ifButton = (ImageButton) findViewById(R.id.ifButton);

        ifButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, IfBlockActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        ImageButton assignValueButton = (ImageButton) findViewById(R.id.tilldelaVardeButton);

        assignValueButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AssignValueBlockActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        ImageButton valueButton = (ImageButton) findViewById(R.id.anvandVardeButton);

        valueButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ValueBlockActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        ImageButton numberButton = (ImageButton) findViewById(R.id.twoButton);

        numberButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NumberBlockActivity.class);
                MainActivity.this.startActivity(i);
            }
        });
    }
}
