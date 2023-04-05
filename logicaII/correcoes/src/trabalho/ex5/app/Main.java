package trabalho.ex5.app;
import trabalho.ex5.modelo.Pessoa;
import trabalho.ex5.modelo.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica teste = new PessoaFisica();
        PessoaFisica teste2 = new PessoaFisica(1032, "João Ceboso", "joaoceboso@gmail.com", "07863820154");

        teste.imprimir();
        System.out.println();
        teste2.imprimir();

        Pessoa p1 = new Pessoa();
        p1.setId(3);
        p1.setNome("Leandra");
        p1.setEmail("leandrac@unitins.br");

        Pessoa p2 = new Pessoa();
        p2.setId(4);

        System.out.println(p1.equals(p2));;
    }
    public static void imprimir(Pessoa pessoa){
        pessoa.imprimir();
    }
}
