package br.com.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno Pr�ncipe"); // retorna false caso n�o consiga add
		livros.push("O Hobbit"); // lan�a uma exception
		livros.add("Don Quixote");
		livros.push("As Cronicas de Narnia");
		livros.push("O Rei Le�o");
		
		System.out.println(livros.peek()); // retorna null
		System.out.println(livros.peek());
		System.out.println(livros.element()); // lan�a exception quando for null
		System.out.println(livros.element());
		
		
		System.out.println("-------");
		// fila.size()
		// fila.clear()
		// fila.isEmpty()
		
		System.out.println(livros.poll()); // retorna o elemento e remove da fila
		System.out.println(livros.poll());
		System.out.println(livros.poll()); // caso n�o tenha mais elementos na fila retorna null
		System.out.println(livros.remove()); // caso n�o tenha mais elementos na fila lan�a exepction
		System.out.println(livros.pop());
		

	}

}
