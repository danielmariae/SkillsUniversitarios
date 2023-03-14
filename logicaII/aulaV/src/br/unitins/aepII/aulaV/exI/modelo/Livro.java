package br.unitins.aepII.aulaV.exI.modelo;

public class Livro {
    private Integer id;
    private String titulo;
    private Integer anoLancamento;
    private String isbn;
    private Autor autor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void printAll(){
        System.out.println("ID: "+this.id);
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Ano de Lançamento: "+this.anoLancamento);
        System.out.println("ISBN: "+this.isbn);
        System.out.println("Autor: "+this.autor.getNome());
    }
}
