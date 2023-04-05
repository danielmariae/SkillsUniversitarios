package trabalho.ex5.modelo;

import java.util.Objects;

public class Pessoa {
    private Integer id;
    private String nome;
    private String email;

    public Pessoa() {
    }

    public Integer getId() {
        return id;
    }
    public Pessoa(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void imprimir(){
        System.out.println("ID: "+id);
        System.out.println("Nome: "+nome);
        System.out.println("Email: "+email);
        if(this instanceof PessoaFisica){
            System.out.println("Pessoa Fisica");
            System.out.println("CPF: "+((PessoaFisica)this).getCpf());
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return id.equals(pessoa.id) && Objects.equals(nome, pessoa.nome) && Objects.equals(email, pessoa.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email);
    }
}
