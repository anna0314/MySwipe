package com.example.loki.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Loki on 2015-05-12.
 */
public class PageAdapter {



    public class PagerAdapter extends FragmentPagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
            // TODO Auto-generated constructor stub
        }

        @Override
        public Fragment getItem(int arg0) {
            // TODO Auto-generated method stub
            switch (arg0) {
                case 0:

                    return new OneFragment();
                case 1:
                    return new TwoFragment();
                case 2:
                    return new ThreeFragment();

                default:
                    break;
            }
            return null;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return 3;
        }


    }
}
