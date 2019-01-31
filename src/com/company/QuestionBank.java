package com.company;

import java.util.ArrayList;

public class QuestionBank {
    private ArrayList<String> questions = new ArrayList<>();
    private ArrayList<String> answers = new ArrayList<>();

    public void addQuestion(String x) {
        questions.add(x);
    }

    public void addAnswer(String x) {
        answers.add(x);
    }


}