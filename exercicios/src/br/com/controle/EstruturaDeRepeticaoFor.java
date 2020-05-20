package br.com.controle;

public class EstruturaDeRepeticaoFor {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.println(String.format("Teste repita %s vezes", i));
		}
		
		
		int n = 10;
		for (int i = 0; i < 10 ; i++) {
			System.out.println("numeros decrescente: " + n);
			n = n - 2;
			if(n < 0) {
				break;
			}
		}
		
		// ou
		System.out.println();
		
		for (int i = 10; i >= 0; i -=2) {
			System.out.println("numeros decrescente: " + i);
		}
		
		for (String v ="#"; !v.equals("#####"); v +="#") {
			System.out.println(v);
			
		}

	}

}
