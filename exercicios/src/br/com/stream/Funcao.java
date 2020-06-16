package br.com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = n -> n % 2 == 0 ? "Par" : "Impar";
		Function<String, String> resultado = valor -> "O resultado é: " + valor;
		Function<String, String> empolgado = valor -> valor +" !!!!!!!!!!!";
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		numeros.forEach(n -> System.out.println(parOuImpar.andThen(resultado.andThen(empolgado)).apply(n)));
		
	}
}
