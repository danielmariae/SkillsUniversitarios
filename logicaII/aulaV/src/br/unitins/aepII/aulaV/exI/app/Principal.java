package br.unitins.aepII.aulaV.exI.app;

import br.unitins.aepII.aulaV.exI.modelo.Autor;
import br.unitins.aepII.aulaV.exI.modelo.Livro;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Autor autor = new Autor();
        Livro livro = new Livro();
        autor.setNome("João Feio");
        autor.setId(1);
        autor.setDataNascimento(LocalDate.of(2023, 3, 14));
        autor.setPais("Brasil");
        autor.setSexo("Masculino");

        livro.setId(1);
        livro.setAutor(autor);
        livro.setAnoLancamento(2002);
        livro.setIsbn("ASKASD3");
        livro.setTitulo("Senhor dos Anéis");

        autor.printAll();
        System.out.println("-------");
        livro.printAll();
    }
}
