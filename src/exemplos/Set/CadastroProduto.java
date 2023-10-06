package exemplos.Set;
import java.util.Set;
import java.util.HashSet;
public class CadastroProduto {
    private Set<Produto> ListaDeProdutos;
    /* construtor */

    public CadastroProduto(Set<Produto> listaDeProdutos) {
        ListaDeProdutos = listaDeProdutos;
    }
    public CadastroProduto() {
        this.ListaDeProdutos = new HashSet<>();
    }
    /* Metodo de adicionar produto */
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        ListaDeProdutos.add(new Produto(nome, preco, quantidade, quantidade));
    }
    /* Metodo de exibir produto por nome*/
    
    
}
