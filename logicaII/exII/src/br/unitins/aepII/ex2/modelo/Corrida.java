package br.unitins.aepII.ex2.modelo;

public class Corrida {
    public static void corridaCarros(Carros[] carrosCorrida){
        for (int t = 0; t < 20; t++) {
            if(t == 6 || t == 11 || t == 15){
                for (Carros carros : carrosCorrida) {
                    if(carros != null)
                        carros.velocidade = frear(carros.velocidade);
                }
            }
            else{
                for (Carros carros : carrosCorrida) {
                    if(carros != null)
                        carros.velocidade = acelerar(carros.velocidade, carros.cilindrada, carros.peso);
                }
            }
        }

        int posVencedor=-1;
        for (int i = 0; i < carrosCorrida.length; i++) {
            if(carrosCorrida[i] != null)
                posVencedor = verificarVencedor(carrosCorrida[i].velocidade, i);
        }

        vencedorCarros(carrosCorrida[posVencedor]);
    }

    public static void corridaMotos(Motos[] motosCorrida){
        for (int t = 0; t < 20; t++) {
            if(t == 6 || t == 11 || t == 15){
                for (Motos motos : motosCorrida) {
                    if(motos != null)
                        motos.velocidade = frear(motos.velocidade);
                }
            }
            else{
                for (Motos motos : motosCorrida) {
                    if(motos != null)
                        motos.velocidade = acelerar(motos.velocidade, motos.cilindrada, motos.peso);
                }
            }
        }
        int posVencedor=-1;
        for (int i = 0; i < motosCorrida.length; i++) {
            if(motosCorrida[i] != null)
                posVencedor = verificarVencedor(motosCorrida[i].velocidade, i);
        }

        vencedorMotos(motosCorrida[posVencedor]);

    }

    public static double acelerar(Double velocidade, Integer cilindrada, Double peso){
        int redutorPeso = 0;
        for (int i = 0; i < peso; i++) {
            if (peso % 300 == 0)
                redutorPeso++;
        } // verifica quanto vai ser reduzido na velocidade devido ao peso

        velocidade = (velocidade + 5);
        velocidade += ((velocidade*(0.15*cilindrada)) - redutorPeso);
        return velocidade;
    }

    public static double frear(Double velocidade){
        velocidade *= 0.75;
        return velocidade;
    }

    public static int verificarVencedor(double velocidade, int pos){
        double velocidadeMaior = 0;
        int posicaoMaisRapido = 0;

        if (velocidade > velocidadeMaior){
            velocidadeMaior = velocidade;
            posicaoMaisRapido = pos;
        }

        return posicaoMaisRapido;
    }

    public static void vencedorCarros(Carros carroVencedor){
        System.out.println("Parabéns ao dono do carro "+carroVencedor.marca+" "+carroVencedor.modelo+"!");
        System.out.println("Você ganhou essa corrida. Continue a se dedicar e até a próxima!");
    }

    public static void vencedorMotos(Motos motoVencedora){
        System.out.println("Parabéns ao dono da moto "+motoVencedora.marca+" "+motoVencedora.modelo+", do ano "+motoVencedora.ano+"!");
        System.out.println("Você ganhou essa corrida. Continue a se dedicar e até a próxima!");
    }
}
