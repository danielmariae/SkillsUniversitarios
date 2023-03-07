package br.unitins.AEPII.exIII.modelo;

public class Cliente {
    private Integer escolha;
    private Double qntDesejada;

    public Cliente(Integer escolha, Double qntDesejada) {
        this.escolha = escolha;
        this.qntDesejada = qntDesejada;
    }

    public Integer getEscolha() {
        return escolha;
    }
    public void setEscolha(Integer escolha) {
        this.escolha = escolha;
    }
    public Double getQntDesejada() {
        return qntDesejada;
    }
    public void setQntDesejada(Double qntDesejada) {
        this.qntDesejada = qntDesejada;
    }
}
