package main.java.list.desafios;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> itens;

    public CarrinhoDeCompras(){
        this.itens = new ArrayList<>();
    }

     public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, 2.0, 5));
    }

    public void removeItem(String nome){
        List<Item> itensHaRemover = new ArrayList<>();

        for(Item i: itens){
            if(i.getNome().equals(nome)){
                itensHaRemover.add(i);
            }
        }

        itens.removeAll(itensHaRemover);
    }


    public void exibirItens(){
        System.out.println(itens);
    }

    public void calcularValorTotal(){
        double total = 0;

        for(Item i: itens){
            double valorParcial = 0;
            valorParcial = i.getPreco() * i.getQuantidade();

            total += valorParcial;
        }
        System.out.printf("Valo Total: " + total);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras cc = new CarrinhoDeCompras();

        cc.adicionarItem("Boné", 50, 10);
        cc.adicionarItem("Chapeu", 10, 30);
        cc.adicionarItem("Chinela", 1, 20);

        cc.exibirItens();

        cc.removeItem("Chapeu");
        cc.exibirItens();

        cc.calcularValorTotal();
    }
}
