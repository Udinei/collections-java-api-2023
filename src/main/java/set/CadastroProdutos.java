package main.java.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }


    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto>  exibirProdutosPorNome(){
        // organiza o Set em ordem alfabetica se for string, usando TreeSet, Set não podem ser ordenados por
             Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;

    }

    public Set<Produto> exibirProdutosPorPreco(){
        // TreeSet vai organizar (por preco) o Set usando o ComparatorPorPreco, criado em produto
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        // ordena produtoSet
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;

    }

    public void exibirTodosProdutos(){
        System.out.println(produtoSet);
    }

    public static void main(String[] args) {
      CadastroProdutos cp = new CadastroProdutos();

        cp.adicionarProduto(1L, "Produto 5", 15d, 5);
        cp.adicionarProduto(2L, "Produto 0", 20d, 10);
        cp.adicionarProduto(1L, "Produto 3", 10d, 2);
        cp.adicionarProduto(9L, "Produto 9", 2d, 2);


        //cp. exibirTodosProdutos();
        System.out.println("por nome:"+ cp.exibirProdutosPorNome());
        System.out.println("por preco: " +cp.exibirProdutosPorPreco());


    }


}
