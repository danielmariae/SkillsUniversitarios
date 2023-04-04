package modelo;

public class PessoaFisica extends Pessoa {
    String cpf;
    String celular;

    public PessoaFisica(Integer id, String nome, String email, String cpf, String celular) {
        super();
        setId(id);
        setNome(nome);
        setEmail(email);
        this.cpf = cpf;
        this.celular = celular;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void imprimir(){
        System.out.println(getId());
        System.out.println(getNome());
        System.out.println(getEmail());
        System.out.println(cpf);
        System.out.println(celular);
    }
}
