package org.example.View.Components;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class PlayButtonHBox extends HBox{
    Button playButton = new Button("Play");

    public PlayButtonHBox(){
        this.getChildren().add(playButton);


        playButton.getStyleClass().add("play-button");

        this.setAlignment(getAlignment().BOTTOM_CENTER);
        this.setPadding(new Insets(20, 20, 20, 20));
    }
}
