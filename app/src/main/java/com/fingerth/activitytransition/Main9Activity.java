package com.fingerth.activitytransition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fingerth.translib.ActivityAnimator;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        ActivityAnimator.getInstance().unzoomAnimation(this);
    }
}
