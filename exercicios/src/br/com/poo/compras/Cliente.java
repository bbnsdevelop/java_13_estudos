package br.com.poo.compras;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private List<Compra> compras;
	
	
	

	public Cliente() {

	}

	public Cliente(String nome) {
		this.nome = nome;
	}
	
	
	public void adicionarCompra(Compra c) {
		if(this.compras == null) {
			this.compras = new ArrayList<>();
		}
		this.compras.add(c);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public Double obterValorTotalCompras() {
		Double total = 0.0;
		for (Compra compra : compras) {
			total += compra.obterValorDaCompra();
		}
		return total;

	}

}
