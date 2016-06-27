package com.example.pannam.fragmentstatepageradapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.ArrayList;

/**
 * Created by pannam on 6/27/2016.
 */
public class MyAdapter  extends FragmentStatePagerAdapter{

    static final int NUM_ITEMS = 10;
    private ArrayList<Integer>page_indexes;

    public MyAdapter(FragmentManager fm) {
        super(fm);
        page_indexes = new ArrayList<>();
        for(int i= 0; i<NUM_ITEMS; i++){
            page_indexes.add(new Integer(i));
        }

    }

    @Override
    public Fragment getItem(int position) {
        Integer index = page_indexes.get(position);

            return ArrayListFragment.newInstance(index.intValue());

    }

    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }

    @Override
    public int getCount() {
        return page_indexes.size();
    }
}
