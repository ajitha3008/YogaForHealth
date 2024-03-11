package com.test.yogaforhealth;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.test.yogaforhealth.fragments.AsanasFragment;
import com.test.yogaforhealth.fragments.ChakrasFragment;
import com.test.yogaforhealth.fragments.MantrasFragment;
import com.test.yogaforhealth.fragments.MudrasFragment;
import com.test.yogaforhealth.fragments.PranayamsFragment;

public class MainActivity extends AppCompatActivity {
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);

        // setting up the adapter
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        // add the fragments
        viewPagerAdapter.add(new AsanasFragment(), "Asana");
        viewPagerAdapter.add(new PranayamsFragment(), "Pranayam");
        viewPagerAdapter.add(new MantrasFragment(), "Mantra");
        viewPagerAdapter.add(new ChakrasFragment(), "Chakra");
        viewPagerAdapter.add(new MudrasFragment(), "Mudra");

        // Set the adapter
        viewPager.setAdapter(viewPagerAdapter);

        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}