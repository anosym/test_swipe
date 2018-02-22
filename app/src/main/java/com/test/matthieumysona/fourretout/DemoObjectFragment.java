package com.test.matthieumysona.fourretout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.wajahatkarim3.easyflipview.EasyFlipView;

/**
 * Created by matthieumysona on 22/02/2018.
 */

public class DemoObjectFragment extends Fragment {

    private EasyFlipView mYourFlipView;
    private Button btn;
    public static DemoObjectFragment newInstance(int i, String imageUrl) {

        final DemoObjectFragment mf = new DemoObjectFragment();

        final Bundle args = new Bundle();
        args.putString("somedata", "somedata");
        mf.setArguments(args);

        return mf;
    }

    public DemoObjectFragment() {
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
        final View v = inflater.inflate(R.layout.fragment_collection_object, container, false);
        mYourFlipView = v.findViewById(R.id.flipview);
        btn = v.findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mYourFlipView.flipTheView();
            }
        });


        return v;
    }
}
