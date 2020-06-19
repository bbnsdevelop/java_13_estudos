package br.com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import br.com.stream.ultils.Utilitarios;

public class ConvertIntegerTOBinaryString {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		UnaryOperator<String> invert = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
		
		numbers.stream()
					.map(Integer::toBinaryString)
					.map(invert)
					.map(binarioParaInt)
					.forEach(Utilitarios.print);
	}

}
