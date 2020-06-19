package br.com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import br.com.stream.dto.Produto;
import br.com.stream.ultils.Utilitarios;

public class Maps {
	
	
	public static void main(String[] args) {
		
		Consumer<Produto> novovalor = Maps::setNovoValorProduto;
		Consumer<String> print = System.out::println;;
		
		
		List<Produto> produtos = Arrays.asList(new Produto("TV", 0.0, 0.1),
											   new Produto("Note", 0.0, 0.1),
											   new Produto("PC", 0.0, 0.1));
		produtos.parallelStream().forEach(novovalor);
		System.out.println(produtos);

		List<String> marcasCarros = Arrays.asList("BMW", "Audi", "Mercedes", "Honda");
		marcasCarros.stream().map(n -> n.toUpperCase()).forEach(print);
		
		marcasCarros.stream().map(Utilitarios.uppercase).map(Utilitarios.primeiraLetra).map(Utilitarios::grito).forEach(print);
	}
	
	public static void setNovoValorProduto(Produto p) {
		p.setPreco(5000.00);
	} 
	

}
