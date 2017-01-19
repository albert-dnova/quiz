package com.lasalle.second.part.quiz;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.lasalle.second.part.quiz.manager.QuestionManager;
import com.lasalle.second.part.quiz.models.Answer;
import com.lasalle.second.part.quiz.models.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private static String TAG = "QuestionActivity";
    private int currentQuestion = 0;
    private List<RadioButton> radioButtonList;
    private QuestionManager questionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "I have been created");
        setContentView(R.layout.activity_question);
        Log.d(TAG, "Setting content view");
        radioButtonList = new ArrayList<>();
        radioButtonList.add((RadioButton) findViewById(R.id.answer1));
        radioButtonList.add((RadioButton) findViewById(R.id.answer2));
        radioButtonList.add((RadioButton) findViewById(R.id.answer3));
        radioButtonList.add((RadioButton) findViewById(R.id.answer4));
        Log.d(TAG, "Added buttons references");
        questionManager = new QuestionManager();

        Log.d(TAG, "Created question Manager");
        formatTitle();
        Log.d(TAG, "Title formatted");
        formatQuestion();
        Log.d(TAG, "Question formatted");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    @Override
    public void onClick(View view) {
        // Check for actual response
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean menuCreated = super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu_main, menu);

        menuCreated &= true;
        return menuCreated;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.menu_main_miCompose)
        {
            Log.d("MainActivity", "Pressed!!!");
        }
        return super.onOptionsItemSelected(item);
    }

    private void formatTitle() {
        Resources res = getResources();
        String text = String.format(
                res.getString(R.string.current_question),
                currentQuestion + 1,
                questionManager.countQuestions());
        TextView textView = (TextView) findViewById(R.id.questionBreadcrumb);
        textView.setText(text);
    }

    private void formatQuestion() {
        Question question = questionManager.getNextQuestion();

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
