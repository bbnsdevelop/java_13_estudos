package br.com.arrays;

import java.util.Scanner;

public class Matrizes {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos?");
		int qtdAlunos = entrada.nextInt();
		System.out.println("Quantas notas?");
		int notas = entrada.nextInt();
		
		double total = 0;
		
		double [][] notasDaTurma = new double [qtdAlunos][notas];
	
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.print("Notas do aluno " + (i+1) +": ");
				double nota = entrada.nextDouble();
				notasDaTurma[i][j] = nota;
				total += notasDaTurma[i][j]; 		
			}
			
		}
		double media = total / (qtdAlunos * notas);
		
		System.out.println("Media da turma: "+ media);
		entrada.close();
	}
}
