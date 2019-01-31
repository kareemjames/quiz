package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<String> startQuestions = new ArrayList<>();

    ScoreKeeper scoreKeeper = new ScoreKeeper();
    QuestionBank questionBank = new QuestionBank();
    Scanner scan = new Scanner(System.in);

    public void gameStart() {


        questionBank.setInitialQuestionsAndAnswers();
//        questionBank.printQuestions();
//        questionBank.printAnswers();
        questionBank.fiveRandomQuestions();
        //System.out.println(startQuestions);
        System.out.println(startQuestions.size() + " game start");

    }

    public void addQuestion(String x) {
        System.out.println( "This is ==> " + x + " <== at add question method");
        startQuestions.add(x);
        System.out.println(startQuestions.size());
    }


}


