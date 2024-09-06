package org.example.View.Components;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ButtonMenue extends HBox{

    Button button25 = new Button("25");
    Button button5 = new Button("5");
    Button button60 = new Button("60");

   

    public ButtonMenue(){
        this.getChildren().addAll(button25, button5, button60);

        button25.getStyleClass().add("my-buttons");
        button25.setFont(Font.font("System", FontWeight.BOLD, 14));
        button25.setMaxWidth(Double.MAX_VALUE);
        button25.setMinHeight(35);

        button5.getStyleClass().add("my-buttons");
        button5.setFont(Font.font("System", FontWeight.BOLD, 14));
        button5.setMaxWidth(Double.MAX_VALUE);
        button5.setMinHeight(35);

        button60.getStyleClass().add("my-buttons");
        button60.setFont(Font.font("System", FontWeight.BOLD, 14));
        button60.setMaxWidth(Double.MAX_VALUE);
        button60.setMinHeight(35);
        
        HBox.setHgrow(button25, Priority.ALWAYS);
        HBox.setHgrow(button5, Priority.ALWAYS);
        HBox.setHgrow(button60, Priority.ALWAYS);
        

        
        
        

        this.setSpacing(10);
        this.setPadding(new Insets(30, 20, 20, 20));
    }
}
