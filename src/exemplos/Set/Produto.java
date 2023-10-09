package exemplos.Set;
import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{

    /* atributos */
    private String nome;
    private double preco;
    private int quantidade;
    private long codigo;



    /* Construtor */
    public Produto(String nome, double preco, int quantidade, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }
    /* Metodos GET e SET */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getCodigo() {
        return (int) codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /* toString */
    @Override
    public String toString() {
        return "[nome: " + nome + ", preco: " + preco + ", quantidade: " + quantidade + ", codigo: " + codigo
                + "]";
    }
    /* Hashcode */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + codigo);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }
    /* Metodo compateTo */
    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
    class ComparatorPorPreco implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
          return Double.compare(p1.getPreco(), p2.getPreco());
        }
    
}}
