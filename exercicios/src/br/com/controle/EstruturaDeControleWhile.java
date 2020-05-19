package br.com.controle;

public class EstruturaDeControleWhile {

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
	}

}
