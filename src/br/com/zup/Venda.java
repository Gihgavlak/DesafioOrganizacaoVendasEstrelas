package br.com.zup;

public class Venda {
    private String produto;
    private double valorProduto;
    private Cliente cliente;
    private VendedorResponsavel vendedorResponsavel;
    private double valorSerPago;
    private String dataDeVencimento;

    public Venda() {

    }

    public Venda(String produto, double valorProduto ,Cliente cliente, VendedorResponsavel vendedorResponsavel, double valorSerPago, String dataDeVencimento) {
        this.produto = produto;
        this.valorProduto = valorProduto;
        this.cliente = cliente;
        this.vendedorResponsavel = vendedorResponsavel;
        this.valorSerPago = valorSerPago;
        this.dataDeVencimento = dataDeVencimento;


    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public VendedorResponsavel getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public void setVendedorResponsavel(VendedorResponsavel vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }

    public double getValorSerPago() {
        return valorSerPago;
    }

    public void setValorSerPago(double valorSerPago) {
        this.valorSerPago = valorSerPago;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Produto: "+produto);
        retorno.append("\n Valor do produto: "+valorProduto);
        retorno.append("\n Cliente: "+cliente);
        retorno.append("\n Vendedor Responsavel: "+vendedorResponsavel);
        retorno.append("\n Valor a ser pago: "+valorSerPago);
        retorno.append("\n Data do vencimento: " +dataDeVencimento);

        return retorno.toString();
    }

}
