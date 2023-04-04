package ex4.modelo;

import ex4.modelo.Pessoa;

public class PessoaFisica extends Pessoa {
    private String cpf;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public PessoaFisica(Integer id, String nome, String email, String cpf) {
        super(id, nome, email);
        this.cpf = cpf;
    }
    public PessoaFisica() {
    }
}
