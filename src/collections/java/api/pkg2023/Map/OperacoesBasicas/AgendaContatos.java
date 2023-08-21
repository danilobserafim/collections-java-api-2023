/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.java.api.pkg2023.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danilo
 */
public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
//    public static void main(String[] args) {
//        AgendaContatos agendaContato = new AgendaContatos();
//        agendaContato.adicionarContato("Danilo", 88888888);
//        agendaContato.adicionarContato("Danilo", 444444444);
//        agendaContato.adicionarContato("Paulo", 77777777);
//        agendaContato.adicionarContato("Wendel", 66666666);
//        agendaContato.adicionarContato("Renato", 55555555);
//        agendaContato.removerContato("Wendel");
//        agendaContato.exibirContatos();
//        System.out.println("O numero é: " + agendaContato.pesquisarPorNome("Danilo"));
//    }
}
