package br.com.zup;

import java.util.Scanner;

public class Sistema {
    private static Scanner obterDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);

    }

    //Criaçao do menu inicial
    public static void menuInicial() {
        System.out.println(" \n");
        System.out.println("+-------------Digite a opão desejada:-------------+" +
                "\n|    1=> Para cadastrar venda                      |" +
                "\n|    2=> Para verificar lista das vendas           |" +
                "\n|    3=> Para verificar a lista de clientes        |" +
                "\n|    4=> Para verificar a lista de vendedores      |" +
                "\n|    5=> Para sair do programa                     |" +
                "\n+--------------------------------------------------+");
    }

    // <== Cadastrar Cliente
    public static Cliente cadastrarCliente() throws Exception{
        System.out.println("-------------------------------------");
        String nome = obterDados("Digite o nome do cliente: ").nextLine();
        String cpf = obterDados("Digite o  CPF do cliente: ").nextLine();
        String email = obterDados("digite o e-mail do cliente: ").nextLine();
        return ServicoCliente.cadastrarCliente(nome, cpf, email);

    }

    // <== Cadastrar vendedor Responsavel
    public static VendedorResponsavel cadastrarVendendorRes() throws Exception{
        System.out.println("-------------------------------------");
        String nome = obterDados("Digite o nome do vendedor: ").nextLine();
        String cpf = obterDados("Digite o  CPF do vendedor: ").nextLine();
        String email = obterDados("digite o e-mail do vendedor: ").nextLine();
        return ServicoVendedorResponsavel.cadastrarVendedorRes(nome, cpf, email);

    }

    // <==Cadastar venda
    public static Venda cadastrarVenda() throws Exception {
        String produto = obterDados("Digite o nome do produto: ").nextLine();
        double valorProduto = obterDados("Digite o valor do produto: ").nextDouble();
        double valorSerPago = obterDados("Digite o valor a ser pago: ").nextDouble();
        String dataDeVencimento = obterDados("Digite a data de vencimento: ").nextLine();
        Cliente cliente = cadastrarCliente();
        VendedorResponsavel vendedorResponsavel = cadastrarVendendorRes();
        Venda venda = ServicoVenda.cadastrarVenda(produto, valorProduto, cliente, vendedorResponsavel, valorSerPago, dataDeVencimento);
        return venda;
    }

    public static void executar() throws Exception{
        boolean menu = true;

        while (menu){
            menuInicial();
            int opcao = obterDados("Digite a opção desejada: ").nextInt();

            if (opcao ==1){
                cadastrarVenda();
            } else if (opcao == 2){
                ServicoVenda.exibirVendas();

            } else if (opcao == 3){
                ServicoCliente.exibirClientes();

            } else if (opcao == 4){
                ServicoVendedorResponsavel.exibirVendedor();

            } else if (opcao == 5){
                System.out.println("Volte Sempre e Traga mais Gente!!!!");
                menu = false;

            } else{
                System.out.println("Digite uma opção válida");
            }
        }
    }

}
