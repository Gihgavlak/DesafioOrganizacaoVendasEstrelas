package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedorResponsavel {
    public static List<VendedorResponsavel> vendedoresResponsaveis = new ArrayList<>();

    //validar email
    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Digite um email válido");

        }
    }

    //método para verificar cpf repetido
    public static void verificarCpfRepetido(String cpf) throws Exception{
        for (VendedorResponsavel referencia: vendedoresResponsaveis){
            if (referencia.getCpf().equals(cpf)){
                throw new Exception("Cpf já cadastrado!");
            }
        }
    }

    //Cadastrar o vendedor responsável
    public static VendedorResponsavel cadastrarVendedorRes(String nome, String cpf, String email) throws Exception {
        validarEmail(email);
        verificarCpfRepetido(cpf);
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
