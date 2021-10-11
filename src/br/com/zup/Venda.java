package br.com.zup;

public class Venda {
    private String produto;
    private Cliente cliente;
    private VendedorResponsavel vendedorResponsavel;
    private double valorSerPago;
    private String dataDeRegistro;

    public Venda() {

    }

    public Venda(String produto, Cliente cliente, VendedorResponsavel vendedorResponsavel, double valorSerPago, String dataDeVencimento) {
        this.produto = produto;
        this.cliente = cliente;
        this.vendedorResponsavel = vendedorResponsavel;
        this.valorSerPago = valorSerPago;
        this.dataDeRegistro = dataDeVencimento;


    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
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

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeregistro(String dataDeVencimento) {
        this.dataDeRegistro = dataDeVencimento;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Produto: "+produto);
        retorno.append("\n Cliente: "+cliente);
        retorno.append("\n Vendedor Responsavel: "+vendedorResponsavel);
        retorno.append("\n Valor a ser pago: "+valorSerPago);
        retorno.append("\n Data do vencimento: " +dataDeRegistro);

        return retorno.toString();
    }

}
