package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    //cadastrar vendas==>
    public static Venda cadastrarVenda(String produto,double valorProduto,Cliente cliente,VendedorResponsavel vendedorResponsavel,double valorSerPago, String dataDeVencimento)throws Exception{

        Venda venda = new Venda(produto, valorProduto, cliente, vendedorResponsavel, valorSerPago, dataDeVencimento);
        vendas.add(venda);
        return venda;
    }

    //Exibir menu
    public static void exibirVendas(){
        for (Venda referencia:vendas) {
            System.out.println(referencia);

        }
    }

    //Metodo para pesquisar vendas do cliente pelo cpf ==>
    public static List<Venda> pesquisarVendaCliente(String cpf){
        List<Venda> vendasCliente = new ArrayList<>();
        for (Venda referencia : vendas){
            if (referencia.getCliente().getCpf().equals(cpf)){
                vendasCliente.add(referencia);
            }
        }
        return vendasCliente;
    }


}
