package main.java.map;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private  Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        // TreeMap ordenara eventosMap em ordem crescente de data porquqe LocalDate
        // implementa a interface ChronoLocalDate
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

   public void obterProximoEvento(){
        // retorna todos as chaves do map
        // Set<LocalDate> dataSet = eventosMap.keySet();
        // retorna todos os valores do map
        // Collection<Evento> values = eventosMap.values();

       LocalDate dataatual = LocalDate.now();
       LocalDate proximaData = null;
       Evento proximoEvento = null;

       Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
       // retorna um Set com a chave e valor
       // Map.Entry<LocalDate, Evento> - pode ser substituido apenas por: var
       // ex: for(var entry: eventosMap.entrySet())
       for(Map.Entry<LocalDate, Evento> entry :eventosTreeMap.entrySet()){
               if(entry.getKey().isEqual(dataatual) || entry.getKey().isAfter(dataatual)){
                   proximaData = entry.getKey();
                   proximoEvento = entry.getValue();
                   System.out.println("O prox. evento: " + proximoEvento + " sera na data " + proximaData);
                   break;
               }
       }

   }
    public static void main(String[] args) {
        AgendaEventos ae = new AgendaEventos();

        ae.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 15 ), "Evento 1 ", "Atracao 1");
        ae.adicionarEvento(LocalDate.of(2025, 9, 9 ), "Evento 2 ", "Atracao 2");
        ae.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 18 ), "Evento 3 ", "Atracao 3");
        ae.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 02 ), "Evento 4 ", "Atracao 4");

        ae.exibirAgenda();

        ae.obterProximoEvento();
    }
}
