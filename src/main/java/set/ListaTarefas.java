package main.java.set;


import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public void removerTarefa(String descricao){
        Tarefa tarefa = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa f:tarefaSet){
                if(f.getDescricao().equals(descricao)){
                    tarefa = f;
                    break;
                }
            }
        }
         tarefaSet.remove(tarefa);
    }


    public void contarTarefas(){
        System.out.println(tarefaSet.size());
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t: tarefaSet){
            // o objeto sera atualiando dentro do Set
            if(t.getDescricao().equals(descricao)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa t: tarefaSet){
            if(t.getDescricao().equals(descricao)){
                // o objeto sera atualiando dentro do Set
                t.setConcluida(false);
            }
        }
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for(Tarefa t: tarefaSet){
            if(!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;

    }

    public void limparListaTarefas(){
        tarefaSet.clear();

    }


    public static void main(String[] args) {
        ListaTarefas lt = new ListaTarefas();

        lt.adicionarTarefa("Programar em java");
        lt.adicionarTarefa("Estudar JSF");
        lt.adicionarTarefa("Programar em pyton");
        lt.adicionarTarefa("Desenvolver");
        lt.adicionarTarefa("Criar");

        lt.exibirTarefas();
        lt.removerTarefa("Programar em pyton");
        lt.exibirTarefas();

        lt.contarTarefas();

        lt.marcarTarefaConcluida("Criar");
        lt.marcarTarefaConcluida("Desenvolver");
        lt.exibirTarefas();

        //lt.marcarTarefaPendente("Criar");

        lt.exibirTarefas();
        System.out.println(lt.obterTarefasPendentes());

        lt.limparListaTarefas();
        System.out.println("lista de tarefas: " );
        lt.exibirTarefas();
    }

}
