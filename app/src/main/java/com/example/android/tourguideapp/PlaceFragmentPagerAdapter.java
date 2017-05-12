package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by gacavalli on 12/05/2017.
 */

public class PlaceFragmentPagerAdapter extends FragmentPagerAdapter {

    public PlaceFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AroundFragment();
        } else if (position == 1){
            return new ToVisitFragment();
        } else if (position == 2) {
            return new EatFragment();
        } else {
            return new ActionFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}