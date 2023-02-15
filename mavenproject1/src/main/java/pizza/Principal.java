package pizza;

public class Principal {
    public static void main(String [] args){
        Pizza p1 = new Pizza("mussarela");
        Pizza p2 = new Pizza("frango   ");
        Pizza p3 = new Pizza("calabreza");
        
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionarItem(p1);
        carrinho.adicionarItem(p2);
        carrinho.adicionarItem(p3);
        
        System.out.printf("\n Total de pizzas no carrinho........: %d", carrinho.totalPizzasAdicionadas());
        
        System.out.printf("\n\n Todas as pizzas são criadas com 1 ingrediente, o ingrediente do sabor da pizza");
        System.out.printf("\n Valor da pizza de sabor %s.........: %f", p1.getSabor(), p1.getPreco());
        System.out.printf("\n Valor da pizza de sabor %s.........: %f", p2.getSabor(), p1.getPreco());
        System.out.printf("\n Valor da pizza de sabor %s.........: %f", p3.getSabor(), p1.getPreco());
        
       
        System.out.printf("\n Todas as pizzas do carrinho totalizam %d ingredientes", p1.getNumeroIngredientes());
        
        
        System.out.printf("\n\n Acrescentando mais 1 ingrediente à pizza de mussarela");
        p1.adicionaIngrediente("azeitonas");
        
        System.out.printf("\n Novo Valor para a pizza de sabor %s......: %f", p1.getSabor(), p1.getPreco());
        
        
        System.out.printf("\n\n Acrescentando mais 3 ingredientes à pizza de frango");        
        p2.adicionaIngrediente("catupiry");
        p2.adicionaIngrediente("milho");
        p2.adicionaIngrediente("azeitonas");
        System.out.printf("\n Novo Valor para a pizza de sabor %s......: %f", p2.getSabor(), p2.getPreco());
        
        
        System.out.printf("\n\n Acrescentando mais 5 ingredientes à pizza de calabreza");  
        p3.adicionaIngrediente("tomate");
        p3.adicionaIngrediente("manjericão");
        p3.adicionaIngrediente("azeite");
        p3.adicionaIngrediente("borda com catupiry");
        p3.adicionaIngrediente("cebola");
        System.out.printf("\n Novo Valor para a pizza de sabor %s......: %f", p3.getSabor(), p3.getPreco());
        
       
        p1.listarIngredientes();
        p2.listarIngredientes();
        p3.listarIngredientes();
       
        System.out.printf("\n\n Todas as pizzas do carrinho totalizam %d ingredientes", p1.getNumeroIngredientes());
    }
}
