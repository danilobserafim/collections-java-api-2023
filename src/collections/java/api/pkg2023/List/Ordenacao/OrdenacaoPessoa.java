/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.java.api.pkg2023.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author danilo
 */
public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;

    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
        
    }
    @Override
    public String toString() {
        return "ordenacaoPessoa{" + "pessoaList=" + pessoaList + '}';
    }

    /*public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();
        ordenacaoPessoas.adicionarPessoa("pessoa 1", 28, 1.60);
        ordenacaoPessoas.adicionarPessoa("pessoa 1", 29, 1.80);
        ordenacaoPessoas.adicionarPessoa("mais velho", 30, 1.65);
        ordenacaoPessoas.adicionarPessoa("pessoa 1", 27, 1.77);
        ordenacaoPessoas.adicionarPessoa("mais novo", 26, 1.88);
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }*/

}
