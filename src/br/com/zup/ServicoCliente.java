package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    public static List<Cliente> clientes = new ArrayList<>();

    // verificar cpf repetido
    public static void verificarCpfRepetido(String cpfCliente)throws Exception{
        for(Cliente referencia : clientes){
            if(referencia.getCpf().equals(cpfCliente)){
                throw new Exception("CPF já cadastrado");
            }
        }
    }

    //Metodo para verificar e-mail repetidos
    public static void verificarEmailRepetido(String emailCliente) throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getEmail().equals(emailCliente)){
                throw new Exception("E-mail ja cadastrado");
            }
        }
    }

    // Cadastrar cliente ==>
    public static Cliente cadastrarCliente(String nome, String cpf, String email)throws Exception{
        ServicoVendedorResponsavel.validarEmail(email);
        verificarEmailRepetido(email);
        verificarCpfRepetido(cpf);
        Cliente clienteCadastrado = new Cliente (nome, cpf, email);
        clientes.add(clienteCadastrado);
        return clienteCadastrado;
    }

    //Exibir a lista dos clientes cadastrados
    public static void exibirClientes(){
        System.out.println("Quantidade de Clientes: "+clientes.size());
        for (Cliente referencia: clientes) {
            System.out.println(referencia);
        }

    }

    //<== Metodo para pesquisar cliente por cpf
    public static Cliente pesquisarCliente (String cpfCliente) throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getCpf().equals(cpfCliente)){
                return referencia;
            }
        }
        throw new Exception("Cpf não encontrado");
    }

}
