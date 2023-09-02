package main.java.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();

    }
    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome,matricula, media));
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public void removerAluno(long matricula){
        if(!alunoSet.isEmpty()) {
            for (Aluno a: alunoSet) {
                if (a.getMatrícula() == matricula) {
                    alunoSet.remove(a);
                    break;
                }
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        // reordena por ordem alfabetica de nome, conforme Comparable
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        // aplica o comparator ao fazer o addAll, organiza por nota
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public static void main(String[] args) {
        GerenciadorAlunos ga = new GerenciadorAlunos();

        ga.adicionarAluno("Udinei", 1L, 9.8);
        ga.adicionarAluno("Celia", 2L, 9.0);
        ga.adicionarAluno("Beatriz", 3L, 9.1);
        ga.adicionarAluno("Alex", 1L, 9.2);
        ga.adicionarAluno("Alex", 4L, 9.2);


        ga.removerAluno(4l);
        ga.exibirAlunos();

        System.out.println(ga.exibirAlunosPorNome());
        System.out.println(ga.exibirAlunosPorNota());
    }

}
