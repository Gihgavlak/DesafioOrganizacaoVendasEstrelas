package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    public static List<Cliente> clientes = new ArrayList<>();

    // Cadastrar cliente ==>
    public static Cliente cadastrarCliente(String nome, String cpf, String email){
        Cliente clienteCadastrado = new Cliente (nome, cpf, email);
        clientes.add(clienteCadastrado);
        return clienteCadastrado;
    }
}
