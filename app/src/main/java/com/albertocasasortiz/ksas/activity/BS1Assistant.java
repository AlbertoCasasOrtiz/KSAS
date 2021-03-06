package com.albertocasasortiz.ksas.activity;

import android.os.Bundle;
import android.view.View;

import com.albertocasasortiz.ksas.R;
import com.albertocasasortiz.ksas.activity.parent.ActivityFullScreenSpeecher;
import com.albertocasasortiz.ksas.recognizer.RecognizeInBackground;


/**
 * Fourth activity of the app, captures the data of the execution and gives feedback.
 */
public class BS1Assistant extends ActivityFullScreenSpeecher {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bs1_assistant);
        //Instantiate the speecher.
        instantiateSpeech(getString(R.string.follow_instructions));
    }

    /**
     * On click start, start lifecycle.
     * @param view View of the gui.
     */
    public void onClickStart(View view) {
        RecognizeInBackground rb = new RecognizeInBackground(this, super.tts);
        rb.execute();
    }




}
