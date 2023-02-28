package br.unitins.aepII.ex2.aplicacao;
import br.unitins.aepII.ex2.modelo.Carros;
import br.unitins.aepII.ex2.modelo.Motos;
import br.unitins.aepII.ex2.modelo.Corrida;
import java.util.Scanner;

public class Main {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        Carros[] carros = new Carros[4];
        Motos[] motos = new Motos[4];
        char encerrar;
        do {
            System.out.println("Digite 1 para cadastrar veículos;\n2 para ver as características dos veículos cadastrados;\n3 para iniciar a corrida.");
            int op = leitor.nextInt();
            switch (op) {
                case 1 -> cadastro(carros, motos);
                case 2 -> impressora(carros, motos);
                case 3 -> corrida(carros, motos);
                default -> System.out.println();
            }
            System.out.println("Deseja encerrar o programa? Digite 's' para sim e 'n' para não.");
            encerrar = leitor.next().charAt(0);
        }while(encerrar != 's');
        System.out.println("Para encerrar a aplicação, serão impressos todos os veículos existentes.");
        impressora(carros, motos);
    }

    public static void corrida(Carros[] carrosLista, Motos[] motosLista){
        Corrida.corridaCarros(carrosLista);
        Corrida.corridaMotos(motosLista);
    }

    public static void cadastro(Carros[] carrosLista, Motos[] motosLista){
        char escolher;
        do{
            System.out.print("Digite 'c' para cadastrar carros e 'm' para cadastrar motos: ");
            escolher = leitor.next().charAt(0);
            if(escolher == 'c'){
                Carros.cadastrarCarros(carrosLista);
            }
            else if(escolher == 'm'){
                Motos.cadastrarMotos(motosLista);
            }else
                System.out.println("Erro ao selecionar opção. Selecione novamente!");
        }while(escolher != 'c' && escolher != 'm');
    }

    public static void impressora(Carros[] carrosLista, Motos[] motosLista){
        Carros.imprimirCarros(carrosLista);
        Motos.imprimirMotos(motosLista);
    }
}
