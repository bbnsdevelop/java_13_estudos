package br.com.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EvolucaoDasInteracoes {
	
	public static void main(String[] args) {
				
		List<String> aprovados = Arrays.asList("Bruno", "Rafa", "Lana", "Tacy");
		
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));			
		}
		System.out.println("------");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		System.out.println("------");
		Iterator<String> nomes = aprovados.iterator();
		while (nomes.hasNext()) {
			System.out.println(nomes.next());
			
		}
		
		System.out.println("------");		
		aprovados.stream().forEach(System.out::println);
		
		System.out.println("------");
		
		
		
	}
}
