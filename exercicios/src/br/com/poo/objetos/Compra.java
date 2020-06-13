package br.com.poo.objetos;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	String nomeClienteString;
	List<Item> itens = new ArrayList<>();
	
	public void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	public void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}	

	public Double obterTotal() {
		Double total = 0.0;

		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}

}
