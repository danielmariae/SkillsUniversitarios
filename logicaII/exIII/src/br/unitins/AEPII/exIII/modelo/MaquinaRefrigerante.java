package br.unitins.AEPII.exIII.modelo;

public class MaquinaRefrigerante {
    private double valorTotal;
    private Produto[] produtosAVenda;

    public MaquinaRefrigerante(double valorTotal, Produto[] produtosAVenda) {
        this.valorTotal = valorTotal;
        this.produtosAVenda = produtosAVenda;
    }

    public static Produto[] criarLista(){
        Produto coca350 = new Produto("Coca-Cola 350mL", 10.0, 4.00);
        Produto coca600 = new Produto("Coca-Cola 600mL", 10.0, 5.25);
        Produto coca1L = new Produto("Coca-Cola 1L", 10.0, 6.30);
        Produto sprite1L = new Produto("Sprite 1L", 10.0, 5.80);

        return new Produto[]{coca350, coca600, coca1L, sprite1L};
    }

    public static void atualizarEstoque(Produto produto, Double qntdEscolhida){
        produto.venderEstoque(qntdEscolhida);
    }


    public static Double calcularPreco(Produto produto, Double qntdEscolhida){
        return (produto.getPreco())*qntdEscolhida;
    }

    public static Double calcularTroco(Double preco, Double aPagar){
        return preco-aPagar;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProdutoEspecifico(int i) {
        return produtosAVenda[i];
    }

    public void setProdutoEsepecifico(Produto produtoEscolhido, int i){
        this.produtosAVenda[i] = produtoEscolhido;
    }

    public Produto[] getLista(){
        return produtosAVenda;
    }

    public void setLista(Produto[] lista) {
        this.produtosAVenda = lista;
    }
}
