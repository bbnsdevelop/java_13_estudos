package br.com.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno Príncipe"); // retorna false caso não consiga add
		livros.push("O Hobbit"); // lança uma exception
		livros.add("Don Quixote");
		livros.push("As Cronicas de Narnia");
		livros.push("O Rei Leão");
		
		System.out.println(livros.peek()); // retorna null
		System.out.println(livros.peek());
		System.out.println(livros.element()); // lança exception quando for null
		System.out.println(livros.element());
		
		
		System.out.println("-------");
		// fila.size()
		// fila.clear()
		// fila.isEmpty()
		
		System.out.println(livros.poll()); // retorna o elemento e remove da fila
		System.out.println(livros.poll());
		System.out.println(livros.poll()); // caso não tenha mais elementos na fila retorna null
		System.out.println(livros.remove()); // caso não tenha mais elementos na fila lança exepction
		System.out.println(livros.pop());
		

	}

}
