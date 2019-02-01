package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<QuizQuestion> startQuestions = new ArrayList<>();

    private ScoreKeeper scoreKeeper = new ScoreKeeper();
    private QuestionBank questionBank = new QuestionBank();
    private Scanner scan = new Scanner(System.in);
    private String userInput;
    private boolean isPlaying = true;

    public boolean isPlaying() {
        return isPlaying;
    }

    public void gameStart() {

        questionBank.setInitialQuestionsAndAnswers();
        questionBank.fiveRandomQuestions();
        startQuestions = questionBank.getFiveQuestions();

        System.out.println("Welcome to the Are you Dumb or Nah? Show\n"
                + "You will be asked 5 random questions, give it your best shot!\n");

        for(int i = 0; i < startQuestions.size(); i++) {
            System.out.println(startQuestions.get(i).getQuestion());
                userInput = scan.nextLine();
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

        System.out.println("You got " + scoreKeeper.getScore() + "/" + startQuestions.size() + " correct");

        if(scoreKeeper.getScore() <= 3) {
            System.out.println("Guess you Dumb, huh!");
        } else {
            System.out.println("I knew you was smart the minute I laid eyes on you");
        }

        System.out.println("Would you like to play again?\n" +
                "y or n");
        userInput = scan.nextLine();
        if(userInput.equalsIgnoreCase("y")) {
            isPlaying = true;
        } else {
            System.out.println("Thanks for playing, see you next time!");
            isPlaying = false;
        }



    }


}


