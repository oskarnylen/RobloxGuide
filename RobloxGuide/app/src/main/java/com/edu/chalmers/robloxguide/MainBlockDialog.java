package com.edu.chalmers.robloxguide;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by oskar on 2016-12-08.
 */

public class MainBlockDialog extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;

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


        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.mainblock_dialog);

        View decorView = this.getWindow().getDecorView();
// Calling setSystemUiVisibility() with a value of 0 clears
// all flags.
        decorView.setSystemUiVisibility(0);
    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
