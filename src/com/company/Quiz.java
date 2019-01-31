package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<QuizQuestion> startQuestions = new ArrayList<>();

    ScoreKeeper scoreKeeper = new ScoreKeeper();
    private QuestionBank questionBank = new QuestionBank();
    Scanner scan = new Scanner(System.in);

    public void gameStart() {

        questionBank.setInitialQuestionsAndAnswers();
        questionBank.fiveRandomQuestions();
        startQuestions = questionBank.getFiveQuestions();
        System.out.println(startQuestions);
        System.out.println(startQuestions.size() + " game start");


    }



}


