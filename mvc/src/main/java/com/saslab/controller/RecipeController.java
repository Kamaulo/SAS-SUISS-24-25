package com.saslab.controller;

import com.saslab.model.Recipe;
import com.saslab.view.interfaces.RecipeView;


public class RecipeController {
    private Recipe recipeModel;
    private RecipeView recipeView;

    public RecipeController(Recipe recipeModel, RecipeView recipeView) {
        this.recipeModel = recipeModel;
        this.recipeView = recipeView;
        
        // TODO: ristrutturare il codice in modo che il setOnActio
        // non avvenga all'interno del controller
        // Soluzione 1: assegnare handler dal main 
        // Soluzione 2: definire un interface per il controller
        // e avere due implementazioni (una per terminal e una per JavaFX)

        /*this.recipeView.buttonUpdate.setOnAction(e -> {
            this.updateName("Carbonara con carbocrema");
        });*/

        this.updateView();
    }

    public RecipeView getView() { return this.recipeView; }

    public void updateView() {
        this.recipeView.displayRecipe(this.recipeModel);
    }

    public void updateName(String name) {
        this.recipeModel.setName(name);
        this.updateView();
    }
}
