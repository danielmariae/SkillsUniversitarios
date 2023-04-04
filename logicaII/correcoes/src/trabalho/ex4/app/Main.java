package ex4.app;

import ex4.modelo.Pessoa;
import ex4.modelo.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica teste = new PessoaFisica();
        PessoaFisica teste2 = new PessoaFisica(1032, "João Ceboso", "joaoceboso@gmail.com", "07863820154");

        teste.imprimir();
        System.out.println();
        teste2.imprimir();

        Pessoa p = new Pessoa();
        p.setId(3);
        p.setNome("Leandra");
        p.setEmail("leandrac@unitins.br");
        imprimir(p);
    }
    public static void imprimir(Pessoa pessoa){
        pessoa.imprimir();
    }
}
