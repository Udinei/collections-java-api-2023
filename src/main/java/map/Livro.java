package main.java.map;

import java.util.Comparator;
import java.util.Map;

public class Livro implements Comparable<Livro> {

    private String título;
    private String autor;
    private double preco;

    public Livro(String título, String autor, double preco) {
        this.título = título;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "título='" + título + '\'' +
                ", autor='" + autor + '\'' +
                ", preço='" + preco + '\'' +
                '}';
    }

    @Override
    public int compareTo(Livro o) {
        return Double.compare(preco, o.getPreco());
    }
}



