package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import java.io.IOException;


/**
 * Esempio app per salutare utente
 */
public class GreetApp extends Application {
    public void onClick(ActionEvent e, Label label, TextField textField) {
        if (textField.getText().length() <= 0) 
            label.setText("Please insert your name!");
        else
            label.setText("Hello: " + textField.getText());
    }

    @Override
    public void start(Stage stage) throws IOException {        
        TextField textField = new TextField();
        textField.setPromptText("Enter your name");
        textField.setFocusTraversable(false);

        Label labelGreet = new Label("");

        Button button = new Button("Greet me");
        button.setOnAction((ActionEvent e) -> {
            this.onClick(e, labelGreet, textField);
        });
        button.setDisable(true);  // il pulsante è disabilitato di default
        
        /*
         * Listener per textField: se il campo è vuoto, disabilita il pulsante
         * altrimenti lo abilita
         */
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() <= 0) 
                button.setDisable(true);
            else
                button.setDisable(false);
        });
        
        VBox layout = new VBox(10.0, textField, button, labelGreet);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Hello world!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}