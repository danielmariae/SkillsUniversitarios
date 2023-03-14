package br.unitins.aepII.aulaV.exII.app;

import br.unitins.aepII.aulaV.exII.modelo.Funcionario;

public class Principal {
    public static void main(String[] args) {
        Funcionario alex = new Funcionario("Alex");
        Funcionario janio = new Funcionario("Janio");
        Funcionario augusto = new Funcionario("Augusto");

        alex.setChefeImediato(augusto);
        janio.setChefeImediato(augusto);

        alex.printFuncionario();
        janio.printFuncionario();
        augusto.printFuncionario();
    }
}
