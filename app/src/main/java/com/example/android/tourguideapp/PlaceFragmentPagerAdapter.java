package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by gacavalli on 12/05/2017.
 */

public class PlaceFragmentPagerAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public PlaceFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
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

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tab1);
        } else if (position == 1) {
            return mContext.getString(R.string.tab2);
        } else if (position == 2) {
            return mContext.getString(R.string.tab3);
        } else {
            return mContext.getString(R.string.tab4);
        }
    }
}