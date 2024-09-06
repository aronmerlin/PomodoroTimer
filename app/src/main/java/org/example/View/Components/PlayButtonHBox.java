package org.example.View.Components;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class PlayButtonHBox extends StackPane{
    
    Image playImage = new Image(getClass().getResourceAsStream("/img/play.png"));
    ImageView imageView = new ImageView(playImage);
    Button playButton = new Button();

    public PlayButtonHBox(){
        this.getChildren().add(playButton);

        imageView.setFitHeight(25);
        imageView.setFitWidth(25);
        imageView.setTranslateX(2);


        playButton.getStyleClass().add("play-button");
        playButton.setGraphic(imageView);



        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20, 20, 20, 20));
    }
}
