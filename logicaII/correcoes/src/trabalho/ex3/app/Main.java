package ex3.app;

import ex3.modelo.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica teste = new PessoaFisica();
        PessoaFisica teste2 = new PessoaFisica(1032, "João Ceboso", "joaoceboso@gmail.com", "07863820154");

        teste.imprimir();
        System.out.println();
        teste2.imprimir();
    }
}
