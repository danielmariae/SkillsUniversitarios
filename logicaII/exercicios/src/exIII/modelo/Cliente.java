package exIII.modelo;

@SuppressWarnings("unused")
public class Cliente {
    private Integer escolha;
    private Double qntDesejada;
    private Character formaPagamento;
    private Double valorInserido;
    private Double troco;

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

    public Double getValorInserido() {
        return valorInserido;
    }

    public void setValorInserido(Double valorInserido) {
        this.valorInserido = valorInserido;
    }

    public void adicionarDinheiro(Double valorInserido, Double valorAMais) {
        this.valorInserido = valorInserido + valorAMais;
    }

    public Double getTroco() {
        return troco;
    }

    public void setTroco(Double troco) {
        this.troco = troco;
    }

    public Character getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(char formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
