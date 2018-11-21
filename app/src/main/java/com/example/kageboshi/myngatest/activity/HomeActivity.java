package com.example.kageboshi.myngatest.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;


import com.example.kageboshi.myngatest.R;
import com.example.kageboshi.myngatest.fragments.ActiveFragment;
import com.example.kageboshi.myngatest.fragments.ForumFragment;
import com.example.kageboshi.myngatest.fragments.GradeFragment;
import com.example.kageboshi.myngatest.fragments.HomeFragment;
import com.example.kageboshi.myngatest.fragments.RecommendFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup home_radioGroup;
    private RadioButton active_button;
    private RadioButton recommend_button;
    private RadioButton grade_button;
    private RadioButton home_button;
    private RadioButton forum_button;

    private List<Fragment> fragments;
    private RelativeLayout home_top_layout;
    private DrawerLayout home_drawer_layout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initStatus();
        initViews();
        initFragments();
    }

    private void initStatus() {
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        window.setStatusBarColor(getResources().getColor(R.color.nga_darker_common_bg));
        window.setNavigationBarColor(getResources().getColor(R.color.nga_darker_common_bg));
    }

    private void initViews() {
        home_radioGroup = ((RadioGroup) findViewById(R.id.home_rgp));

        active_button = ((RadioButton) findViewById(R.id.home_active_rbtn));
        recommend_button = ((RadioButton) findViewById(R.id.home_recommend_rbtn));
        grade_button = ((RadioButton) findViewById(R.id.home_grade_rbtn));
        home_button = ((RadioButton) findViewById(R.id.home_page_rbtn));
        forum_button = ((RadioButton) findViewById(R.id.home_forum_rbtn));
        home_top_layout = ((RelativeLayout) findViewById(R.id.top_view_llyt));
        home_drawer_layout = ((DrawerLayout) findViewById(R.id.home_title_view_layout));

        home_radioGroup.setOnCheckedChangeListener(this);
    }

    private void initFragments() {
        HomeFragment homeFragment = new HomeFragment();
        RecommendFragment recommendFragment = new RecommendFragment();
        ActiveFragment activeFragment = new ActiveFragment();
        GradeFragment gradeFragment = new GradeFragment();
        ForumFragment forumFragment = new ForumFragment();


        fragments = new ArrayList<Fragment>();

        fragments.add(homeFragment);
        fragments.add(recommendFragment);
        fragments.add(activeFragment);
        fragments.add(gradeFragment);
        fragments.add(forumFragment);

        switchFragment(0);
    }

    private void switchFragment(int position) {
        FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        for (int i = 0; i < fragments.size(); i++) {
            Fragment fragment = fragments.get(i);
            if (i == position) {
                if (fragment.isAdded()) {
                    fragmentTransaction.show(fragment);
                } else {
                    fragmentTransaction.add(R.id.home_replace_flyt, fragment);
                }
            } else {
                if (fragment.isAdded()) {
                    fragmentTransaction.hide(fragment);
                }
            }
        }
        fragmentTransaction.commit();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.home_page_rbtn:
                home_top_layout.setVisibility(View.VISIBLE);
                switchFragment(0);
                home_drawer_layout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNDEFINED);
                break;

            case R.id.home_recommend_rbtn:
                home_top_layout.setVisibility(View.GONE);
                switchFragment(1);
                home_drawer_layout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
                break;
            case R.id.home_active_rbtn:
                home_top_layout.setVisibility(View.GONE);
                switchFragment(2);
                home_drawer_layout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);

                break;
            case R.id.home_grade_rbtn:
                home_top_layout.setVisibility(View.GONE);
                switchFragment(3);
                home_drawer_layout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);

                break;
            case R.id.home_forum_rbtn:
                home_top_layout.setVisibility(View.GONE);
                switchFragment(4);
                home_drawer_layout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);


                break;

        }
    }
}


