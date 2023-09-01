package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
       convidadoSet.add(new Convidado(nome, codigoConvite));
    }


    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadosHaRemover = null;

        // se a lista não estiver vazia
        if(!convidadoSet.isEmpty()){
            for(Convidado c: convidadoSet){
                if(c.getCodigoConvite() == codigoConvite) {
                    convidadosHaRemover = c;
                    break;
                }
            }
        }

        convidadoSet.remove(convidadosHaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }


    public static void main(String[] args) {
        ConjuntoConvidados cc = new ConjuntoConvidados();

        cc.adicionarConvidado("Convidado 1", 123);
        cc.adicionarConvidado("Convidado 2", 321);
        cc.adicionarConvidado("Convidado 2", 321);
        cc.adicionarConvidado("Convidado 4", 456);
        cc.adicionarConvidado("Convidado 4", 456);

        cc.exibirConvidados();
        System.out.println(cc.contarConvidados());

        cc.removerConvidadoPorCodigoConvite(321);

        cc.exibirConvidados();
        System.out.println(cc.contarConvidados());
    }
}
