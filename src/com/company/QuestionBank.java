package com.company;

import java.util.ArrayList;
import java.util.Random;

public class QuestionBank {
    private ArrayList<QuizQuestion> questions = new ArrayList<>();
    private ArrayList<QuizQuestion> fiveQuestions = new ArrayList<>();
    private Random random = new Random();

    public void printQuestions() {
        System.out.println(questions);
    }

    public void addQuestionAndAnswer(QuizQuestion quizQuestion) {
        questions.add(quizQuestion);
    }

    public void setInitialQuestionsAndAnswers() {

        addQuestionAndAnswer(new QuizQuestion(("Which actor does not appear in 'Saving Private Ryan?\n"
                + "Giovanni Ribisi\n"
                + "Vin Diesel\n"
                + "Tom Hanks\n"
                + "Ralph Fiennes\n"), "Ralph Fiennes"));

        addQuestionAndAnswer(new QuizQuestion(("How many blue stripes does the United States of America national flag have?\n"
                + "13\n"
                + "0\n"
                + "7\n"
                + "6\n"), "0"));

        addQuestionAndAnswer(new QuizQuestion(("Which movie was the first to win 11 Academy Awards?\n"
                + "Sound of Music\n"
                + "Ben-Hur\n"
                + "Titanic\n"
                + "La La Land\n"), "Ben-Hur"));

        addQuestionAndAnswer(new QuizQuestion(("What did Alfred Nobel develop?\n"
                + "Gunpowder\n"
                + "Atomic bomb\n"
                + "Dynamite\n"
                + "Nobelium\n"), "Dynamite"));

        addQuestionAndAnswer(new QuizQuestion(("What was the first successful vaccine developed in history?\n"
                + "Rabies\n"
                + "Cholera\n"
                + "Smallpox\n"
                + "Scarlet Fever\n"), "Smallpox"));

        addQuestionAndAnswer(new QuizQuestion(("What funk/soul band was Lionel Richie a member of?\n"
                + "Spectrums\n"
                + "Ataris\n"
                + "Commodores\n"
                + "Amigas\n"), "Commodores"));
        addQuestionAndAnswer(new QuizQuestion(("Other than eggs, what is a primary ingredient in Eggs Florentine?\n"
                + "Avocado\n"
                + "Ham\n"
                + "Gorgonzola\n"
                + "Spinach\n"), "Spinach"));

        addQuestionAndAnswer(new QuizQuestion(("What is the largest country, by area, that has only one time zone?\n"
                + "Turkey\n"
                + "Russian\n"
                + "Australia\n"
                + "China\n"),"China"));

        addQuestionAndAnswer(new QuizQuestion(("How many spaces are on a standard Monopoly board?\n"
                + "20\n"
                + "40\n"
                + "80\n"
                + "60\n"),"40"));

        addQuestionAndAnswer(new QuizQuestion(("Which truck is produced by the Ford Motor Company?\n"
                + "F-150\n"
                + "Rav4\n"
                + "CR-V\n"
                + "Silverado 1500\n"),"F-150"));

    }

    public void fiveRandomQuestions() {

        for (int i = 0; i < questions.size(); i++) {
            int nextRandom = random.nextInt(questions.size() - i);
            QuizQuestion value = questions.get(nextRandom);
            fiveQuestions.add(value);
            questions.remove(nextRandom);
        }
        //System.out.println(fiveQuestions);
    }

    public ArrayList<QuizQuestion> getFiveQuestions() {
        return fiveQuestions;
    }

}

/*The issue I was having here is that I was instantiating a new quiz object inside of the fiveRandomQuestion method and saving the value to that objects array instead of the originating Quiz object. The fix was to pass the whole Quiz object by creating a variable Quiz quiz; change setInitialQuestion method to accept a quiz object and then when I make the  method call in quiz, I pass the THIS (this referring to itself) object and set this.quiz to x(which is the passed object) and then it works as expected. This is an inefficient way to deal with this and I am going to solve it in a better fashion. I just wanted to document because I forgot to save it working at that point.
 */