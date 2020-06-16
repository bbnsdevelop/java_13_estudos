package br.com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import br.com.stream.dto.Produto;

public class Fornecedor {
	
	
	public static void main(String[] args) {
		
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Beto", "Tião");
		
		System.out.println(umaLista.get());
		
		Supplier<List<Produto>> produtos = () -> Arrays.asList(new Produto("Tv", 1000, 10), new Produto("Tv", 1000, 10),new Produto("Tv", 1000, 10));
		
		System.out.println(produtos.get());
		
		
		
	}

}
