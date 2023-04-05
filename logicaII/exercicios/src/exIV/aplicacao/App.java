package exIV.aplicacao;

import exIV.modelo.Pessoa;

import java.time.LocalTime;

public class App {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("07863820154", "Lucas", "Daniel");
        p.setDataNascimento(10, 5, 2023);
        p.imprimir();
        System.out.println(LocalTime.now());
    }
}
