package com.example.socketmobile2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WalkthroughFragment1 extends Fragment {

    TextView skipText;
    ViewPager viewPager;

    public WalkthroughFragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_walkthrough1, container, false);

        // get reference to viewPager that is holding this first screen
        viewPager = getActivity().findViewById(R.id.viewPager);
        // skip-text from first screen
        skipText = view.findViewById(R.id.skipText);
        // Add listener to {skip}
        skipText.setOnClickListener(view1 -> viewPager.setCurrentItem(2));
        return view;
    }
}