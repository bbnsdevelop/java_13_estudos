package br.com.stream.ultils;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Utilitarios {
	
	public static final UnaryOperator<String> uppercase = n -> n.toUpperCase();
	public static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+"";
	public static final String grito(String n) {
		return n+"!!!!";	
	}
	
	public static final Consumer<Object> print = System.out::println;
	
	

}
