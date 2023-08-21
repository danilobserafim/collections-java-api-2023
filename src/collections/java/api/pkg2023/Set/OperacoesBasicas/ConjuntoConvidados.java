/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.java.api.pkg2023.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author danilo
 */
public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvite() {
        return convidadoSet.size();
    }

    /*public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvite() + " convidados(s) dentro do lista de convidados");
        
        conjuntoConvidados.adicionarConvidado("Danilo", 1);
        conjuntoConvidados.adicionarConvidado("Wendel", 2);
        conjuntoConvidados.adicionarConvidado("Luis", 3);
        conjuntoConvidados.adicionarConvidado("Luis", 3);
        
        System.out.println("Existem " + conjuntoConvidados.contarConvite() + " convidados(s) dentro do lista do convidados");
    }*/
}
