package com.lasalle.second.part.quiz.activity.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lasalle.second.part.quiz.activity.question.fragment.QuestionPortraitFragment;

/**
 * Created by albert.denova on 24/01/17.
 */

public class TabLayoutAdapter extends FragmentPagerAdapter {

    public TabLayoutAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TabLayoutFragment.newInstance(Integer.toString(position));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab " + Integer.toString(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
