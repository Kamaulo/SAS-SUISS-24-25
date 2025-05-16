package com.saslab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.saslab.model.Recipe;
import com.saslab.view.fx.RecipeViewFX;
import com.saslab.view.terminal.RecipeViewTerminal;

import java.io.IOException;

import com.saslab.controller.RecipeController;

public class Main extends Application {
     @Override
    public void start(Stage stage) throws IOException {
        Recipe recipe = new Recipe(
            0, "Carbonara", 
            "Pasta con uova e guanciale", 
            20*62
        );
        
        RecipeController controller = new RecipeController(recipe, new RecipeViewFX());

        Scene scene = new Scene((RecipeViewFX)controller.getView(), 300, 200);
        stage.setScene(scene);
        stage.setTitle("Recipe View");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}