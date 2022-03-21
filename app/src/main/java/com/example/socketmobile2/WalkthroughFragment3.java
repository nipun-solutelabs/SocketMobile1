package com.example.socketmobile2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WalkthroughFragment3 extends Fragment {

    ViewPager viewPager;

    public WalkthroughFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_walkthrough3, container, false);
        viewPager = getActivity().findViewById(R.id.viewPager);
        return view;

    }
}