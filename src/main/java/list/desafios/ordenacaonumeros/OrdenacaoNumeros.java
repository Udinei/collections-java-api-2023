package main.java.list.desafios.ordenacaonumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private  List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numListAsc = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()) {
            Collections.sort(numListAsc);
            return numListAsc;
        }else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numListAsc = new ArrayList<>(numerosList);

        if(!numerosList.isEmpty()) {
            Collections.sort(numListAsc, Collections.reverseOrder());
            return numListAsc;
        }else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }



    public static void main(String[] args) {
        OrdenacaoNumeros numeros1 = new OrdenacaoNumeros();
        numeros1.adicionarNumero(5);
        numeros1.adicionarNumero(2);
        numeros1.adicionarNumero(8);
        numeros1.adicionarNumero(1);
        numeros1.adicionarNumero(3);
        numeros1.adicionarNumero(4);

        System.out.println(numeros1.ordenarAscendente());
        System.out.println(numeros1.ordenarDescendente());

    }
}
