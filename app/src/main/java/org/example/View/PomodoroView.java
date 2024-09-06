package org.example.View;

import org.example.View.Components.ButtonMenue;
import org.example.View.Components.PlayButtonHBox;
import org.example.View.Components.TimeRing;

import javafx.scene.layout.BorderPane;

public class PomodoroView extends BorderPane{

    ButtonMenue buttonMenue;
    PlayButtonHBox playButtonHBox;
    TimeRing timeRing;

    public PomodoroView() {

        buttonMenue = new ButtonMenue();
        playButtonHBox = new PlayButtonHBox();
        timeRing = new TimeRing();

        this.getStyleClass().add("root-background");
        this.setTop(buttonMenue);
        this.setCenter(timeRing);
        this.setBottom(playButtonHBox);

        this.getStyleClass().add("root-background");
    }



    public ButtonMenue getButtonMenue() {
        return buttonMenue;
    }



    public void setButtonMenue(ButtonMenue buttonMenue) {
        this.buttonMenue = buttonMenue;
    }



    public PlayButtonHBox getPlayButtonHBox() {
        return playButtonHBox;
    }



    public void setPlayButtonHBox(PlayButtonHBox playButtonHBox) {
        this.playButtonHBox = playButtonHBox;
    }



    public TimeRing getTimeRing() {
        return timeRing;
    }



    public void setTimeRing(TimeRing timeRing) {
        this.timeRing = timeRing;
    }



    

    
    
}
