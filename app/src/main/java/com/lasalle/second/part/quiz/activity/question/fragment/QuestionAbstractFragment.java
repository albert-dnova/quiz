package com.lasalle.second.part.quiz.activity.question.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import com.lasalle.second.part.quiz.R;
import com.lasalle.second.part.quiz.manager.QuestionManager;
import com.lasalle.second.part.quiz.models.Answer;
import com.lasalle.second.part.quiz.models.Question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by albert.denova on 24/01/17.
 */

public abstract class QuestionAbstractFragment extends Fragment {

    private QuestionManager questionManager;
    private int currentQuestion;
    private List<RadioButton> radioButtonList;
    private View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        questionManager = new QuestionManager();
        currentQuestion = 0;
    }

    public void OnViewInflated(View view) {
        this.view = view;
        radioButtonList = new ArrayList<>();
        radioButtonList.add((RadioButton) view.findViewById(R.id.answer1));
        radioButtonList.add((RadioButton) view.findViewById(R.id.answer2));
        radioButtonList.add((RadioButton) view.findViewById(R.id.answer3));
        radioButtonList.add((RadioButton) view.findViewById(R.id.answer4));

        formatTitle();
        formatQuestion();
    }

    private void formatTitle() {
        Resources res = getResources();
        String text = String.format(
                res.getString(R.string.current_question),
                currentQuestion + 1,
                questionManager.countQuestions());
        TextView textView = (TextView) view.findViewById(R.id.questionBreadcrumb);
        textView.setText(text);
    }

    private void formatQuestion() {
        Question question = questionManager.getNextQuestion();

        TextView textView = (TextView) view.findViewById(R.id.questionTitle);
        textView.setText(question.getText());

        int answerIndex = 0;
        for(Answer answer : question.getAnswerList())
        {
            radioButtonList.get(answerIndex).setText(answer.getText());
            ++answerIndex;
        }
    }

}
