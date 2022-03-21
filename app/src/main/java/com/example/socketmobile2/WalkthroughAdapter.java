package com.example.socketmobile2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WalkthroughAdapter extends FragmentPagerAdapter {

    public WalkthroughAdapter(FragmentManager fm){
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1:
                return new WalkthroughFragment2();
            case 3:
                return new WalkthroughFragment3();
            default:
                return new WalkthroughFragment1();
        }
    }


    @Override
    public int getCount() {
        return 3;
    }
}
