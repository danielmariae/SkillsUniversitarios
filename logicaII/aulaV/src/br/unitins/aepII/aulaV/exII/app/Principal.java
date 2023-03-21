package br.unitins.aepII.aulaV.exII.app;
import br.unitins.aepII.aulaV.exII.modelo.Funcionario;

public class Principal {
    public static void main(String[] args) {
        Funcionario alex = new Funcionario("Alex");
        Funcionario janio = new Funcionario("Janio");
        Funcionario leandra = new Funcionario("Leandra");
        Funcionario augusto = new Funcionario("Augusto");

        alex.setChefeImediato(leandra);
        janio.setChefeImediato(leandra);
        leandra.setChefeImediato(augusto);

        alex.printFuncionario();
        janio.printFuncionario();
        leandra.printFuncionario();
        augusto.printFuncionario();
        System.out.println(alex.getChefeImediato().getChefeImediato().getNome());
    }
}
