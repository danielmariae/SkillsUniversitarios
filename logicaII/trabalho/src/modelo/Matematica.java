package modelo;

/*
1) Desenvolva uma classe chamada Matemática e implemente as operações (somar,
subtrair, dividir e multiplicar). Utilizando polimorfismo (Sobrecarga), implemente 3
métodos para cada operação matemática. Construa uma classe principal e faça os
testes de todos os métodos.

2) Selecione uma das operações do exercício anterior (exceto o somar) e implemente
uma nova classe que, através do mecanismo de conversão cast, permita a
execução de métodos do mesmo nome (Sobrecarga) com diferentes tipos de
parâmetros. O retorno do método deve ser int. Os métodos devem realizar a
operação apenas sobre os valores inteiros. Deve-se utilizar os tipos: int, float,
double, long, Float, e Double nos parâmetros. Implemente uma classe principal e
faça os teste de todos os métodos. Exemplos:
Assinatura: int nomedometodo(int, float);
Assinatura: int nomedometodo(float, double);
Assinatura: int nomedometodo(int, Double);
Obs.: Pesquisem na internet como fazer a conversão de tipos por referência (Float,
Double, Integer, etc) para tipos primitivos (float, double, int, etc).
 */
public class Matematica {
    public double soma(int a, int b){
        return (double) a + (double) b;
    }
    public double soma(double a, int b){
        return a + (double) b;
    }
    public double soma(int a, double b){
        return (double) a + b;
    }
    public double subtracao(double a, double b){
        return a - b;
    }
    public double subtracao(int a, int b){
        return (double) a - (double) b;
    }
    public double subtracao(double a, int b){
        return a - (double) b;
    }
    public double subtracao(int a, double b){
        return (double) a - b;
    }
    public double multiplicacao(double a, double b){
        return a * b;
    }
    public double multiplicacao(int a, int b){
        return (double) a * (double) b;
    }
    public double multiplicacao(double a, int b){
        return a - (double) b;
    }
    public double multiplicacao(int a, double b){
        return (double) a / b;
    }
    public double divisao(double a, double b){
        return a / b;
    }
    public double divisao(int a, int b){
        return (double) a / (double) b;
    }
    public double divisao(double a, int b){
        return a / (double) b;
    }
    public double divisao(int a, double b){
        return (double) a / b;
    }
}
