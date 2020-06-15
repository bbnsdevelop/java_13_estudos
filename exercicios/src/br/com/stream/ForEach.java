package br.com.stream;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Bruno", "Jo�o", "Pedro","Maria");
		
		nomes.forEach(n ->{
			String nome = n;
			System.out.println("Nome: "+ nome);
		});
		
		nomes.forEach(n ->System.out.println("Nome: " + n)); // N�o precisa ter corpo quando tem apenas uma linha de c�digo
		
		nomes.forEach(System.out::println); // Forma de referencia 
	}

}
