package main.java.map;



public class Livro{

    private String título;
    private String autor;
    private Double preco;

    public Livro(String título, String autor, Double preco) {
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

    public void setPreco(Double preco) {
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


}









