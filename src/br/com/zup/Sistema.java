package br.com.zup;

import java.util.Scanner;

public class Sistema {
    private static Scanner obterDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);

    }

    // <== Cadastrar Cliente
    public static Cliente cadastrarCliente(){
        System.out.println("-------------------------------------");
        String nome = obterDados("Digite o nome do cliente: ").nextLine();
        String cpf = obterDados("Digite o  CPF do cliente: ").nextLine();
        String email = obterDados("digite o e-mail do cliente: ").nextLine();
        return ServicoCliente.cadastrarCliente(nome,cpf,email);

    }
}
