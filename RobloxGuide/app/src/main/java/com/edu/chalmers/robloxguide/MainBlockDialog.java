package com.edu.chalmers.robloxguide;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

/**
 * Created by oskar on 2016-12-08.
 */

public class MainBlockDialog extends Dialog implements android.view.View.OnClickListener {

    public Activity c;

    public MainBlockDialog(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.mainblock_dialog);

        ImageButton mainButton = (ImageButton) findViewById(R.id.forwardButton);

        mainButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(c, ForwardBlockActivity.class);
                c.startActivity(i);
            }
        });
    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
