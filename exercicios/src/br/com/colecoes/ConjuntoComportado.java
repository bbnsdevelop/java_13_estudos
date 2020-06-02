package br.com.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		Set<String> lista = new HashSet<>();

		lista.add("Teste");
		lista.add("Teste");
		lista.add("alvo");

		System.out.println(lista);

		for (String s : lista) {
			System.out.println(s);
		}

		Set<String> nomes = new TreeSet<>();

		nomes.add("Rafael");
		nomes.add("Lana");
		nomes.add("Bruno");
		nomes.add("Tacy");

		System.out.println(nomes);

		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		SortedSet<String> paises = new TreeSet<>();

		paises.add("Brasil");
		paises.add("Australia");
		paises.add("Alemanha");
		paises.add("Japao");

		System.out.println(paises.contains("Brasil"));
		
		System.out.println(paises);

		for (String pais : paises) {
			System.out.println(pais);
		}
		

	}

}
