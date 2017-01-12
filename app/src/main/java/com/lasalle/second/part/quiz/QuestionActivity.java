package com.lasalle.second.part.quiz;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.lasalle.second.part.quiz.models.Answer;
import com.lasalle.second.part.quiz.models.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private List<Question> questionList;
    private int currentQuestion = 0;
    private List<RadioButton> radioButtonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        radioButtonList = new ArrayList<>();
        radioButtonList.add((RadioButton) findViewById(R.id.answer1));
        radioButtonList.add((RadioButton) findViewById(R.id.answer2));
        radioButtonList.add((RadioButton) findViewById(R.id.answer3));
        radioButtonList.add((RadioButton) findViewById(R.id.answer4));

        fillQuestionList();
        formatTitle();
        formatQuestion();
    }

    @Override
    public void onClick(View view) {
        // Check for actual response
    }

    private void fillQuestionList() {
        questionList = new ArrayList<>();
        questionList.add(new Question(
            "Who won the 2014 World Cup?",
            Arrays.asList(
                new Answer("Argentina", false),
                new Answer("Brazil", false),
                new Answer("Spain", false),
                new Answer("Germany", false)
            )
        ));

        questionList.add(new Question(
            "Who won the 2016 LOL Worlds?",
            Arrays.asList(
                new Answer("SKT", true),
                new Answer("Fnatic", false),
                new Answer("EDG", false),
                new Answer("Origen", false)
            )
        ));
    }

    private void formatTitle() {
        Resources res = getResources();
        String text = String.format(
                res.getString(R.string.current_question),
                currentQuestion + 1,
                questionList.size());
        TextView textView = (TextView) findViewById(R.id.questionBreadcrumb);
        textView.setText(text);
    }

    private void formatQuestion() {
        Question question = questionList.get(currentQuestion);

        TextView textView = (TextView) findViewById(R.id.questionTitle);
        textView.setText(question.getText());

        int answerIndex = 0;
        for(Answer answer : question.getAnswerList())
        {
            radioButtonList.get(answerIndex).setText(answer.getText());
            ++answerIndex;
        }
    }
}
