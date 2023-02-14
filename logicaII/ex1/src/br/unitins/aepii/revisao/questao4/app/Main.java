package br.unitins.aepii.revisao.questao4.app;
import br.unitins.aepii.revisao.questao1.modelo.Aluno;
import java.util.Scanner;

public class Main {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[10];
        char menu;

        System.out.println("Olá, usuário! Este é o sistema de cadastramento de alunos 2023.");
        do{
            System.out.println("Digite 'c' para cadastrar alunos;\n'i' para imprimir todos os dados dos alunos cadastrados.");
            menu = leitor.next().charAt(0);

            switch (menu) {
                case 'c' -> {
                    for (int i = 0; i < alunos.length; i++) {
                        if(alunos[i] == null){
                            System.out.println("Escreva os seguintes dados para o aluno " + (i + 1) + ": ");
                            System.out.println("Nome;\nDisciplina;\nNota da A1;\nNota da A2");

                            alunos[i] = lerAluno();

                            System.out.println("Deseja continuar cadastrando alunos? Digite 's' para SIM e 'n' para NÃO.");
                            char seletor = leitor.next().charAt(0);

                            if (seletor == 'n') {
                                i = 10;
                            }
                        }
                    }

                }
                case 'i' -> imprimir(alunos);
            }
            System.out.println("Deseja continuar executando o programa?\nDigite 's' para SIM e 'n' para NÃO.");
            menu = leitor.next().charAt(0);
        }while(menu!='n');
    }

    public static Aluno lerAluno(){
        Aluno novoAluno = new Aluno();
        novoAluno.nome = leitor.next();
        novoAluno.disciplina = leitor.next();
        novoAluno.notaA1 = leitor.nextDouble();
        novoAluno.notaA2 = leitor.nextDouble();
        novoAluno.calcularMedia();
        novoAluno.aprovado();
        return novoAluno;
    }

    public static void imprimir(Aluno[] vetAluno){
        for (Aluno aluno : vetAluno) {
            if (aluno != null) {
                System.out.println("Nome do aluno: "+aluno.nome);
                System.out.println("Média: "+aluno.media);
                System.out.println("Status: "+aluno.statusDisciplina);
            }
        }
    }
}