package modelo;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private String telefoneFixo;

    public PessoaJuridica(Integer id, String nome, String email, String cnpj, String inscricaoEstadual, String telefoneFixo) {
        super();
        setNome(nome);
        setId(id);
        setEmail(email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.telefoneFixo = telefoneFixo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public void imprimir(){
        System.out.println(getId());
        System.out.println(getNome());
        System.out.println(getEmail());
        System.out.println(cnpj);
        System.out.println(inscricaoEstadual);
        System.out.println(telefoneFixo);
    }
}
