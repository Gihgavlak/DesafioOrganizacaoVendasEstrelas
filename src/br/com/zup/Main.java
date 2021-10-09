package br.com.zup;

public class Main {

    public static void main(String[] args) {
	//Sistema.cadastrarCliente();
	//ServicoCliente.exibirClientes();

	//Sistema.cadastrarVendendorRes();
	//ServicoVendedorResponsavel.exibirVendedor();

		Cliente cliente1 = new Cliente("Gislaine","987","gis@");
		Cliente cliente2 = new Cliente("Amanda","222","amam@");
		Cliente cliente3 = new Cliente("Rafaela","444","raf@");


		VendedorResponsavel vendedorResponsavel1 = new VendedorResponsavel("Odair","654","odair@");
		VendedorResponsavel vendedorResponsavel2 = new VendedorResponsavel("Kelly","555","kel@");
		VendedorResponsavel vendedorResponsavel3 = new VendedorResponsavel("Milly","777","mil@");

		//Venda venda1 = new Venda("Sapato",150,cliente1,vendedorResponsavel1,150,"25/07/2021");
		//System.out.println(venda1);

		//Venda venda2 = new Venda("Sandalia",80,cliente2,vendedorResponsavel2,80,"10/09/2021");
		//System.out.println(venda2);

		//Venda venda3 = new Venda("Sapato",150,cliente3,vendedorResponsavel3,90,"19/08/2021");
		//System.out.println(venda3);
		ServicoVenda.cadastrarVenda("sapato",155,cliente1,vendedorResponsavel1,150,"25/09/2021");
		ServicoVenda.exibirVendas();

    }
}
