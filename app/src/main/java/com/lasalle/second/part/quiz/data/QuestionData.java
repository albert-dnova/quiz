package com.lasalle.second.part.quiz.data;

import com.lasalle.second.part.quiz.models.Question;

public interface QuestionData {

    public Question getQuestion(int questionId);
    public Integer countQuestions();

}
