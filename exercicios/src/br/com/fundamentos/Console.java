package br.com.fundamentos;

import java.util.Scanner;

public class Console {
	
	
	public static void main(String[] args) {
		System.out.println("Teste");
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite algo: ");
		String entrada = scan.nextLine();
		
		System.out.println(String.format("Algo digitado %s", entrada));
		
		scan.close();
		
	}

}
