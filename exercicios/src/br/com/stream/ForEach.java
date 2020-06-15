package br.com.stream;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Bruno", "João", "Pedro","Maria");
		
		nomes.forEach(n ->{
			String nome = n;
			System.out.println("Nome: "+ nome);
		});
		
		nomes.forEach(n ->System.out.println("Nome: " + n)); // Não precisa ter corpo quando tem apenas uma linha de código
		
		nomes.forEach(System.out::println); // Forma de referencia 
	}

}
