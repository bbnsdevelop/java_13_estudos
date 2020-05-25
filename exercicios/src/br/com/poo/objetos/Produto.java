package br.com.poo.objetos;

public class Produto {
	
	public String nome;
	public double preco;
	public double desconto;
	
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
