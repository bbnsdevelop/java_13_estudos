package br.com.poo.compras;

public class ClienteTeste {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Bruno");

		Compra compra = new Compra();
		compra.adicionarItem("Mouse", 20.00,2);
		compra.adicionarItem( new Item(2, new Produto("Mouse", 20.00)));
		compra.adicionarItem( new Item(2, new Produto("Mouse", 20.00)));

		cliente.adicionarCompra(compra);				
	
		Compra compra1 = new Compra();
		compra1.adicionarItem(new Item(1, new Produto("Teclado", 120.00)));
		compra1.adicionarItem(new Item(1, new Produto("Monito", 500.00)));
		compra1.adicionarItem(new Item(2, new Produto("Notebook", 2000.00)));
		cliente.adicionarCompra(compra1);	
		
		
		
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Gastou R$" + cliente.obterValorTotalCompras());
		System.out.println("Suas compras foram:");
		System.out.println("----------------------------------------");
		for (Compra c : cliente.getCompras()) {
			for (Item i : c.getItens()) {
				System.out.println("Qtd: "+ i.getQuantidade());
				System.out.println("Produto: "+ i.getProduto().getNome());
				System.out.println("Valor Unitario: "+ i.getProduto().getPreco());
			}
			System.out.println("Valor da compra: " +c.obterValorDaCompra());			
			System.out.println("----------------------------------------");
		}
		
	}

}
