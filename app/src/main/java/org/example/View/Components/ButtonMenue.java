package org.example.View.Components;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class ButtonMenue extends HBox{

    Button button25 = new Button("25");
    Button button5 = new Button("5");
    Button button60 = new Button("60");

   

    public ButtonMenue(){
        this.getChildren().addAll(button25, button5, button60);

        button25.getStyleClass().add("my-buttons");
        button5.getStyleClass().add("my-buttons");
        button60.getStyleClass().add("my-buttons");
        
        HBox.setHgrow(button25, Priority.ALWAYS);
        HBox.setHgrow(button5, Priority.ALWAYS);
        HBox.setHgrow(button60, Priority.ALWAYS);

        button25.setMaxWidth(Double.MAX_VALUE);
        button5.setMaxWidth(Double.MAX_VALUE);
        button60.setMaxWidth(Double.MAX_VALUE);

        this.setSpacing(10);
        this.setPadding(new Insets(30, 20, 20, 20));
    }
}
