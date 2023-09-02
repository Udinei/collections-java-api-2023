package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }


    public void adicionarContato(String nome, Integer telefone){
        agendaContatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatos.isEmpty()){
            agendaContatos.remove(nome);
        }
    }


    public void exibirContatos(){
        System.out.println(agendaContatos);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatos.isEmpty()){
            numeroPorNome = agendaContatos.get(nome);
        }

        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.adicionarContato("Camila", 123456);
        ac.adicionarContato("Camila", 5665);
        ac.adicionarContato("Camila Calvalcante", 123456);
        ac.adicionarContato("Camila DIO", 654987);
        ac.adicionarContato("Maria Silva", 1111111);
        ac.adicionarContato("Camila", 44444);

        ac.exibirContatos();

        ac.removerContato("Maria Silva");

        ac.exibirContatos();
        System.out.println(ac.pesquisarPorNome("Camila DIO"));
    }

}
