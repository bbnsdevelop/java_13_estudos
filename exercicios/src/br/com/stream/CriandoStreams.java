package br.com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<String> test = CriandoStreams::name;
		test.accept("Bruno");
		
		Stream<String> linguagens = Stream.of("Java ", "Lua ", "JavaScript ", "Cobol \n");		
		linguagens.forEach(print);
		
		String[] maisLinguagens = {"Python ", "Lisp ", "Perl ", "Go \n"};
		Stream.of(maisLinguagens).forEach(print);
		
		Arrays.stream(maisLinguagens).forEach(print);
		
		Arrays.stream(maisLinguagens, 0, 4).forEach(print);
		
		List<String> outrasLinguagens = Arrays.asList("PHP ", "C ", "C++ \n");
		
		outrasLinguagens.stream().forEach(print);
		outrasLinguagens.parallelStream().forEach(print);
		
		
	}
	
	public static void name(String nome) {
		System.out.println("por referencia " + nome);
	}

}
