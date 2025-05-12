package com.saslab;

import java.util.ArrayList;
import java.util.List;

public class RecipeBook {
    public List<Recipe> recipes = new ArrayList<Recipe>();

    public void addRecipe(Recipe r) { this.recipes.add(r); };

    public void deleteRecipe(int id) { 
        this.recipes.removeIf((Recipe r) -> { 
            return r.getId() == id;
        });
    };

    public void updateRecipe(Recipe r) {
        // Possibile soluzione 1: delete e add sono già testati!
        this.deleteRecipe(r.getId());
        this.addRecipe(r);
    };

    public void updateRecipe2(Recipe r) {
        // Possibile soluzione 2: sovrascriviamo l'elemento
        // all'indice corrispondente
        int index = 0;
        for (int i = 0; i < this.recipes.size(); i++) {
            if (this.recipes.get(i).getId() == r.getId()) {
                index = i;
                break;
            }
        }
        this.recipes.set(index, r);
    }

    public void updateRecipe3(Recipe r) {
         // Possibile soluzione 3: aggiorniamo i campi dell'elemento esistente
        int index = 0;
        for (int i = 0; i < this.recipes.size(); i++) {
            if (this.recipes.get(i).getId() == r.getId()) {
                index = i;
                break;
            }
        }
        this.recipes.get(index).setName(r.getName());
        this.recipes.get(index).setDescription(r.getDescription());
        this.recipes.get(index).setPreparationTime(r.getPreparationTime());
    }
}
