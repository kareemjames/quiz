package com.company;

import java.util.ArrayList;

public class Quiz {

    ArrayList<String> questions = new ArrayList<>();
    ScoreKeeper scoreKeeper = new ScoreKeeper();
    QuestionBank questionBank = new QuestionBank();

    public void gameStart() {

        String q1 = "Which actor does not appear in 'Saving Private Ryan?\n"
                + "Giovanni Ribisi\n"
                + "Vin Diesel\n"
                + "Tom Hanks\n"
                + "Ralph Fiennes";
        String a1 = "Ralph Fiennes";

        String q2 = "How many blue stripes does the United States of America national flag have?\n"
                + "13\n"
                + "0\n"
                + "7\n"
                + "6";
        String a2 = "0";

        String q3 = "Which movie was the first to win 11 Academy Awards?\n"
                + "Sound of Music\n"
                + "Ben-Hur\n"
                + "Titanic\n"
                + "La La Land\n";
        String a3 = "Ben-Hur";

        String q4 = "What did Alfred Nobel develop?\n"
                + "Gunpowder\n"
                + "Atomic bomb\n"
                + "Dynamite\n"
                + "Nobelium\n";
        String a4 = "Dynamite";

        String q5 = "What was the first successful vaccine developed in history?\n"
                + "Rabies\n"
                + "Cholera\n"
                + "Smallpox\n"
                + "Scarlet Fever\n";
        String a5 = "Smallpox";

        String q6 = "What funk/soul band was Lionel Richie a member of?\n"
                + "Spectrums\n"
                + "Ataris\n"
                + "Commodores\n"
                + "Amigas\n";
        String a6 = "Commodores";

        String q7 = "Other than eggs, what is a primary ingredient in Eggs Florentine?\n"
                + "Avocado\n"
                + "Ham\n"
                + "Gorgonzola\n"
                + "Spinach\n";
        String a7 = "Spinach";

        String q8 = "What is the largest country, by area, that has only one time zone?\n"
                + "Turkey\n"
                + "Russian\n"
                + "Australia\n"
                + "China\n";
        String a8 = "China";

        questionBank.addQuestion(q1);
        questionBank.addAnswer(a1);
        questionBank.addQuestion(q2);
        questionBank.addAnswer(a2);
        questionBank.addQuestion(q3);
        questionBank.addAnswer(a3);
        questionBank.addQuestion(q4);
        questionBank.addAnswer(a4);
        questionBank.addQuestion(q5);
        questionBank.addAnswer(a5);
        questionBank.addQuestion(q6);
        questionBank.addAnswer(a6);
        questionBank.addQuestion(q7);
        questionBank.addAnswer(a7);
        questionBank.addQuestion(q8);
        questionBank.addAnswer(a8);

        questionBank.printQuestions();
        questionBank.printAnswers();


    }


}
