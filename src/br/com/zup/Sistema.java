package br.com.zup;

import java.util.List;
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
                "\n|   1=> Para Cadastrar                            |" +
                "\n|   2=> Para Exibir                               |" +
                "\n|   3=> Para Sair                                 |" +
                "\n+-------------------------------------------------+");
    }

    //Submenu de Cadastro
    public static void menuCadastro(){
        System.out.println("");
        System.out.println("+------------Digite a opão desejada:--------------+" +
                "\n|   1=> Cadastrar um Cliente                      |"+
                "\n|   2=> Cadastrar um Vendedor                     |"+
                "\n|   3=> Cadastrar Compras                         |"+
                "\n|   4=> Para Sair                                 |"+
                "\n+-------------------------------------------------+");
    }

    //SubMenu de Exibir
    public static void menuExibir(){
        System.out.println("+-------------Digite a opão desejada:-------------+" +
                "\n|   1=> Para Exibir Clientes cadastrados          |"+
                "\n|   2=> Para Exibir Vendedores cadastrados        |"+
                "\n|   3=> Para Exibir as Vendas registradas         |" +
                "\n|   4=> Para Exibir as Compras do Cliente         |"+
                "\n|   5=> Para exibir as Vendas do Vendedor         |"+
                "\n|   6=> Para voltar ao Menu Inicial|              |"+
                "\n+-------------------------------------------------+");
    }

    // <== Cadastrar Cliente
    public static Cliente cadastrarCliente() throws Exception{
        System.out.println("-------------------------------------");
        String nome = obterDados("Digite o nome do cliente: ").nextLine();
        String cpf = obterDados("Digite o  CPF do cliente: ").nextLine();
        String email = obterDados("digite o e-mail do cliente: ").nextLine();
        return ServicoCliente.cadastrarCliente(nome, cpf, email);

    }
    //Exibir clientes
    public static void exibirClientes(){
        ServicoCliente.exibirClientes();
    }

    // <== Cadastrar vendedor Responsavel
    public static VendedorResponsavel cadastrarVendendorRes() throws Exception{
        System.out.println("-------------------------------------");
        String nome = obterDados("Digite o nome do vendedor: ").nextLine();
        String cpf = obterDados("Digite o  CPF do vendedor: ").nextLine();
        String email = obterDados("digite o e-mail do vendedor: ").nextLine();
        return ServicoVendedorResponsavel.cadastrarVendedorRes(nome, cpf, email);

    }
    //Exibir vendedor
    public static void exibirVendedor(){
        ServicoVendedorResponsavel.exibirVendedor();
    }
    //Pesquisar vendedor
    public static VendedorResponsavel pesquisarVendedor()throws Exception{
        String emailVendedor= obterDados("Digite o e-mail do Vendedor").nextLine();
        return ServicoVendedorResponsavel.pesquisarVendedor(emailVendedor);
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

    //exibir vendas
    public static void exibirVendas(){
        ServicoVenda.exibirVendas();
    }


    //<== Pesquisar compras do cliente pelo cpf
    public static List<Venda> pesquisarComprasCliente() throws Exception{
        String cpf = obterDados("Digite o cpf que deseja pesquisar:").nextLine();
        Cliente cliente = ServicoCliente.pesquisarCliente(cpf);
        return ServicoVenda.pesquisarComprasCliente(cliente);
    }

    //<== Pesquisar vendas do vendedor por e-mail
    public static List<Venda> pesquisarVendaVendedor() throws Exception{
        String email = obterDados("Digite o email que deseja pesquisar:").nextLine();
        VendedorResponsavel vendedorResponsavel = ServicoVendedorResponsavel.pesquisarVendedor(email);
        return ServicoVenda.pesquisarVendaVendedor(vendedorResponsavel);

    }

    public static void executar() throws Exception{
        boolean menu = true;

        while (menu){
            menuInicial();
            int opcao = obterDados("Digite a opção desejada: ").nextInt();

            if (opcao ==1){
                cadastrarVenda();
            } else if (opcao == 2){
                Sistema.exibirVendas();

            } else if (opcao == 3){
                ServicoCliente.exibirClientes();

            } else if (opcao ==4){
                Sistema.exibirVendedor();

            }else if (opcao==5){
                Sistema.pesquisarComprasCliente();

            }
            else if (opcao == 6){
                Sistema.pesquisarVendaVendedor();

            } else if (opcao == 7){
                System.out.println("Volte Sempre e Traga mais Gente!!!!");
                menu = false;

            } else{
                System.out.println("Digite uma opção válida");
            }
        }
    }

}
