package com.example.pannam.fragmentstatepageradapter;

import android.app.ListFragment;
import android.os.Bundle;

/**
 * Created by pannam on 6/27/2016.
 */
public class ArrayListFragment extends ListFragment {
    int mNum;
    private static String[]cheeses = {"pannam","shreys","pushkar","ale","bbsingh","devbabu"};

    static ArrayListFragment newInstance(int num){
            ArrayListFragment f = new ArrayListFragment();

        Bundle args = new Bundle();
        args.putInt("num",num);
        f.setArguments(args);
        return  f;
    }


}
