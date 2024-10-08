package org.example.View.Components;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class TimeRing extends StackPane{

    // Arc timeReducing = new Arc();
    Label timeDisplay = new Label("25:00");

    public TimeRing() {
        // this.getChildren().add(timeReducing);
        this.getChildren().add(timeDisplay);

        // timeReducing.setCenterX(144);
        // timeReducing.setCenterY(205);
        // timeReducing.setRadiusX(100); 
        // timeReducing.setRadiusY(100); 
        // timeReducing.setStartAngle(90); 
        // timeReducing.setLength(360);


        

        // timeReducing.getStyleClass().add("time-ring");
        timeDisplay.getStyleClass().add("time-display");

        // timeReducing.setType(ArcType.OPEN);
        // timeReducing.setFill(Color.TRANSPARENT);

        timeDisplay.setPrefWidth(90);
        timeDisplay.setAlignment(Pos.CENTER);
    }

    public void updateTime(int remainingTime, int totalTime) {
        // double prozent = (double) remainingTime / totalTime;
        // double winkel = prozent * 360;
        // timeReducing.setLength(winkel);

        int minutes = remainingTime / 60;
        int seconds = remainingTime % 60;

        timeDisplay.setText(String.format("%02d:%02d", minutes, seconds));
    }

    // public Arc getTimeReducing() {
    //     return timeReducing;
    // }

    // public void setTimeReducing(Arc timeReducing) {
    //     this.timeReducing = timeReducing;
    // }

    public Label getTimeDisplay() {
        return timeDisplay;
    }

    public void setTimeDisplay(Label timeDisplay) {
        this.timeDisplay = timeDisplay;
    }

    
    
}
