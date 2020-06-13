package br.com.poo.teste;

import br.com.poo.objetos.Compra;
import br.com.poo.objetos.Item;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra = new Compra();
		
		compra.adicionarItem(new Item("Mouse", 1, 20.00));
		compra.adicionarItem("Teclado", 1, 120.00);
		compra.adicionarItem(new Item("monitor", 2, 220.00));
		compra.adicionarItem(new Item("Cadeira", 3, 200.00));
		compra.adicionarItem(new Item("Memoria 4GB", 4, 420.00));
		
		
		System.out.println(compra.obterTotal());
	}
}
