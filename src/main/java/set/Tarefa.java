package main.java.set;

import java.util.Objects;

public class Tarefa {

    private String descricao;

    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return isConcluida() == tarefa.isConcluida() && Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao(), isConcluida());
    }

    @Override
    public String toString() {
        return "{" + descricao +","+  concluida + '}';
    }
}
