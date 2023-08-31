package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        // list permite objetos repetidos
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        // gera lista somente dos elementos que seram removidos
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                // criando lista somente das tarefas a seram removidas
                tarefasParaRemover.add(t);
            }
        }
        // remove todas as tarefas do
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);

    }

    public static void main(String[] args) {
       ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());
        // adicionar tarefa
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());


        // remover tarefa
      //  listaTarefas.removerTarefa("Tarefa 2");
        System.out.println("Tarefa removida o numero total de elementos agora na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }

}

