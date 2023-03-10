package br.unitins.AEPII.aulaIV.modelo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pessoa {
    private String cpf;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public void lerDados2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        setNome(sc.next());
        System.out.print("Informe o sobrenome: ");
        setSobrenome(sc.next());
        System.out.print("Informe o CPF: ");
        setCpf(sc.next());
        System.out.print("Informe o CPF: ");
        setDataNascimento(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    public Pessoa(String cpf, String nome, String sobrenome) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public void setDataNascimento(int dia, int mes, int ano) {
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getNomeCompleto(){
        return nome+" "+sobrenome;
    }

    public void imprimir(){
        System.out.println(getCpf());
        System.out.println(getNomeCompleto());
        System.out.println(getDataNascimento());
    }
}
