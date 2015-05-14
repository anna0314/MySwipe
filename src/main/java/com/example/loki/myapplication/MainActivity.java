package com.example.loki.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }



        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed(){
        if(getFragmentManager().getBackStackEntryCount() >0) {
            getFragmentManager().popBackStack();
        }else{
            super.onBackPressed();
        }
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
                switch(pos) {

                case 0: return OneFragment.newInstance("FirstFragment, Instance 1");
                case 1: return TwoFragment.newInstance("SecondFragment, Instance 2");
                case 2: return ThreeFragment.newInstance("ThirdFragment, Instance 3");

                default: return OneFragment.newInstance("FirstFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}