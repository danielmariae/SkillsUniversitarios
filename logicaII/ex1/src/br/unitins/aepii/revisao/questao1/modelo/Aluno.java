package br.unitins.aepii.revisao.questao1.modelo;

public class Aluno {
    public String nome;
    public String disciplina;
    public Telefone telefone;
    public double notaA1;
    public double notaA2;
    public double media;
    public String statusDisciplina;

    public void calcularMedia(){
        media = ((notaA1+notaA2)/2);
    }

    public void aprovado(){
        if(media < 6)
            statusDisciplina = "Reprovado";
        else
            statusDisciplina = "Aprovado";
    }
}
