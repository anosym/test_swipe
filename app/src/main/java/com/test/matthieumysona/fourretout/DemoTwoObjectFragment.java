package com.test.matthieumysona.fourretout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by matthieumysona on 22/02/2018.
 */

public class DemoTwoObjectFragment extends Fragment {
    public static DemoTwoObjectFragment newInstance(int i, String imageUrl) {

        final DemoTwoObjectFragment mf = new DemoTwoObjectFragment();

        final Bundle args = new Bundle();
        args.putString("somedata", "somedata");
        mf.setArguments(args);

        return mf;
    }

    public DemoTwoObjectFragment() {
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
        final View v = inflater.inflate(R.layout.fragment_two_collection_object, container, false);
        //...
        return v;
    }
}
