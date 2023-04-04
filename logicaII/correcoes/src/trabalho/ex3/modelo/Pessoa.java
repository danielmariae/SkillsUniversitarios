package trabalho.ex3.modelo;

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
    }
}
