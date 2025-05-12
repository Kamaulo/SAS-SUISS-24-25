import static org.junit.Assert.assertEquals;
import org.junit.*;

import com.saslab.Recipe;

public class TestRecipe {
    
    @Test
    public void testCreateRecipe() {
        Recipe recipe = new Recipe(
            0,
            "nome",
            "descrizione",
            600
        );

        assertEquals(0, recipe.getId());
        assertEquals("nome", recipe.getName());
        assertEquals("descrizione", recipe.getDescription());
        assertEquals(600, recipe.getPreparationTime());
    }
}
