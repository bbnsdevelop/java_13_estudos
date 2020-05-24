package br.com.poo.teste;

import br.com.poo.objetos.Produto;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto();

		p1.nome = "Notebook";
		p1.preco = 4359.89;
		p1.desconto = 0.25;

		Produto p2 = new Produto();

		p2.nome = "Caneta";
		p2.preco = 12.56;
		p2.desconto = 0.29;

		Double p1Desconto = p1.preco * (1 - p1.desconto);
		Double p2Desconto = p2.preco * (1 - p2.desconto);

		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p1Desconto);
		System.out.println("----------");
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		System.out.println(p2Desconto);
	}
}
