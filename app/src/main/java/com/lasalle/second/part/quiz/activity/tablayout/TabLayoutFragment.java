package com.lasalle.second.part.quiz.activity.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lasalle.second.part.quiz.R;

import org.w3c.dom.Text;

/**
 * Created by albert.denova on 24/01/17.
 */

public class TabLayoutFragment extends Fragment {

    public static final String ARG_NAME = "ARG_NAME";

    private String tabName;

    public static TabLayoutFragment newInstance(String name)
    {
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        TabLayoutFragment fragment = new TabLayoutFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tabName = getArguments().getString(ARG_NAME);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_tab_layout_fragment, container, false);
        TextView textView = (TextView) view.findViewById(R.id.activity_tab_layout_fragment_text);
        textView.setText("Fragment " + tabName);
        return view;
    }


}
