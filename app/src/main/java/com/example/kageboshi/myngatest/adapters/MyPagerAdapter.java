package com.example.kageboshi.myngatest.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    private FragmentManager fm;
    private List<Fragment> fragments;
    private List<String> list_title;

    public MyPagerAdapter(FragmentManager fm, Context context, List<Fragment> fragments, List<String> list_Title) {
        super(fm);
        this.context = context;
        this.fragments = fragments;
        this.list_title = list_Title;
    }


    @Override
    public int getCount() {
        return list_title.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list_title.get(position);
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }
}
