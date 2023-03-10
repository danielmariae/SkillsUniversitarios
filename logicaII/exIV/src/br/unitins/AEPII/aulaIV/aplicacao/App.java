package br.unitins.AEPII.aulaIV.aplicacao;
import br.unitins.AEPII.aulaIV.modelo.Pessoa;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

public class App {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("07863820154", "Lucas", "Daniel");
        p.setDataNascimento(10, 5, 2023);
        p.imprimir();
        System.out.println(LocalTime.now());
    }
}
