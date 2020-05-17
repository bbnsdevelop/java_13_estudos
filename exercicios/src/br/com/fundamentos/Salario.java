package br.com.fundamentos;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Double total = 0.0;
		for (int i = 0; i <= 2; i++) {
			System.out.println("Digite o salário " + (i + 1) + ": ");
			Scanner scan = new Scanner(System.in);
			String salario = scan.nextLine();
			total += Double.valueOf(salario.replace(",", "."));
		}
		System.out.println("total de salario: " + total);
		System.out.println("media de salario: " + (total / 3));

	}

}
