package collections.java.api.pkg2023.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class catalogoLivros {

    public List<Livro> listaLivros;

    public catalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String autor, String titulo, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> listaPorAutor;
        listaPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getautor().equalsIgnoreCase(autor)) {
                    listaPorAutor.add(l);
                }
            }
        }
        return listaPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicio, int anoFinal) {
        List<Livro> listaPorAnoPublicacao;
        listaPorAnoPublicacao = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFinal) {
                    listaPorAnoPublicacao.add(l);
                }
            }
        }
        return listaPorAnoPublicacao;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!listaLivros.isEmpty()){
            for(Livro l: listaLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    /*public static void main(String[] args) {
            catalogoLivros catalogo = new catalogoLivros();
            catalogo.adicionarLivro("Danilo", "Um livro pra mudar de vida", 2023);
            catalogo.adicionarLivro("Geni", "Um livro pra mudar de vida", 2020);
            catalogo.adicionarLivro("Danilo", "Um livro sobre a juventude", 2021);
            catalogo.adicionarLivro("Dai", "Um livro pra mudar de vida", 2023);
            catalogo.adicionarLivro("Danilo", "Um livro pra mudar de vida", 2022);
        List<Livro> livrosPorAutor = catalogo.pesquisaPorAutor("Danilo");
        for(Livro l: livrosPorAutor){
        System.out.println(l.getautor());
        }
         
        /*List<Livro> pesquisaPorIntervaloAnos = catalogo.pesquisaPorIntervaloAnos(2020, 2022);
        for(Livro l: pesquisaPorIntervaloAnos){
            System.out.println(l.getAnoPublicacao());
        }
    }
        */
}
