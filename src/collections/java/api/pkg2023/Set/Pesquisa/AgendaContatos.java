/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.java.api.pkg2023.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author danilo
 */
public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<Contato>();
    }
    public void adicionarContato(String nome, int telefone){
        contatoSet.add(new Contato(nome, telefone));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> exibirPorNome(String nome){
        Set<Contato> contatosProNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosProNome.add(c);
            }
        }
        return contatosProNome;
    }
    public Contato atualizarContato(String nome, int telefone){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(telefone);
                contatoAtualizado = c;
                break;
            }
        }   
        return contatoAtualizado;
    }
    /*public static void main(String[] args) {
        AgendaContatos meusContatos = new AgendaContatos();
        meusContatos.adicionarContato("Danilo", 997064742);
        meusContatos.adicionarContato("Geni", 88888888);
        meusContatos.adicionarContato("Danilo Serafim", 88888881);
        meusContatos.adicionarContato("Geni da Silva", 88888882);
        meusContatos.exibirContatos();
        
        System.out.println("Contato alterado para: " + meusContatos.atualizarContato("Danilo", 55555555));
        System.out.println(meusContatos.exibirPorNome("Danilo"));

    }*/
}
//