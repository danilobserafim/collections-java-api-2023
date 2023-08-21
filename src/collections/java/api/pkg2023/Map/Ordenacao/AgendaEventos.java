/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.java.api.pkg2023.Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;
import java.util.TreeMap;

/**
 *
 * @author danilo
 */
public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoThreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoThreeMap);
    }
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
         Map<LocalDate, Evento> eventorTreeMap = new TreeMap<>(eventosMap);
         for(Map.Entry<LocalDate, Evento> entry: eventorTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento acontece dia: " + proximaData + " e é o " + proximoEvento);
                break;
            }
        }
        
        
        
    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, 8, 25), "Forró", "Brucelose");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 24), "Rock", "CPM22");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 23), "Reggae", "Ponto de equilibrio");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 3, 22), "Axé", "È o tchan");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
