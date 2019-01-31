package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class QuestionBank {
    private ArrayList<QuizQuestion> questions = new ArrayList<>();
    private ArrayList<QuizQuestion> fiveQuestions = new ArrayList<>();
    private ArrayList<String> test;
    private Quiz quiz;

    Random random = new Random();
    int nextRandom;

    public void addQuestionAndAnswer(QuizQuestion x) {
        questions.add(x);
    }

    public void printQuestions() {
        System.out.println(questions);
    }

    public void printAnswers() {
        System.out.println(answers);
    }

    public void setInitialQuestionsAndAnswers(Quiz x) {

        this.quiz = x;

         addQuestionAndAnswer(new QuizQuestion(("Which actor does not appear in 'Saving Private Ryan?\n"
                 + "Giovanni Ribisi\n"
                 + "Vin Diesel\n"
                 + "Tom Hanks\n"
                 + "Ralph Fiennes\n"), "Ralph Fiennes"));

        String q2 = "How many blue stripes does the United States of America national flag have?\n"
                + "13\n"
                + "0\n"
                + "7\n"
                + "6\n";
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

        String q9 = "How many spaces are on a standard Monopoly board?\n"
                + "20\n"
                + "40\n"
                + "80\n"
                + "60\n";
        String a9 = "40";

        String q10 = "Which truck is produced by the Ford Motor Company?\n"
                + "F-150\n"
                + "Rav4\n"
                + "CR-V\n"
                + "Silverado 1500\n";
        String a10 = "F-150";



        addQuestion(q1);
        addAnswer(a1);
        addQuestion(q2);
        addAnswer(a2);
        addQuestion(q3);
        addAnswer(a3);
        addQuestion(q4);
        addAnswer(a4);
        addQuestion(q5);
        addAnswer(a5);
        addQuestion(q6);
        addAnswer(a6);
        addQuestion(q7);
        addAnswer(a7);
        addQuestion(q8);
        addAnswer(a8);
        addQuestion(q9);
        addAnswer(a9);
        addQuestion(q10);
        addAnswer(a10);

    }

    public void fiveRandomQuestion() {

        for(int i = 0; i < questions.size(); i++) {
            nextRandom = random.nextInt(questions.size() - i);
            String value = questions.get(i);
//            System.out.println(value);
            quiz.addQuestion(value);
            questions.remove(nextRandom);
        }
    }

}

/*The issue I was having here is that I was instantiating a new quiz object inside of the fiveRandomQuestion method and saving the value to that objects array instead of the originating Quiz object. The fix was to pass the whole Quiz object by creating a variable Quiz quiz; change setInitialQuestion method to accept a quiz object and then when I make the  method call in quiz, I pass the THIS (this referring to itself) object and set this.quiz to x(which is the passed object) and then it works as expected. This is an inefficient way to deal with this and I am going to solve it in a better fashion. I just wanted to document because I forgot to save it working at that point.
*/