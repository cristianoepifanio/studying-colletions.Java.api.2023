package exemplos.List.carrinho;

import java.util.List;
import java.util.ArrayList;

/**
 * ListaDeCompras
 */
public class ListaDeCompras {

    private List<Carrinho> ListaDeCompras;

    public ListaDeCompras() {
        this.ListaDeCompras = new ArrayList<>();
    }
    public void adicionarAoCarrinho(String compra) {
        ListaDeCompras.add(new Carrinho(compra));
    }
    public void removerDoCarrinho(String compra) {
        List<Carrinho> produtosParaRemover = new ArrayList<>();
        for (Carrinho c: ListaDeCompras) {
            if (c.getCompra().equalsIgnoreCase(compra)) {
                produtosParaRemover.add(0, c);
            }
        }
        ListaDeCompras.removeAll(produtosParaRemover);
    }
    public int ObterNumeroDeProdutos() {
        return ListaDeCompras.size();
        
    }
    public void obterDescricaoDosProdutos() {
        System.out.println(ListaDeCompras);
    }
    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();
        listaDeCompras.adicionarAoCarrinho("produto 1");
        listaDeCompras.adicionarAoCarrinho("produto 2");
        listaDeCompras.adicionarAoCarrinho("produto 3");
        listaDeCompras.adicionarAoCarrinho("produto 4");
        listaDeCompras.adicionarAoCarrinho("produto 5");
        listaDeCompras.adicionarAoCarrinho("produto 5");
        System.out.println("Produtos: "+listaDeCompras.ObterNumeroDeProdutos());
        listaDeCompras.obterDescricaoDosProdutos();
        listaDeCompras.removerDoCarrinho("produto 5");
        listaDeCompras.obterDescricaoDosProdutos();

    }
    
}