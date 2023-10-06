package exemplos.Set;
import java.util.Set;
import java.util.HashSet;
public class AgendaDeContatos {
    private Set<Contato> contatosLista;

    public AgendaDeContatos() {
        this.contatosLista = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero) {
        contatosLista.add(new Contato(nome, numero));
    }
    public void  exibirContatos() {
        System.out.println(contatosLista);
    }
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatosLista) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosLista) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaDeContatos agendaDeContatos = new AgendaDeContatos();
        System.out.println("");
        agendaDeContatos.adicionarContato("Cristiano", 808732);
        agendaDeContatos.adicionarContato("Cristiano", 808733);
        agendaDeContatos.adicionarContato("Joao", 808733);
        agendaDeContatos.adicionarContato("Eduardo", 808734);
        agendaDeContatos.exibirContatos();
        System.out.println("");
    }
}
