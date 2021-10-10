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
        System.out.println("Quantidade de vendas: "+vendas.size());
        for (Venda referencia:vendas) {
            System.out.println(referencia);

        }

    }

    //Metodo para pesquisar compras do cliente pelo cpf ==>
    public static List<Venda> pesquisarComprasCliente(Cliente cliente){
        List<Venda> comprasCliente = new ArrayList<>();
        for (Venda referencia : vendas){
            if (referencia.getCliente().equals(cliente)){
                comprasCliente.add(referencia);
                System.out.println(referencia);
            }
        }
        return comprasCliente;
    }

    //Metodo para pesquisar vendas do vendedor por e-mail ==>
    public static List<Venda> pesquisarVendaVendedor(VendedorResponsavel vendedorResponsavel){
        List<Venda> vendasVendedor = new ArrayList<>();
        for (Venda referencia : vendas){
            if (referencia.getVendedorResponsavel().equals(vendedorResponsavel)){
                vendasVendedor.add(referencia);
                System.out.println(referencia);
            }
        }
        return vendasVendedor;
    }

}
