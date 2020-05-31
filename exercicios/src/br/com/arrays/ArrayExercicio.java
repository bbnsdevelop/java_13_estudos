package br.com.arrays;

import java.util.Scanner;

public class ArrayExercicio {
	
	public static void main(String[] args) {
		System.out.println("Quantas notas vocês quer inserir?");
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		double [] notas = new double [entrada.nextInt()];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i+1) +": ");			
			notas[i] = entrada.nextDouble();
		}
		
		for (double nota : notas) {
			total += nota;
		}
		
		System.out.println("Sua média final foi: " + total / notas.length);
		
		entrada.close();
	}

}
