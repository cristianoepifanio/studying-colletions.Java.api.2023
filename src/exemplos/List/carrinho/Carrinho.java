package exemplos.List.carrinho;

/**
 * carrinho
 */
public class Carrinho {
    private String compra;

    public Carrinho(String compra) {
        this.compra = compra;
    }

    public String getCompra() {
        return compra;
    }

    @Override
    public String toString() {
        return "produto: " + compra;
    }
    
    
}