package com.example.socketmobile2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);

        // 1. Bind the adapter to view pager
        WalkthroughAdapter adapter = new WalkthroughAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);


    }
}