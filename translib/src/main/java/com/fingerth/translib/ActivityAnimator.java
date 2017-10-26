package com.fingerth.translib;


import android.app.Activity;


public class ActivityAnimator {
    private static ActivityAnimator animator;

    private ActivityAnimator() {
    }

    public static ActivityAnimator getInstance() {
        if (animator == null) {
            animator = new ActivityAnimator();
        }
        return animator;
    }

    public void flipHorizontalAnimation(Activity a) {
        a.overridePendingTransition(R.anim.flip_horizontal_in, R.anim.flip_horizontal_out);
    }

    public void flipVerticalAnimation(Activity a) {
        a.overridePendingTransition(R.anim.flip_vertical_in, R.anim.flip_vertical_out);
    }

    public void fadeAnimation(Activity a) {
        a.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void disappearTopLeftAnimation(Activity a) {
        a.overridePendingTransition(R.anim.disappear_top_left_in, R.anim.disappear_top_left_out);
    }

    public void appearTopLeftAnimation(Activity a) {
        a.overridePendingTransition(R.anim.appear_top_left_in, R.anim.appear_top_left_out);
    }

    public void disappearBottomRightAnimation(Activity a) {
        a.overridePendingTransition(R.anim.disappear_bottom_right_in, R.anim.disappear_bottom_right_out);
    }

    public void appearBottomRightAnimation(Activity a) {
        a.overridePendingTransition(R.anim.appear_bottom_right_in, R.anim.appear_bottom_right_out);
    }

    public void unzoomAnimation(Activity a) {
        a.overridePendingTransition(R.anim.unzoom_in, R.anim.unzoom_out);
    }

    public void pullRightPushLeft(Activity a) {
        a.overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
    }

    public void pullLeftPushRight(Activity a) {
        a.overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
    }

    public void scaleRightToLeft(Activity a) {
        a.overridePendingTransition(R.anim.scale_right_to_left, R.anim.scale_left_to_left);
    }

    public void scaleLeftToRight(Activity a) {
        a.overridePendingTransition(R.anim.scale_left_to_right, R.anim.scale_right_to_right);
    }

    public void bottomToTopIn(Activity a) {
        a.overridePendingTransition(R.anim.bottom_to_top_in, R.anim.bottom_to_top_out);
    }

    public void topToBottomIn(Activity a) {
        a.overridePendingTransition(R.anim.top_to_bottom_in, R.anim.top_to_bottom_out);
    }
}
