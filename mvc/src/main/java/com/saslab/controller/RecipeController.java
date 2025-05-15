package com.saslab.controller;

import com.saslab.model.Recipe;
import com.saslab.viewfx.RecipeView;


public class RecipeController {
    private Recipe recipeModel;
    private RecipeView recipeView;

    public RecipeController(Recipe recipeModel, RecipeView recipeView) {
        this.recipeModel = recipeModel;
        this.recipeView = recipeView;

        this.recipeView.buttonUpdate.setOnAction(e -> {
            this.updateName("Carbonara con carbocrema");
        });

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
