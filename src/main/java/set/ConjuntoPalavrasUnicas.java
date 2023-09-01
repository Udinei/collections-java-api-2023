package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }


    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    public void removerPalavra(String palavra){
        palavrasSet.remove(palavra);
    }


    public void verificarPalavra(String palavra){
        if(palavrasSet.contains(palavra)){
            System.out.println("Sim contem a palavra : " + palavra);
        }else {
            System.out.println("Essa palavra: "+ palavra + " nao existe na lista" );
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();
        cpu.adicionarPalavra("Palavra 1");
        cpu.adicionarPalavra("Palavra 2");
        cpu.adicionarPalavra("Palavra 2");

        cpu.exibirPalavrasUnicas();
        cpu.verificarPalavra("Palavra 3");
    }


}
