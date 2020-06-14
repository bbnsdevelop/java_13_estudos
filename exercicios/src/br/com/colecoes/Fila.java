package br.com.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// offer e add -> ambos adiciona um item na lista, 
		// a diferen� � no comportamento quando a lista est� cheia
		
		fila.add("Ana"); // caso n�o add retorna false 
		fila.offer("Bia"); // caso n�o consiga add na fila lan�a execption
		fila.offer("Bruno");
		fila.offer("Tacy");
		fila.offer("Jo�o");
		fila.offer("Pedro");
		fila.offer("Ze");
		fila.offer("Daniel");
		fila.offer("Lana");
		fila.offer("Rafa");
		
		
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a exception quando for null
		System.out.println(fila.element());
		
		
		System.out.println("-------");
		// fila.size()
		// fila.clear()
		// fila.isEmpty()
		
		System.out.println(fila.poll()); // retorna o elemento e remove da fila
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // caso n�o tenha mais elementos na fila retorna null
		System.out.println(fila.remove()); // caso n�o tenha mais elementos na fila lan�a exepction

	}

}
