    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.java.api.pkg2023.List.Pesquisa;

/**
 *
 * @author danilo
 */
public class Livro {
    private String titulo;
    private String author;
    private int anoPublicacao;

    public Livro(String titulo, String author, int anoPublicacao) {
        this.titulo = titulo;
        this.author = author;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", author=" + author + ", anoPublicacao=" + anoPublicacao + '}';
    }
        
}
