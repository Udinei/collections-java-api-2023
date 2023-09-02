package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
       dicionarioMap.put(palavra, definicao);
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public void removerPalavras(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraPesquisada = null;
        if(!dicionarioMap.isEmpty()){
            palavraPesquisada = dicionarioMap.get(palavra);
        }
        return palavraPesquisada;
    }
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Boca", "Tubo digestivo");
        dicionario.adicionarPalavra("Casa", "Local onde se mora");
        dicionario.adicionarPalavra("Teste", "Valida se esta tudo ok");

        dicionario.exibirPalavras();
        dicionario.removerPalavras("Teste");

        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Boca"));
    }
}
