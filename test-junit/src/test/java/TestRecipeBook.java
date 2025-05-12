import static org.junit.Assert.*;
import org.junit.*;

import com.saslab.Recipe;
import com.saslab.RecipeBook;


public class TestRecipeBook {
    
    @Test 
    public void testAddRecipe() {
        RecipeBook recipeBook = new RecipeBook();
        int totalRecipes = recipeBook.recipes.size();

        Recipe recipe = new Recipe(
            0,
            "nome",
            "descrizione",
            600
        );

        // Verifichiamo aggiunta
        recipeBook.addRecipe(recipe);
        assertEquals(totalRecipes + 1, recipeBook.recipes.size());
    }

    @Test
    public void testRemoveRecipe() {
        RecipeBook recipeBook = new RecipeBook();
        Recipe recipe = new Recipe(
            0,
            "nome",
            "descrizione",
            600
        );
        recipeBook.addRecipe(recipe);
        int totalRecipes = recipeBook.recipes.size();

        // Verifichiamo rimozione
        recipeBook.deleteRecipe(recipe.getId());
        assertEquals(totalRecipes - 1, recipeBook.recipes.size());
    }

    @Test
    public void testUpdateRecipe() {
        RecipeBook recipeBook = new RecipeBook();
        Recipe recipe = new Recipe(
            0,
            "nome",
            "descrizione",
            600
        );
        recipeBook.addRecipe(recipe);
        int totalRecipes = recipeBook.recipes.size();

        Recipe newRecipe = new Recipe(
            0,
            "nome aggiornato",
            "descrizione",
            600
        );

        // Verifichiamo aggiornamento
        recipeBook.updateRecipe(newRecipe);

        assertEquals(totalRecipes, recipeBook.recipes.size());
        assertTrue(recipeBook.recipes.contains(newRecipe));
    }
}
