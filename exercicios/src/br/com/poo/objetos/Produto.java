package br.com.poo.objetos;

public class Produto {
	
	public String nome;
	public double preco;
	public double desconto;
	
	
	
	
	public Produto() {

	}


	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}


	public Double applicarDesconto() {
		Double descontoAplicado = preco * (1 - desconto);
		return descontoAplicado;
	}
	
	
	public void mostarProduto(Double precoComDesconto) {
		System.out.println(nome);
		System.out.println(preco);
		System.out.println(precoComDesconto);
	}

}
