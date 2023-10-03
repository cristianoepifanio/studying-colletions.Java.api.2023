package exemplos.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* import exemplos.List.Pessoa.ComparatorPorAltura; */

public class OrdenacaoPessoa {
    private List<Pessoa> listaDePessoa;

    public OrdenacaoPessoa() {
        this.listaDePessoa = new ArrayList<>();
    } 
    public void adicionarPessoa(String nome, int idade, double altura) {
        listaDePessoa.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenadoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    /* public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoa);
    if (!listaDePessoa.isEmpty()) {
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    } */
 /*  } */

  public static void main(String[] args) {
  // Criando uma instância da classe OrdenacaoPessoas
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

    // Adicionando pessoas à lista
    ordenacaoPessoa.adicionarPessoa("Alice", 20, 1.56);
    ordenacaoPessoa.adicionarPessoa("Bob", 30, 1.80);
    ordenacaoPessoa.adicionarPessoa("Charlie", 25, 1.70);
    ordenacaoPessoa.adicionarPessoa("David", 17, 1.56);

    // Exibindo a lista de pessoas adicionadas
    System.out.println(ordenacaoPessoa.listaDePessoa);

    // Ordenando e exibindo por idade
    System.out.println(ordenacaoPessoa.ordenadoPorIdade());

    // Ordenando e exibindo por altura
    /* System.out.println(ordenacaoPessoa.ordenarPorAltura()); */
  }
    
}
