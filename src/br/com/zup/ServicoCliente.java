package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    public static List<Cliente> clientes = new ArrayList<>();

    // verificar cpf repetido
    public static void verificarCpfRepetido(String cpf)throws Exception{
        for(Cliente referencia : clientes){
            if(referencia.getCpf().equals(cpf)){
                throw new Exception("CPF já cadastrado");
            }
        }
    }

    //Metodo para verificar e-mail repetidos
    public static void verificarEmailRepetido(String email) throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getEmail().equals(email)){
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

    //Exibir a lista dos clientes cadstrados
    public static List<Cliente>exibirClientes(){
        for (Cliente referencia: clientes) {
            System.out.println(referencia);
        }
        return clientes;
    }

    //<== Metodo para pesquisar compras do cliente por cpf
    public static Cliente pesquisarComprasCliente (String cpf) throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getCpf().equals(cpf)){
                return referencia;
            }
        }
        throw new Exception("Nenhum cpf cadastrado");
    }

}
