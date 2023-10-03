package exemplos.List;
import java.util.List;
import java.util.ArrayList;


public class ListaDeTarefa {

    private List<Tarefa> tarefaList;
    
    /* construtor */
    public ListaDeTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
        
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(0, t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
        
    }
    public int obterNumeroTotalDeTarefa() {
        return tarefaList.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaDeTarefa listaDeTarefa = new ListaDeTarefa();
        System.out.println("Lista tarefa: "+ listaDeTarefa.obterNumeroTotalDeTarefa());
        listaDeTarefa.adicionarTarefa("testar o adicionar tarefa");
        listaDeTarefa.adicionarTarefa("testar o adicionar tarefa");
        listaDeTarefa.adicionarTarefa("testar o adicionar mais uma tarefa");
        listaDeTarefa.adicionarTarefa("testar o adicionar outra tarefa");
        listaDeTarefa.adicionarTarefa("testar o adicionar uma outra tarefa");
        System.out.println("Lista tarefa: "+ listaDeTarefa.obterNumeroTotalDeTarefa());
        listaDeTarefa.removerTarefa("testar o adicionar tarefa");
        System.out.println("Lista tarefa: "+ listaDeTarefa.obterNumeroTotalDeTarefa());
        listaDeTarefa.obterDescricoesTarefas();
    }
}
