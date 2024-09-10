package org.example.View.Components;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

    public Image getPlayImage() {
        return playImage;
    }

    public void setPlayImage(Image playImage) {
        this.playImage = playImage;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public Button getPlayButton() {
        return playButton;
    }

    public void setPlayButton(Button playButton) {
        this.playButton = playButton;
    }

    public void switchIcon(boolean playButtonPressed) {
        if(!playButtonPressed){
            playImage = new Image(getClass().getResourceAsStream("/img/pause.png"));
            imageView.setTranslateX(0);
            
        }else{
            playImage = new Image(getClass().getResourceAsStream("/img/play.png"));
            imageView.setTranslateX(2);
            
        }
        imageView.setImage(playImage);
    }

    
}
