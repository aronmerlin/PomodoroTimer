package org.example.Model;

public class PomodoroModel {

    private int totalTime;
    private int remainingTime;

    public PomodoroModel(int totalTime) {
        this.totalTime = totalTime;
        this.remainingTime = totalTime;
    }

    public void decrementTime(){
        remainingTime--;
    }

    public void resetTimer(){
        remainingTime = totalTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public int getRemainingTime() {
        return remainingTime;
    }
    
}
