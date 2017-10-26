package com.fingerth.activitytransition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fingerth.translib.ActivityAnimator;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        ActivityAnimator.getInstance().flipVerticalAnimation(this);
    }
}
