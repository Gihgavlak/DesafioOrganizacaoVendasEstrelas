package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(String produto,double valorProduto,Cliente cliente,VendedorResponsavel vendedorResponsavel,double valorSerPago, String dataDeVencimento){
        Venda venda = new Venda(produto, valorProduto, cliente, vendedorResponsavel, valorSerPago, dataDeVencimento);
        vendas.add(venda);
        return venda;
    }

    public static void exibirVendas(){
        for (Venda referencia:vendas) {
            System.out.println(referencia);

        }
    }


}
