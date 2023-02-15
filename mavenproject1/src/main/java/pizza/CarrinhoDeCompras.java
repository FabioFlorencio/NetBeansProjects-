   
package pizza;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private double total_pagar = 0;
    
    ArrayList<Pizza> carrinho_de_compras = new ArrayList();
    
    public void adicionarItem(Pizza obj){
        carrinho_de_compras.add(obj);   
        total_pagar+= obj.getPreco();
    }
    public int totalPizzasAdicionadas(){
        return carrinho_de_compras.size();
    }
       
    public double getTotalPagar(){
        return total_pagar;
    }
    
}
