import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pizza.Pizza;

public class PizzaTeste {
    
    
    @Test
    public void testGetPrecoParaPizzasComAte2Ingredientes(){
        Pizza p1 = new Pizza("mussarela");
        p1.adicionaIngrediente("oregano");
        assertEquals(40.00, p1.getPreco(),0);
    }
    
    @Test
    public void testGetPrecoParaPizzasComAte5Ingredientes(){
        Pizza p2 = new Pizza("calabresa");
        p2.adicionaIngrediente("oregano");
        p2.adicionaIngrediente("queijo");
        p2.adicionaIngrediente("cebola");
        assertEquals(60.00, p2.getPreco(),0);
    }
    
    public void testGetPrecoParaPizzasMaisDe5Ingredientes(){
        Pizza p3 = new Pizza("calabresa");
        p3.adicionaIngrediente("oregano");
        p3.adicionaIngrediente("queijo");
        p3.adicionaIngrediente("cebola");
        p3.adicionaIngrediente("cebola");
        p3.adicionaIngrediente("cebola");
        assertEquals(90.00, p3.getPreco(),0);
    }
}
