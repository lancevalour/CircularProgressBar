package com.zyceeit.android.circularprogressbar.sample;

import android.app.Activity;
import android.os.Bundle;

import com.zyceeit.android.circularprogressbar.CircularProgressBar;

/**
 * Created by ZhangY on 12/23/2015.
 */
public class MainActivity extends Activity {

    private CircularProgressBar circularProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circularProgressBar = (CircularProgressBar) findViewById(R.id.circularProgressBar);

        circularProgressBar.setProgressWithAnimation(100);

    }


}
