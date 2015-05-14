package com.example.loki.myapplication;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends FragmentActivity {


    public BlankFragment() {
        // Required empty public constructor
    }

    protected void onCreate(Bundle savedInstanceState) {


        ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int pos) {

            switch(pos) {

                case 0: return OneFragment.newInstance("FirstFragment, Instance 1");
                case 1: return TwoFragment.newInstance("SecondFragment, Instance 2");
                case 2: return ThreeFragment.newInstance("ThirdFragment, Instance 3");

                default:return OneFragment.newInstance("FirstFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


}
