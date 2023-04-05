package aulaV.exII.modelo;

public class Funcionario {
    private String nome;
    private Funcionario chefeImediato;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario getChefeImediato() {
        return chefeImediato;
    }

    public void setChefeImediato(Funcionario chefeImediato) {
        this.chefeImediato = chefeImediato;
    }

    public void printFuncionario(){
        System.out.println("Nome: "+nome);
        if(getChefeImediato() != null)
            System.out.println("Chefe imediato: "+getChefeImediato().getNome());
        else
            System.out.println("Chefe imediato: Sem");
    }
}
