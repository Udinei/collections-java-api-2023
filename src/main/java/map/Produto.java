package main.java.map;

import java.util.Objects;

public class Produto {

    private String nome;

    private int quantidade;

    private double preco;

    public Produto(String nome, int quantidade, double preço) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
               ", quantidade=" + quantidade +
                ", preço=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return quantidade == produto.quantidade && Double.compare(produto.preco, preco) == 0 && Objects.equals(getNome(), produto.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), quantidade, preco);
    }
}
