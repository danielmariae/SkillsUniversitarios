package br.unitins.aepII.ex2.modelo;

import java.util.Scanner;

public class Motos {
    String marca;
    String modelo;
    Integer ano;
    Integer cilindrada;
    Double peso;
    Double velocidade;

    public static void cadastrarMotos(Motos[] listaCadastro){
        Scanner leitorMotos = new Scanner(System.in);
        System.out.println("Iniciando sistema de cadastro para carros...");
        for (int i = 0; i < listaCadastro.length; i++) {
            listaCadastro[i] = new Motos();
            System.out.println("Cadastrando moto na vaga "+(i+1)+".");
            System.out.println("Digite os seguintes aspectos:");
            System.out.print("Marca da moto: ");
            listaCadastro[i].marca = leitorMotos.next();
            System.out.print("Modelo da moto: ");
            listaCadastro[i].modelo = leitorMotos.next();
            System.out.print("Ano da moto: ");
            listaCadastro[i].ano = leitorMotos.nextInt();
            System.out.print("Cilindrada da moto (em cm^3): ");
            listaCadastro[i].cilindrada = leitorMotos.nextInt();
            System.out.print("Peso da moto (em Kg): ");
            listaCadastro[i].peso = leitorMotos.nextDouble();
            listaCadastro[i].velocidade = 0.0;

            System.out.println("Deseja continuar cadastrando motos? Digtite 's' para sim e 'n' para não.");
            char escolha = leitorMotos.next().charAt(0);

            if (escolha == 'n')
                i=listaCadastro.length;

        }
    }

    public static void imprimirMotos(Motos[] lista){
        System.out.println("Imprimindo todos os carros....");
        for (Motos motos : lista) {
            if (motos != null){
                System.out.println("Marca da moto: " + motos.marca);
                System.out.println("Modelo da moto: " + motos.modelo);
                System.out.println("Ano da moto: " + motos.ano);
                System.out.println("Cilindrada da moto (em cm^3): " + motos.cilindrada);
                System.out.println("Peso da moto (em Kg): " + motos.peso);
            }
        }
    }
}
