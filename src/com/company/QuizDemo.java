package com.company;

public class QuizDemo {
    static Quiz quiz = new Quiz();

    public static void main(String[] args) {

        while(quiz.isPlaying()) {
            gameStartLoop();
        }


    }

    public static void gameStartLoop() {
        quiz.gameStart();
    }
}
