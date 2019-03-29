package com.hari.app.agora_prototype;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {
    private Context context;
    private int tabCount;

    public TabAdapter(FragmentManager fm, Context context, int tabCount) {
        super(fm);
        this.context = context;
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0: return  new HomeFragment();

            case 1: return new DashboardFragment();

            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
