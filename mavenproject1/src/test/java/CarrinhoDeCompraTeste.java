import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pizza.CarrinhoDeCompras;
import pizza.Pizza;

public class CarrinhoDeCompraTeste {

    @Test
    public void testeTotalPagar(){
        Pizza p1 = new Pizza("mussarea");
        Pizza p2 = new Pizza("calabresa");
        Pizza p3 = new Pizza("mussarela");
        
        CarrinhoDeCompras c1 = new CarrinhoDeCompras();
        c1.adicionarItem(p1);
        c1.adicionarItem(p2);
        c1.adicionarItem(p3);
        
        assertEquals(120, c1.getTotalPagar());
    }
    
    @Test
    public void testeTotalPizzasNoCarrinho(){
        Pizza p1 = new Pizza("mussarela");
        Pizza p2 = new Pizza("calabresa");
        Pizza p3 = new Pizza("mussarela");
        
        CarrinhoDeCompras c1 = new CarrinhoDeCompras();
        c1.adicionarItem(p1);
        c1.adicionarItem(p2);
        c1.adicionarItem(p3);
        assertEquals(3, c1.totalPizzasAdicionadas());
    }
    
    

}
