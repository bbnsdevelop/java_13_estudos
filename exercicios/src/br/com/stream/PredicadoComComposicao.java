package br.com.stream;

import java.util.function.Predicate;

public class PredicadoComComposicao {
	
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num.toString().length() == 3;
		
	
		System.out.println(isPar.and(isTresDigitos).test(222));
		System.out.println(isPar.or(isTresDigitos).test(223));
		System.out.println(isPar.and(isTresDigitos).negate().test(222));
	}

}
