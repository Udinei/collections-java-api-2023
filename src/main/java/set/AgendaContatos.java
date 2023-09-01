package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatoSet = new HashSet<>();

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public Set<Contato> pesquisarPorNome(String nome){
      Set<Contato> contatosPorNome = new HashSet<>();

      for(Contato c: contatoSet){
          if(c.getNome().startsWith(nome)){
              contatosPorNome.add(c);
          }
      }
      return contatosPorNome;

    }
    public static void main(String[] args) {
      AgendaContatos ac = new AgendaContatos();

      ac.exibirContatos();
      ac.adicionarContato("Camila", 1234);
      ac.adicionarContato("Camila", 5665);
      ac.adicionarContato("Camila Calvacante", 111111111);
      ac.adicionarContato("Camila Dio", 654987);
      ac.adicionarContato("Maria Silva", 111111111);

      ac.exibirContatos();
      System.out.println(ac.pesquisarPorNome("Maria"));

      System.out.println("Contato atualizado: " + ac.atualizarNumeroContato("Maria Silva", 665555));

        ac.exibirContatos();
    }

}
