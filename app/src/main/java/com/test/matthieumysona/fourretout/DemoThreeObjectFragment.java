package com.test.matthieumysona.fourretout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by matthieumysona on 22/02/2018.
 */

public class DemoThreeObjectFragment extends Fragment {
    public static DemoThreeObjectFragment newInstance(int i, String imageUrl) {

        final DemoThreeObjectFragment mf = new DemoThreeObjectFragment();

        final Bundle args = new Bundle();
        args.putString("somedata", "somedata");
        mf.setArguments(args);

        return mf;
    }

    public DemoThreeObjectFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String data = getArguments().getString("somedata");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate and locate the main ImageView
        final View v = inflater.inflate(R.layout.fragment_three_collection_object, container, false);
        //...
        return v;
    }
}
