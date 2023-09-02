package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void exibirContagemPalavras(){
        System.out.println(palavrasMap);
    }

    public void removerPalavra(String palavra){
        palavrasMap.remove(palavra);
    }

    public String encontrarPalavraMaisFrequente(){
        String palavra = "";
        int palavraMaisFrequente = 0;

        for(Map.Entry<String, Integer> entry:palavrasMap.entrySet()){

            if(entry.getValue() > palavraMaisFrequente){
                palavraMaisFrequente = entry.getValue();
                palavra =  entry.getKey() +"=" + entry.getValue();
            }
        }
        return palavra;
    }


    public static void main(String[] args) {

        ContagemPalavras cp = new ContagemPalavras();

        cp.adicionarPalavra("Amor",4);
        cp.adicionarPalavra("Paz",3);
        cp.adicionarPalavra("Virtude",3);

        cp.exibirContagemPalavras();
        System.out.println(cp.encontrarPalavraMaisFrequente());



    }
}
