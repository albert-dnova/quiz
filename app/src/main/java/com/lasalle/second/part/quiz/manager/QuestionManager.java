package com.lasalle.second.part.quiz.manager;

import com.lasalle.second.part.quiz.models.Answer;
import com.lasalle.second.part.quiz.models.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionManager {

    public QuestionManager() {

    }

    public Question getNextQuestion() {
        List<Question> questionList = new ArrayList<>();
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

        return questionList.get(0);
    }

    public Integer countQuestions() {
        return 2;
    }
}
