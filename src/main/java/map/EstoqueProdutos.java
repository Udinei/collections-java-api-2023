package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome,  int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque =0d;
          if(!estoqueProdutoMap.isEmpty()){
              for(Produto p: estoqueProdutoMap.values()){
                   valorTotalEstoque += p.getQuantidade() * p.getPreco();
              }
          }

          return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
            Produto produtoMaisCaro = null;
            double maiorPreco = Double.MIN_VALUE;

            for(Produto p: estoqueProdutoMap.values()){
                if(p.getPreco() > maiorPreco){
                   produtoMaisCaro = p;
                }
            }
            return produtoMaisCaro;
    }


    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for(Produto p: estoqueProdutoMap.values()){
            if(p.getPreco() < menorPreco){
                menorPreco = p.getPreco();
                produtoMaisBarato = p;

            }
        }

        return produtoMaisBarato;
    }


    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
              Produto produtoMaiorEstoque = null;
              double valorTotalDoProduto = 0d;

             for(Produto p: estoqueProdutoMap.values()){
                 double valor = p.getPreco() * p.getPreco();
                 if(valor > valorTotalDoProduto){
                     valorTotalDoProduto = valor;
                     produtoMaiorEstoque = p;
                 }
             }

             return produtoMaiorEstoque;
    }


    public static void main(String[] args) {
         EstoqueProdutos ep = new EstoqueProdutos();

        ep.adicionarProduto(1L, "Produto A", 10, 5.0);
        ep.adicionarProduto(2L, "Produto B", 5, 10.0);
        ep.adicionarProduto(3L, "Produto C", 2, 15.0);
        ep.adicionarProduto(3L, "Produto D", 1, 20.0);

        ep.exibirProdutos();

        System.out.println("Valor total estoque: " + ep.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + ep.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + ep.obterProdutoMaisBarato());

        System.out.println(ep.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
