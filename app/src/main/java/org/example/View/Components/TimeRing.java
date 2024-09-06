package org.example.View.Components;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;

public class TimeRing extends StackPane{

    Arc timeReducing = new Arc();
    Label timeDisplay = new Label("25:00");

    public TimeRing() {
        this.getChildren().add(timeReducing);
        this.getChildren().add(timeDisplay);

        timeReducing.setRadiusX(100); // Horizontaler Radius
        timeReducing.setRadiusY(100); // Vertikaler Radius
        timeReducing.setStartAngle(90); // Startwinkel (obere Mitte)
        timeReducing.setLength(360);

        timeReducing.getStyleClass().add("time-ring");
        timeDisplay.getStyleClass().add("time-display");

        timeReducing.setType(ArcType.OPEN);
        timeReducing.setFill(Color.TRANSPARENT);

        
    }
    
}
