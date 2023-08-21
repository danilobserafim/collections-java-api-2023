/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.java.api.pkg2023.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danilo
 */
public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                valorTotalEstoque = p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    
    public Produto obterProdutoMailCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for(Produto p: estoqueProdutoMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
//    public static void main(String[] args) {
//        EstoqueProdutos estoqueProduto = new EstoqueProdutos();
//        estoqueProduto.adicionarProduto(1, "Feijão", 100, 8.5);
//        estoqueProduto.adicionarProduto(2, "Arroz", 100, 5.5);
//        estoqueProduto.adicionarProduto(3, "Macarrão", 500, 4);
//        estoqueProduto.adicionarProduto(4, "leite", 50, 12.5);
//        estoqueProduto.exibirProdutos();
//        System.out.println("O valor total do estoque é: "+estoqueProduto.calcularValorTotalEstoque());
//        System.out.println("O produto mais caro é o produto: " + estoqueProduto.obterProdutoMailCaro());
//        
//    }
}
