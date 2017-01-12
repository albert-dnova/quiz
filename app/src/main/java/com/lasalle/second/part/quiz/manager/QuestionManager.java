package com.lasalle.second.part.quiz.manager;

import com.lasalle.second.part.quiz.data.QuestionData;
import com.lasalle.second.part.quiz.data.impl.QuestionDataMock;
import com.lasalle.second.part.quiz.models.Answer;
import com.lasalle.second.part.quiz.models.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionManager {

    private QuestionData questionData;

    public QuestionManager() {
        questionData = new QuestionDataMock();
    }

    public Question getNextQuestion() {
        return questionData.getQuestion(0);
    }

    public Integer countQuestions() {
        return questionData.countQuestions();
    }
}
