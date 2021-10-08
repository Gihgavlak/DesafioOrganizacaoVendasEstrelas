package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedorResponsavel {
    public static List<VendedorResponsavel> vendedoresResponsaveis = new ArrayList<>();

    //Cadastrar o vendedor responsável
    public static VendedorResponsavel cadastrarVendedorRes(String nome, String cpf, String email) {
        VendedorResponsavel vendedorCadastrado = new VendedorResponsavel(nome,cpf,email);
        vendedoresResponsaveis.add(vendedorCadastrado);
        return vendedorCadastrado;

    }

    //Exibir a lista dos vendedores responsáveis
    public static List<VendedorResponsavel> exibirVendedor(){
        for (VendedorResponsavel referencia: vendedoresResponsaveis) {
            System.out.println(referencia);
        }
        return vendedoresResponsaveis;
    }
}
