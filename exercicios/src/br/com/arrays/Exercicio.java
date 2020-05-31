package br.com.arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		double [] notasAluno = new double[3];
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 6.9;
		
		System.out.println(Arrays.toString(notasAluno));
		double total = 0;
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.println(notasAluno[i]);
			total += notasAluno[i];			
		}
		System.out.println("Media: " + total / notasAluno.length);
		
		
		double [] notasAlunoB = {7,8,9,5};
		
		System.out.println(Arrays.toString(notasAlunoB));
		double total2 = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			System.out.println(notasAlunoB[i]);
			total2 += notasAlunoB[i];			
		}
		System.out.println("Media: " + total2 / notasAlunoB.length);
		
	}
}
