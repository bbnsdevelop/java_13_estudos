package br.com.colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBanguncado {
	
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add("Teste");
		conjunto.add("Teste");
		conjunto.add(true);
		conjunto.add(1);
		
		System.out.println("tamando " + conjunto.size());
		
		System.out.println(conjunto.remove(true));
		
		
		System.out.println(conjunto.contains("Teste"));
		
		System.out.println("tamando " + conjunto.size());
		
		Set nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);
		
		System.out.println("tamando " + conjunto.size());
		
		conjunto.retainAll(nums); // o que tem de comum as duas coleções
		
		
		System.out.println("tamando " + conjunto.size());
		System.out.println(conjunto);
		conjunto.clear();
		
		System.out.println(conjunto);
	}
}
