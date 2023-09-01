package main.java.set;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private long matrícula;
    private double nota;

    public Aluno(String nome, long matrícula, double nota) {
        this.nome = nome;
        this.matrícula = matrícula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(long matrícula) {
        this.matrícula = matrícula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matrícula=" + matrícula +
                ", nota=" + nota +
                '}';
    }


    @Override
    public int compareTo(Aluno p) {
        return nome.compareToIgnoreCase(p.nome);
    }
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}