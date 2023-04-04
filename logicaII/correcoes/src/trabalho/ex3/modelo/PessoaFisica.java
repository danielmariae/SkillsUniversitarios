package ex3.modelo;

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
    public void imprimir(){
        super.imprimir();
        System.out.println("CPF: "+cpf);
    }
}
