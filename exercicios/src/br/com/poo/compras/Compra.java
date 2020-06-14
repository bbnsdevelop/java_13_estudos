package br.com.poo.compras;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	private List<Item> itens;

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public void adicionarItem(String nome, Double preco, int qtd) {
		adicionarItem(new Item(qtd, new Produto(nome, preco)));
	}
	
	public void adicionarItem(Item item) {
		if(this.itens == null) {
			this.itens = new ArrayList<>();
		}
		this.itens.add(item);
	}
	
	
	public Double obterValorDaCompra() {
		Double total = 0.0;
		
		for (Item item : itens) {
			total += item.getQuantidade() * item.getProduto().getPreco();
		}
		
		return total;
	}
	

}
