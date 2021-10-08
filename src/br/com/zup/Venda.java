package br.com.zup;

public class Venda {
    private Cliente cliente;
    private VendedorResponsavel vendedorResponsavel;
    private double valorSerPago;
    private String dataDeVencimento;

    public Venda() {

    }

    public Venda(Cliente cliente, VendedorResponsavel vendedorResponsavel, double valorSerPago, String dataDeVencimento) {
        this.cliente = cliente;
        this.vendedorResponsavel = vendedorResponsavel;
        this.valorSerPago = valorSerPago;
        this.dataDeVencimento = dataDeVencimento;

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
        retorno.append("\n Cliente: "+cliente);
        retorno.append("\n Vendedor Responsavel: "+vendedorResponsavel);
        retorno.append("\n Valor a ser pago: "+valorSerPago);
        retorno.append("\n Data do vencimento: " +dataDeVencimento);

        return retorno.toString();
    }

}
