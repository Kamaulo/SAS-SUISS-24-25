package com.saslab.view.fx;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import com.saslab.model.Recipe;
import com.saslab.view.interfaces.RecipeView;

public class RecipeViewFX extends VBox implements RecipeView { 
    private Label name = new Label();
    private Label duration = new Label();
    private Label description = new Label();
    public Button buttonUpdate = new Button("Update UI");

    public RecipeViewFX() {
        this.getChildren().addAll(name, duration, description, buttonUpdate);
    }

    public RecipeViewFX(Recipe r) {
        this();
        this.displayRecipe(r);
    }

    public void displayRecipe(Recipe r) {
        name.setText(r.getName());
        name.setFont(new Font(20));
        
        int minuti = (int)Math.floor(r.getPreparationTime() / 60);
        int secondi = r.getPreparationTime() % 60;
        duration.setText(
            String.format(
                "Tempo di preparazione %d minuti %d secondi",
                minuti, secondi
        ));

        description.setText(r.getDescription());        
    }
}
