package exemplos.List;

public class Livro {
    private String autor;
    private String titulo;
    private int anoDePubicacao;
    /* Construtor */
    public Livro(String autor, String titulo, int anoDePubicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoDePubicacao = anoDePubicacao;
    }
    /* Getters */
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAnoDePubicacao() {
        return anoDePubicacao;
    }
    /* toString */
    @Override
    public String toString() {
        return "[" + autor + ", " + titulo + ", " + anoDePubicacao + "]";
    }
    
}
