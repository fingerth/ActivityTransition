package com.fingerth.activitytransition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.fingerth.translib.ActivityAnimator;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt2, R.id.bt3, R.id.bt4, R.id.bt5, R.id.bt6, R.id.bt7, R.id.bt8, R.id.bt9, R.id.bt10, R.id.bt11, R.id.bt12, R.id.bt13, R.id.bt14, R.id.bt15})
    public void onViewClicked(View view) {

        switch (view.getId()) {
            case R.id.bt2:
                startActivity(new Intent(this, Main2Activity.class));
                ActivityAnimator.getInstance().flipHorizontalAnimation(this);
                break;
            case R.id.bt3:
                startActivity(new Intent(this, Main3Activity.class));
                ActivityAnimator.getInstance().flipVerticalAnimation(this);
                break;
            case R.id.bt4:
                startActivity(new Intent(this, Main4Activity.class));
                ActivityAnimator.getInstance().fadeAnimation(this);
                break;
            case R.id.bt5:
                startActivity(new Intent(this, Main5Activity.class));
                ActivityAnimator.getInstance().disappearTopLeftAnimation(this);
                break;
            case R.id.bt6:
                startActivity(new Intent(this, Main6Activity.class));
                ActivityAnimator.getInstance().appearTopLeftAnimation(this);
                break;
            case R.id.bt7:
                startActivity(new Intent(this, Main7Activity.class));
                ActivityAnimator.getInstance().disappearBottomRightAnimation(this);
                break;
            case R.id.bt8:
                startActivity(new Intent(this, Main8Activity.class));
                ActivityAnimator.getInstance().appearBottomRightAnimation(this);
                break;
            case R.id.bt9:
                startActivity(new Intent(this, Main9Activity.class));
                ActivityAnimator.getInstance().unzoomAnimation(this);
                break;
            case R.id.bt10:
                startActivity(new Intent(this, Main10Activity.class));
                ActivityAnimator.getInstance().pullRightPushLeft(this);
                break;
            case R.id.bt11:
                startActivity(new Intent(this, Main11Activity.class));
                ActivityAnimator.getInstance().pullLeftPushRight(this);
                break;
            case R.id.bt12:
                startActivity(new Intent(this, Main12Activity.class));
                ActivityAnimator.getInstance().scaleRightToLeft(this);
                break;
            case R.id.bt13:
                startActivity(new Intent(this, Main13Activity.class));
                ActivityAnimator.getInstance().topToBottomIn(this);
                break;
            case R.id.bt14:
//                startActivity(new Intent(this, Main14Activity.class));
//                ActivityAnimator.getInstance().topToBottomIn(this);
                break;

        }
    }
}
