package br.unitins.aepII.aulaV.exI.modelo;

import java.time.LocalDate;

public class Autor {
    private Integer id;
    private String nome;
    private LocalDate dataNascimento;
    private String sexo;
    private String pais;

    public Integer getId() {
        return id;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void printAll(){
        System.out.println("ID: "+this.id);
        System.out.println("Nome: "+this.nome);
        System.out.println("País: "+this.pais);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Data de Nascimento: "+this.dataNascimento);
    }
}