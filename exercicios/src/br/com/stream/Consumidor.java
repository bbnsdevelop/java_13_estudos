package br.com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.com.stream.dto.Produto;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> {
			double precoXdesconto = p.getPreco() * p.getDesconto();
			double valorDesconto = precoXdesconto / 100;
			double produtoComDesconto = p.getPreco() - valorDesconto;
			p.setPreco(produtoComDesconto);
			System.out.println(p);
		};
		
		Produto produto = new Produto("TV", 1100, 10.0);		
		imprimir.accept(produto);
		System.out.println("------------");
		
		Produto produto1 = new Produto("TV", 1100, 10.0);
		Produto produto2 = new Produto("TV", 1100, 10.0);
		Produto produto3 = new Produto("TV", 1100, 10.0);
		Produto produto4 = new Produto("TV", 1100, 10.0);
		
		
		List<Produto> produtos = Arrays.asList(produto1, produto2,produto3, produto4);
		
		produtos.forEach(System.out::println);
		System.out.println("------------");
		produtos.forEach(imprimir);
		
	}

}
