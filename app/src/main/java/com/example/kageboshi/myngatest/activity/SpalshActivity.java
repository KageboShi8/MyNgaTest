package com.example.kageboshi.myngatest.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.kageboshi.myngatest.R;


public class SpalshActivity extends AppCompatActivity {
    private int jumpFlag = 1;
    // TODO: 18-10-10 这里应该做网络请求　判断是否有广告图需要展示　有就展示没有就跳转homeActivity 0表有图　非0无图

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (jumpFlag == 0) {
                    jumpToSecondSplash();
                } else {
                    jumpToHomeActivity();
                }
            }
        }, 2000);

    }


    private void jumpToHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

    private void jumpToSecondSplash() {
        Intent intent = new Intent(this, SecondSplashActivity.class);
        startActivity(intent);
        finish();
    }
}
