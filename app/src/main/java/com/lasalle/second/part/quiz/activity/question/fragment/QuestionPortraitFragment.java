package com.lasalle.second.part.quiz.activity.question.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lasalle.second.part.quiz.R;

public class QuestionPortraitFragment extends QuestionAbstractFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_question_portrait, container, false);
        OnViewInflated(view);
        return view;
    }
}
