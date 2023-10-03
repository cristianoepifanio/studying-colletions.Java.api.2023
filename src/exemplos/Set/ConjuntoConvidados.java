package exemplos.Set;
import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    /* Adicionar convidados */
    public void adicionarConvidado(String nome, int codigoDoConvite) {
        convidadoSet.add(new Convidado(nome, codigoDoConvite));
    }
    /* Remover convidados */
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoDoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        } 
        convidadoSet.remove(convidadoParaRemover);
    }
    /* Contabilzar convidados */
    public int contarConvidados() {
        return convidadoSet.size();
        
    }
    public void exibirConvidados() {
        System.out.println(convidadoSet);
        
    }
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Fernando", 1675);
        conjuntoConvidados.adicionarConvidado("Lucas", 8755);
        conjuntoConvidados.adicionarConvidado("Tiago", 8438);
        conjuntoConvidados.adicionarConvidado("Mateus", 1453);
        conjuntoConvidados.adicionarConvidado("Judas", 1453);
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(8438);
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
    }
    
}
