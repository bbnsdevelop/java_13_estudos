package br.com.stream;

import java.util.function.Predicate;

import br.com.stream.dto.Produto;

public class Predicado {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> {
				double precoXdesconto = prod.getPreco() * prod.getDesconto();
				double valorDesconto = precoXdesconto / 100;
				double produtoComDesconto = prod.getPreco() - valorDesconto;
				return produtoComDesconto > 1000;
			};
		
		Produto produto = new Produto("TV", 1100, 10.0);
		System.out.println(isCaro.test(produto));
	}

}
