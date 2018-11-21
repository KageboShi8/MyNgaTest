package com.example.kageboshi.myngatest.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kageboshi.myngatest.R;


public class SecondSplashActivity extends AppCompatActivity implements View.OnClickListener {
    private int time = 5;
    private ImageView spalshHolder;
    private TextView skipView;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0) {
                if (time>0){
                    time--;
                    skipView.setText("点击跳过 "+time);
                    handler.sendEmptyMessageDelayed(0,1000);
                }else {
                    jumpToHomeActivity();
                }
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondloading);
        initView();
        spalshHolder.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher_background));// TODO: 18-10-10 此处应该使用网络请求glide之类的加载图片，然后跳转 此处只作为测试
        handler.sendEmptyMessageDelayed(0,1000);
    }

    private void initView() {
        spalshHolder = ((ImageView) findViewById(R.id.splash_holder));
        skipView = ((TextView) findViewById(R.id.skip_view));
        skipView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.skip_view:
                jumpToHomeActivity();
                break;
        }
    }

    private void jumpToHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
