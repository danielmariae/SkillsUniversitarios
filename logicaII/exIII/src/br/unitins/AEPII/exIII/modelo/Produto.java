package br.unitins.AEPII.exIII.modelo;

public class Produto {
    private String nome;
    private Double qntdDisponivel;
    private Double preco;

    public Produto(String nome, Double qntdDisponivel, Double preco) {
        this.nome = nome;
        this.qntdDisponivel = qntdDisponivel;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getQntdDisponivel() {
        return qntdDisponivel;
    }
    public void setQntdDisponivel(Double qntdDisponivel) {
        this.qntdDisponivel = qntdDisponivel;
    }
    public void venderEstoque(Double qntdEscolhida){
        this.qntdDisponivel -= qntdEscolhida;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
