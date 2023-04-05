package exII.modelo;
import java.util.Scanner;

public class Carros {
    String marca;
    String modelo;
    Integer ano;
    Integer cilindrada;
    Double peso;
    Double velocidade;

    public static void cadastrarCarros(Carros[] listaCadastro){
        Scanner leitorCarros = new Scanner(System.in);
        System.out.println("Iniciando sistema de cadastro para carros...");
        for (int i = 0; i < listaCadastro.length; i++) {
            listaCadastro[i] = new Carros();
            System.out.println("Cadastrando carro na vaga "+(i+1)+ "");
            System.out.println("Digite os seguintes aspectos:");
            System.out.print("Marca do carro: ");
            listaCadastro[i].marca = leitorCarros.next();
            System.out.print("Modelo do carro: ");
            listaCadastro[i].modelo = leitorCarros.next();
            System.out.print("Ano do carro: ");
            listaCadastro[i].ano = leitorCarros.nextInt();
            System.out.print("Cilindrada do carro (em cm^3): ");
            listaCadastro[i].cilindrada = leitorCarros.nextInt();
            System.out.print("Peso do carro (em Kg): ");
            listaCadastro[i].peso = leitorCarros.nextDouble();
            listaCadastro[i].velocidade = 0.0;

            if (i<3){
                System.out.println("Deseja continuar cadastrando motos? Digtite 's' para sim e 'n' para não.");
                char escolha = leitorCarros.next().charAt(0);

                if (escolha == 'n')
                    i=listaCadastro.length;

            }else
                i=listaCadastro.length;

        }
    }

    public static void imprimirCarros(Carros[] lista){
        System.out.println("Imprimindo todos os carros....");
        for (Carros carros : lista) {
            if(carros != null){
                System.out.println("Marca do carro: " + carros.marca);
                System.out.println("Modelo do carro: " + carros.modelo);
                System.out.println("Ano do carro: " + carros.ano);
                System.out.println("Cilindrada do carro (em cm^3): " + carros.cilindrada);
                System.out.println("Peso do carro (em Kg): " + carros.peso);
            }
        }
    }
}

