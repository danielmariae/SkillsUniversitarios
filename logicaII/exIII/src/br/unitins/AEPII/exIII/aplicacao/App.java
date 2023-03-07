package br.unitins.AEPII.exIII.aplicacao;
import br.unitins.AEPII.exIII.modelo.MaquinaRefrigerante;
import br.unitins.AEPII.exIII.modelo.Produto;
import java.util.Scanner;

public class App {

    static Scanner scApp = new Scanner(System.in);


    public static void main(String[] args) {
        Produto[] listaLocal = MaquinaRefrigerante.criarLista();
        char executador;
        do{
            Integer ch = menuEscolha();
            Double qnt = menuQuantidade(listaLocal[ch]);
            MaquinaRefrigerante.atualizarEstoque(listaLocal[ch], qnt);
            menuDinheiro(listaLocal[ch], qnt);

            System.out.print("Deseja comprar outro produto?\nDigite 's' para SIM e 'n' para NÃO: ");
            executador = scApp.next().charAt(0);
        }while(executador == 's');
    }

    public static Integer menuEscolha(){
        System.out.println("-- OLÁ, SEJA BEM-VINDO A MÁQUINA DE REFRIGERANTES COCA-COLA --");
        System.out.println("\nEscolha entre as opções abaixo:");
        System.out.println("1: Coca-Cola 350mL;\n2: Coca-Cola 600mL;\n3: Coca-Cola 1L;\n4: Sprite 1L;");
        System.out.print("Digite o seu produto favorito: ");
        return (scApp.nextInt())-1;
    }

    public static Double menuQuantidade(Produto produto){
        System.out.print("Temos "+produto.getQntdDisponivel()+" disponvieis em caixa.\nDigite a quantidade desejada: ");
        return scApp.nextDouble();
    }

    public static void menuDinheiro(Produto produto, Double qntdEscolhida){
        double precoTotal = MaquinaRefrigerante.calcularPreco(produto, qntdEscolhida);
        System.out.println("Tudo custou: R$"+precoTotal);
        System.out.print("Voce deseja pagar em dinheiro ou cartao/PIX?\nDigite 'd' para dinheiro e 'c' para cartao/PIX: ");
        char escolha = scApp.next().charAt(0);
        if(escolha == 'd'){
            System.out.print("Insira o dinheiro na máquina: ");
            double dinheiroInserido = scApp.nextDouble();
            while (dinheiroInserido < precoTotal){
                System.out.println("Dinheiro insuficiente! Insira mais dinheiro para continuar-mos, por gentileza.");
                dinheiroInserido += scApp.nextDouble();
            }
            double troco = MaquinaRefrigerante.calcularTroco(dinheiroInserido, precoTotal);
            if (troco>0){
                System.out.println("Seu troco foi de: R$"+troco);
                System.out.println("Retire o troco da máquina.");

            }
        }else{
            System.out.print("Digite 'p' para PIX ou 'c' para Cartões: ");
            char formaPag = scApp.next().charAt(0);
            if (formaPag == 'p')
                System.out.println("Leia o QR Code para pagar via PIX.");
            else
                System.out.println("Siga os procedimentos da Máquina de cartão.");
        }
        System.out.println("-- Pagamento feito com sucesso! --");
    }
}
