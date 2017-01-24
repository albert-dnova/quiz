package com.lasalle.second.part.quiz.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lasalle.second.part.quiz.R;
import com.lasalle.second.part.quiz.activity.tablayout.TabLayoutAdapter;

public class TabLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.activity_tab_layout_container);
        ViewPager viewPager = (ViewPager) findViewById(R.id.activity_tab_layout_view_pager);

        viewPager.setAdapter(new TabLayoutAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

    }
}
