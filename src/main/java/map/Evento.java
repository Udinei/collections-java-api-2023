package main.java.map;

import java.util.Objects;

public class Evento {

    private String nomeEvento;

    private String nomeAtracao;


    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    public void setNomeAtracao(String nomeAtracao) {
        this.nomeAtracao = nomeAtracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nomeEvento='" + nomeEvento + '\'' +
                ", nomeAtracao='" + nomeAtracao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evento evento)) return false;
        return Objects.equals(nomeEvento, evento.nomeEvento) && Objects.equals(nomeAtracao, evento.nomeAtracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeEvento, nomeAtracao);
    }
}
