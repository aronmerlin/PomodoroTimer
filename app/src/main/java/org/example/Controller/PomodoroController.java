package org.example.Controller;

import org.example.Model.PomodoroModel;
import org.example.View.PomodoroView;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class PomodoroController {
    PomodoroModel pomodoroModel;
    PomodoroView pomodoroView;
    Timeline timeline;

    public PomodoroController(PomodoroModel pomodoroModel, PomodoroView pomodoroView) {
        this.pomodoroModel = pomodoroModel;
        this.pomodoroView = pomodoroView;

        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            pomodoroModel.decrementTime();
            pomodoroView.getTimeRing().updateTime(pomodoroModel.getRemainingTime());
        }));
    }


    
}
