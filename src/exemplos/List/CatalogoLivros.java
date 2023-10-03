package exemplos.List;
import java.util.List;
import java.util.ArrayList;
public class CatalogoLivros {
    private List<Livro> listaDeLivros;
    /* constuctor */

    public CatalogoLivros() {
        this.listaDeLivros = new ArrayList<>();
    }
    /* Metodo de adicionar livros */
    /* Metodo de adicionar livros¯ */
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaDeLivros.add(new Livro(autor, titulo, anoPublicacao));
    }
    /* Metodo de pesquisar por autor */
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaDeLivros.isEmpty()) {
            for (Livro l : listaDeLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    /* Metodo de pesquisar por ano de publicaçao */
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
        if (!listaDeLivros.isEmpty()) {
            for (Livro li : listaDeLivros) {
                if (li.getAnoDePubicacao() >= anoInicial && li.getAnoDePubicacao()<=anoFinal) {
                    livrosPorIntervaloDeAno.add(li);
                }
                
            }
            
        }
        return livrosPorIntervaloDeAno;
    }
    /* Metodo de pesquisar por titulo */
    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> livrosPorTitulo = new ArrayList<>();
        if (!listaDeLivros.isEmpty()) {
            for (Livro lt : listaDeLivros) {
                if (lt.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo.add(lt);
                }
                
            }
            
        }
        return livrosPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","autor 1",1995);
        catalogoLivros.adicionarLivro("Livro 2","autor 1",2001);
        catalogoLivros.adicionarLivro("Livro 3","autor 2",1998);
        catalogoLivros.adicionarLivro("Livro 4","autor 3",2023);
        catalogoLivros.adicionarLivro("Livro 5","autor 4",1993);
        catalogoLivros.adicionarLivro("Livro 5","autor 4",1995);
        catalogoLivros.adicionarLivro("Livro 6","autor 5",1990);
        
        System.out.println(catalogoLivros.pesquisarPorAutor("autor 1"));    
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2001,2023));    
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 6"));    
    }
}
