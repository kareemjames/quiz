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

        System.out.println("Welcome to the Are you Dumb or Nah? Show\n"
                + "You will be asked 5 random questions, give it your best shot!\n");

        for(int i = 0; i < startQuestions.size(); i++) {
            System.out.println(startQuestions.get(i).getQuestion());
            String userInput = scan.nextLine();
            if(userInput.equalsIgnoreCase(startQuestions.get(i).getAnswer())) {
                System.out.println("Congratulations, you got the answer correct!\n");
                scoreKeeper.increaseScore();
            } else if(!userInput.equalsIgnoreCase(startQuestions.get(i).getAnswer())) {
                System.out.println("Sorry, this is not looking good for you fam.\n");
                if(scoreKeeper.getScore() == 0) {
                    continue;
                } else {
                    scoreKeeper.decreaseScore();
                }
            }
        }

        System.out.println(scoreKeeper.getScore());

    }


}


