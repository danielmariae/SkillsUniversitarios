package br.unitins.aepii.revisao.questao2.app;
import java.util.Scanner;
import br.unitins.aepii.revisao.questao1.modelo.Aluno;
import br.unitins.aepii.revisao.questao1.modelo.Telefone;

public class Main {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {

        Aluno[] alunos = new Aluno[10];

        System.out.println("Olá, usuário! Este é o cadastramento de alunos 2023.");

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Escreva os seguintes dados para o aluno " + (i + 1) + ": ");
            System.out.println("Nome;\nCódigo DDD;\nNúmero de telefone;");

            alunos[i] = new Aluno();
            alunos[i].telefone = new Telefone();

            alunos[i].nome = leitor.next();
            alunos[i].telefone.codigoDeArea = leitor.nextInt();
            alunos[i].telefone.numero = leitor.nextInt();

            System.out.println("Deseja continuar cadastrando alunos? Digite 1 para SIM e 2 para NÃO.");
            int seletor = leitor.nextInt();

            if (seletor == 2) {
                break;
            }
        }

        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println("Nome do aluno: " + aluno.nome);
                System.out.println("Telefone: ("+aluno.telefone.codigoDeArea+") "+aluno.telefone.numero);
            }
        }
    }
}
