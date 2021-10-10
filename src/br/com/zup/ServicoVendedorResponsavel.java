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

    //Metodo para verificar e-mail repetidos
    public static void verificarEmailRepetido(String email) throws Exception{
        for (VendedorResponsavel referencia : vendedoresResponsaveis){
            if (referencia.getEmail().equals(email)){
                throw new Exception("E-mail ja cadastrado");
            }
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
        verificarEmailRepetido(email);
        verificarCpfRepetido(cpf);
        VendedorResponsavel vendedorCadastrado = new VendedorResponsavel(nome,cpf,email);
        vendedoresResponsaveis.add(vendedorCadastrado);
        return vendedorCadastrado;

    }

    //Exibir a lista dos vendedores responsáveis
    public static List<VendedorResponsavel> exibirVendedor(){
        System.out.println("Quantidade de Vendedores: "+vendedoresResponsaveis.size());
        for (VendedorResponsavel referencia: vendedoresResponsaveis) {
            System.out.println(referencia);
        }
        return vendedoresResponsaveis;
    }

    //<== Metodo para pesquisar vendas do vendedor por e-mail
    public static VendedorResponsavel pesquisarVendedor(String email) throws Exception{
        for (VendedorResponsavel referencia : vendedoresResponsaveis){
            if (referencia.getEmail().equals(email)){
                return referencia;
            }
        }
        throw new Exception("Nenhum email cadastrado");
    }
}
