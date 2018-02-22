package com.test.matthieumysona.fourretout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by matthieumysona on 22/02/2018.
 */

public class DemoCollectionPagerAdapter extends FragmentPagerAdapter {

    public static int pos = 0;
    private static int NUM_ITEMS = 3;

    private List<Fragment> myFragments;

    public DemoCollectionPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return DemoObjectFragment.newInstance(0, "Page # 1");
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return DemoTwoObjectFragment.newInstance(1, "Page # 2");
            case 2:return DemoThreeObjectFragment.newInstance(2, "Page # 3");

            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

}

