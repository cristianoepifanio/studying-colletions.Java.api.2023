package exemplos.Set;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
public class CadastroProduto {
    private Set<Produto> ListaDeProdutos;
    
    /* construtor */
    public CadastroProduto() {
        this.ListaDeProdutos = new HashSet<>();
    }
    /* Metodo de adicionar produto */
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        ListaDeProdutos.add(new Produto(nome, preco, quantidade, quantidade));
    }
    /* Metodo de exibir produto por nome*/
    public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(ListaDeProdutos);
    if (!ListaDeProdutos.isEmpty()) {
      return produtosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    if (!ListaDeProdutos.isEmpty()) {
      produtosPorPreco.addAll(ListaDeProdutos);
      return produtosPorPreco;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

    
    
}
