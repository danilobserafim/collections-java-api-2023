/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.java.api.pkg2023.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author danilo
 */
public class CadastroProduto {

    public Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int cod, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto produtosCadastrados = new CadastroProduto();
        produtosCadastrados.adicionarProduto("arroz", 0, 5, 100);
        produtosCadastrados.adicionarProduto("feijão", 1, 6, 99);
        produtosCadastrados.adicionarProduto("macarrão", 2, 7, 98);
        produtosCadastrados.adicionarProduto("Carne", 4, 8, 97);
        System.out.println(produtosCadastrados.exibirProdutosPorNome());
        System.out.println(produtosCadastrados.exibirProdutosPorPreco());

    }
}
