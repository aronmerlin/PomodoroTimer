package org.example.View;

import org.example.Model.PomodoroModel;
import org.example.View.Components.PlayButtonHBox;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Arc;
import javafx.util.Duration;

public class PomodoroController {
    private PomodoroModel pomodoroModel;
    private PomodoroView pomodoroView;
    private Timeline timeline;
    private boolean playButtonPressed = false;
    String timeButtonPressed = "button25";

    // Interaktive Elemente aus TimeRing
    private Arc timeReducing;
    private Label timeDisplay;

    // Interaktive Elemente aus PlayButtonHBox
    private Button playButton;

    // Interaktive Elemente aus ButtonMenue
    private Button button25;
    private Button button5;
    private Button button60;

    public PomodoroController(PomodoroModel pomodoroModel, PomodoroView pomodoroView) {
        this.pomodoroModel = pomodoroModel;
        this.pomodoroView = pomodoroView;

        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            pomodoroModel.decrementTime();
            pomodoroView.getTimeRing().updateTime(pomodoroModel.getRemainingTime(), pomodoroModel.getTotalTime());
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);

        // Interaktive Lemente aus TimeRing holen
        timeReducing = pomodoroView.getTimeRing().getTimeReducing();
        timeDisplay = pomodoroView.getTimeRing().getTimeDisplay();

        // Interaktive Elemente aus PlayButtonHBox
        playButton = pomodoroView.getPlayButtonHBox().getPlayButton();

        // Interaktive Elemente aus ButtonMenue
        button25 = pomodoroView.getButtonMenue().getButton25();
        button5 = pomodoroView.getButtonMenue().getButton5();
        button60 = pomodoroView.getButtonMenue().getButton60();

        buttonColorChange(timeButtonPressed);

        init();
    }

    public void init() {

        playButton.addEventHandler(ActionEvent.ACTION, e -> {
            if (!playButtonPressed) {
                startTimeline();
                pomodoroView.getPlayButtonHBox().switchIcon(playButtonPressed);
                playButtonPressed = true;
            } else {
                stopTimeline();
                pomodoroView.getPlayButtonHBox().switchIcon(playButtonPressed);
                playButtonPressed = false;
            }

        });

        button5.addEventHandler(ActionEvent.ACTION, e -> {
            pomodoroModel.setTotalTime(5 * 60);
            pomodoroModel.setRemainingTime(5 * 60);
            pomodoroView.getTimeRing().updateTime(pomodoroModel.getRemainingTime(), pomodoroModel.getTotalTime());
            timeButtonPressed = "button5";
            buttonColorChange(timeButtonPressed);
            
        });
        button25.addEventHandler(ActionEvent.ACTION, e -> {
            pomodoroModel.setTotalTime(25 * 60);
            pomodoroModel.setRemainingTime(25 * 60);
            pomodoroView.getTimeRing().updateTime(pomodoroModel.getRemainingTime(), pomodoroModel.getTotalTime());
            timeButtonPressed = "button25";
            buttonColorChange(timeButtonPressed);
        });
        button60.addEventHandler(ActionEvent.ACTION, e -> {
            pomodoroModel.setTotalTime(60 * 60);
            pomodoroModel.setRemainingTime(60 * 60);
            pomodoroView.getTimeRing().updateTime(pomodoroModel.getRemainingTime(), pomodoroModel.getTotalTime());
            timeButtonPressed = "button60";
            buttonColorChange(timeButtonPressed);
        });

        

    }

    public void startTimeline() {
        timeline.play();
    }

    public void stopTimeline() {
        timeline.stop();
    }

    public void pauseTimeline() {
        timeline.pause();
    }

    public void buttonColorChange(String timeButtonPressed){
        switch (timeButtonPressed) {
            case "button5":
                pomodoroView.getButtonMenue().setButtonColorButtonPressed(button5);
                pomodoroView.getButtonMenue().setButtonColorNotPressed(button25);
                pomodoroView.getButtonMenue().setButtonColorNotPressed(button60);
                break;
            case "button25":
                pomodoroView.getButtonMenue().setButtonColorButtonPressed(button25);
                pomodoroView.getButtonMenue().setButtonColorNotPressed(button5);
                pomodoroView.getButtonMenue().setButtonColorNotPressed(button60);
                break;
            case "button60":
                pomodoroView.getButtonMenue().setButtonColorButtonPressed(button60);
                pomodoroView.getButtonMenue().setButtonColorNotPressed(button25);
                pomodoroView.getButtonMenue().setButtonColorNotPressed(button5);
                break;

        }
    }

}
