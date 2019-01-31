package com.company;

public class ScoreKeeper {
    private int score = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void increaseScore() {
        score++;
    }

    public void decreaseScore() {
        score--;
    }
}
