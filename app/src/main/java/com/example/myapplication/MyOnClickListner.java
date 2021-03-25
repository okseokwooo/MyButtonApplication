package com.example.myapplication;

import android.view.View;

public class MyOnClickListner implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListner(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextView1.setText("you clicked 옥석우의 button!");
    }
}
