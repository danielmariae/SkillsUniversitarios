package br.unitins.AEPII.exIII.aplicacao;
import br.unitins.AEPII.exIII.modelo.*;
import java.util.Scanner;
import static br.unitins.AEPII.exIII.modelo.MaquinaRefrigerante.criarLista;

public class App {

    static Scanner scApp = new Scanner(System.in);


    public static void main(String[] args) {
        Produto[] listaRefris = MaquinaRefrigerante.criarLista();
        MaquinaRefrigerante maquinaDaCoca;
        maquinaDaCoca = new MaquinaRefrigerante(0.00, listaRefris);
        char executador;
        do{
            Integer ch = menuEscolha();
            Double qntEsc = menuQuantidade(maquinaDaCoca.getProdutoEspecifico(ch));
            Cliente cliente = new Cliente(ch, qntEsc);
            MaquinaRefrigerante.atualizarEstoque(maquinaDaCoca.getProdutoEspecifico(cliente.getEscolha()), cliente.getQntDesejada());
            menuDinheiro(maquinaDaCoca, cliente, maquinaDaCoca.getProdutoEspecifico(cliente.getEscolha()));

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

    public static void menuDinheiro(MaquinaRefrigerante maquina, Cliente cliente, Produto produto){
        maquina.setValorTotal(MaquinaRefrigerante.calcularPreco(produto, cliente.getQntDesejada()));
        System.out.println("Tudo custou: R$"+maquina.getValorTotal());
        formaPagamento(cliente, maquina);
    }

    public static void formaPagamento(Cliente cliente, MaquinaRefrigerante maquina) {
        System.out.print("Voce deseja pagar em dinheiro ou cartao/PIX?\nDigite 'd' para dinheiro e 'c' para cartao/PIX: ");
        cliente.setFormaPagamento(scApp.next().charAt(0));

        if(cliente.getFormaPagamento() == 'd')
            pagamentoDinheiro(cliente, maquina);
        else
            pagamentoPIXOuCartao(cliente);
        System.out.println("-- Pagamento feito com sucesso! --");
    }

    public static void pagamentoPIXOuCartao(Cliente cliente){
        System.out.print("Digite 'p' para PIX ou 'c' para Cartões: ");
        cliente.setFormaPagamento(scApp.next().charAt(0));
        if (cliente.getFormaPagamento() == 'p')
            System.out.println("Leia o QR Code para pagar via PIX.");
        else
            System.out.println("Siga os procedimentos da Máquina de cartão.");
    }

    public static void pagamentoDinheiro(Cliente cliente, MaquinaRefrigerante maquina){
        System.out.print("Insira o dinheiro na máquina: ");
        cliente.setValorInserido(scApp.nextDouble());
        while (cliente.getValorInserido() < maquina.getValorTotal()){
            System.out.println("Dinheiro insuficiente! Insira mais dinheiro para continuar-mos, por gentileza.");
            cliente.adicionarDinheiro(cliente.getValorInserido(), scApp.nextDouble());
        }
        cliente.setTroco(MaquinaRefrigerante.calcularTroco(cliente.getValorInserido(), maquina.getValorTotal()));
        if (cliente.getTroco()>0){
            System.out.println("Seu troco foi de: R$"+cliente.getTroco());
            System.out.println("Retire o troco da máquina.");
        }
    }
}
