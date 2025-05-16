package com.saslab.view.terminal;

import com.saslab.model.Recipe;
import com.saslab.view.interfaces.RecipeView;

public class RecipeViewTerminal implements RecipeView {    
    public void displayRecipe(Recipe r) {
        System.out.println("Ricetta:" + r.getName());

        int minuti = (int)Math.floor(r.getPreparationTime() / 60);
        int secondi = r.getPreparationTime() % 60;

        System.out.println(String.format("Tempo di preparazione %d minuti %d secondi",
                                         minuti, 
                                         secondi
        ));
        System.out.println("----");
        System.out.println(r.getDescription() + "\n\n");
    }
}
