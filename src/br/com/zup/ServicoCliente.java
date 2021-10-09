package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    public static List<Cliente> clientes = new ArrayList<>();

    // Cadastrar cliente ==>
    public static Cliente cadastrarCliente(String nome, String cpf, String email)throws Exception{
        ServicoVendedorResponsavel.validarEmail(email);
        Cliente clienteCadastrado = new Cliente (nome, cpf, email);
        clientes.add(clienteCadastrado);
        return clienteCadastrado;
    }

    //Exibir a lista dos clientes cadstrados
    public static List<Cliente>exibirClientes(){
        for (Cliente referencia: clientes) {
            System.out.println(referencia);
        }
        return clientes;
    }


}
