package br.com.controle;

public class EstruturaDeControleIf {
	
	public static void main(String[] args) {
		double media = 4.5;
		
		if(media <= 10 && media >= 7) {
			System.out.println("Passou");
		}else if(media < 7 && media >= 5){
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
			
	}

}
