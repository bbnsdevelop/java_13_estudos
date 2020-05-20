package br.com.controle;

import java.util.Scanner;

public class EstruturaDeRepeticaoWhileAndDoWhile {

	public static void main(String[] args) {
		
		int i = 1;
		while( i <= 3) {
			System.out.println(String.format("Teste repita %s vezes", i));
			i++;
		}
		System.out.println("fim while");
		i = 1;
		
		do {
			System.out.println("Faz primeiro para depois checar a condições se é verdadeira");
			System.out.println(String.format("Teste repita %s vezes", i));
			i++;
		}while(i <= 1);

		System.out.println("fim do/while");
		Scanner entrada = new Scanner(System.in);
		String teclado = null;
		while(!"sair".equalsIgnoreCase(teclado)) {
			System.out.println("Dgigite algo");
			teclado = entrada.next();
			System.out.println("Eu sei o que vc digitou: " + teclado);
			
		}
		System.out.println("fim do laço");
		entrada.close();
	}

}
