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

		Double p1Desconto = p1.applicarDesconto();
		Double p2Desconto = p2.applicarDesconto();
		double total = p1Desconto + p2Desconto;
		
		p1.mostarProduto(p1Desconto);
		p2.mostarProduto(p2Desconto);
		
		Produto p3 = new Produto("teclado", 50, 0.08);
		Double p3Desconto = p3.applicarDesconto();
		p3.mostarProduto(p3Desconto);
		total += p3Desconto;
		
		System.out.printf("Total do carrinho = R$%.2f", total);
	}
}
