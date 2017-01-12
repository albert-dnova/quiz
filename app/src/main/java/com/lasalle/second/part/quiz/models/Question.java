package com.lasalle.second.part.quiz.models;

import java.util.List;

public class Question {

    private String text;
    private List<Answer> answerList;

    public Question(String text, List<Answer> answerList) {
        this.text = text;
        this.answerList = answerList;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }



}
