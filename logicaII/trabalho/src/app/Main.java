package app;
import modelo.*;
public class Main {
    public static void main(String[] args) {
        PessoaJuridica p1 = new PessoaJuridica(1252, "João Ceboso", "joaoceboso@gmail.com", "01172466002504", "01231", "6330265685" );
        imprimir(p1);
        PessoaFisica p2 = new PessoaFisica(2, "João Feio", "joaoceboso@gmail.com", "07863820154", "(63) 00000-0000");
        imprimir(p2);
        Pessoa p3 = new Pessoa(3939, "João Seco", "joaoceboso@gmail.com");
        imprimir(p3);
        System.out.println();
        String teste=p1.toString();
        System.out.println(teste+"\n\nP1 = P2?");
        p1.equals(p2);
    }

    public static void imprimir(Pessoa pessoa){ // Questão 03
        System.out.println(pessoa.getId());
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getEmail());
    }
}
