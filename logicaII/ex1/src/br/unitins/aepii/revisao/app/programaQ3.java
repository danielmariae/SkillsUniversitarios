package br.unitins.aepii.revisao.app;
import java.util.Scanner;
import br.unitins.aepii.revisao.modelo.Aluno;
import br.unitins.aepii.revisao.modelo.Telefone;

public class programaQ3 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[10];
        int menu;

        System.out.println("Olá, usuário! Este é o sistema de cadastramento de alunos 2023.");
        do{
            System.out.println("Digite 1 para cadastrar alunos;\n2 para imprimir todos os dados dos alunos cadastrados.");
            menu = leitor.nextInt();

            switch (menu) {
                case 1 -> {
                    for (int i = 0; i < alunos.length; i++) {
                        System.out.println("Escreva os seguintes dados para o aluno " + (i + 1) + ": ");
                        System.out.println("Nome;\nCódigo DDD;\nNúmero de telefone;");

                        alunos[i] = lerAluno();

                        System.out.println("Deseja continuar cadastrando alunos? Digite 1 para SIM e 2 para NÃO.");
                        int seletor = leitor.nextInt();

                        if (seletor == 2) {
                            i = 10;
                        }
                    }
                }
                case 2 -> imprimir(alunos);
            }
            System.out.println("Deseja continuar executando o programa?\nDigite 1 para sim e 2 para não.");
            menu = leitor.nextInt();

        }while(menu!=2);
    }

    public static Aluno lerAluno(){

        Aluno novoAluno = new Aluno();
        novoAluno.nome = leitor.next();
        novoAluno.telefone = lerTelefone();
        return novoAluno;
    }

    public static Telefone lerTelefone(){
        Telefone novoTelefone = new Telefone();
        novoTelefone.codigoDeArea = leitor.nextInt();
        novoTelefone.numero = leitor.nextInt();
        return novoTelefone;
    }

    public static void imprimir(Aluno[] vetAluno){
        for (Aluno aluno : vetAluno) {
            if (aluno != null) {
                System.out.println("Nome do aluno: " + aluno.nome);
                System.out.println("Telefone: (" + aluno.telefone.codigoDeArea + ") " + aluno.telefone.numero);
            }
        }
    }
}
