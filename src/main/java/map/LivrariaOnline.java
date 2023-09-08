package main.java.map;

import java.util.*;

public class LivrariaOnline {
    Map<String,Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrosMap.put(link, new Livro(titulo,autor, preco));
    }

    public void removerLivro(String titulo){
        for(var entry:livrosMap.entrySet()) {
            if(entry.getValue().getTítulo().equalsIgnoreCase(titulo)) {
                livrosMap.remove(entry.getKey());
                break;
            }
        }
    }

    public void exibirLivros(){
        Map<String, Livro> livrosOrdenados = new TreeMap<>(livrosMap);
        System.out.println(livrosOrdenados);

    }



    /*public void exibirLivrosOrdenadosPorPreco() {
        TreeMap<Livro, Object> livrosOrdenados = new TreeMap<>();
        System.out.println(livrosOrdenados);

    }*/

    public void exibirLivrosOrdenadosPorPreco() {
        TreeMap<Double, Livro> livrosOrdenados = new TreeMap<>(new Comparator<Double>() {
            @Override
            public int compare(Double preco1, Double preco2) {
                return Double.compare(preco1, preco2);
            }
        });

        System.out.println(livrosOrdenados.entrySet());
        for (var entry : livrosMap.entrySet()) {
            Livro livro = entry.getValue();
            double preco = livro.getPreco();
            livrosOrdenados.put(preco, entry.getValue());
        }

        System.out.println(livrosOrdenados);

    }


    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> pesquisaAutor = new HashMap<>();
        if(!livrosMap.isEmpty()){
            for(var entry: livrosMap.entrySet()){
                if(entry.getValue().getAutor().equalsIgnoreCase(autor)){
                    pesquisaAutor.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return pesquisaAutor;
    }

    public Livro obterLivroMaisCaro(){
       Livro livroMaisCaro = null;
       double maiorValor = Double.MIN_VALUE;

       for(var entry: livrosMap.entrySet()){
           if(entry.getValue().getPreco() > maiorValor){
               maiorValor = entry.getValue().getPreco();
               livroMaisCaro = entry.getValue();
           }
       }
       return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double menorValor = Double.MAX_VALUE;

        for(var entry: livrosMap.entrySet()){
            if(entry.getValue().getPreco() < menorValor){
                menorValor = entry.getValue().getPreco();
                livroMaisBarato = entry.getValue();
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline lo = new LivrariaOnline();
        lo.adicionarLivro("https://amzn.to/3EclT8Z",  "O segredo para o amor,", "Rhonda Byrne", 28.49 );
        lo.adicionarLivro("https://amzn.to/47Umiun",  "Beatriz o ser", "Justo verissimo", 30.00 );
        lo.adicionarLivro("https://amzn.to/3L1FFI6",  "A testa para o nao ser,", "Juca pirama", 5.0);
        lo.adicionarLivro("https://amzn.to/3OYb9jk",  "Sendo", "Juca pirama", 10.0);

      //   lo.exibirLivros();
      //  lo.removerLivro("Sendo");
      //  lo.exibirLivros();
      //  System.out.println("Ordenados por preço " + lo.exibirLivrosOrdenadosPorPreco());
        lo.exibirLivrosOrdenadosPorPreco();
       /* System.out.println("Pesquisa por autor " + lo.pesquisarLivrosPorAutor("Juca pirama"));
        System.out.println("Livros mais caros " + lo.obterLivroMaisCaro());

        System.out.println("Livros mais baratos " + lo.obterLivroMaisBarato());*/

       // extracted();

    }


}
