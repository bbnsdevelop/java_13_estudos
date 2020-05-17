package br.com.fundamentos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		boolean cond1 = true;
		boolean cond2 = 3 > 7;
		
		System.out.println(cond1 && cond2);
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2);
		System.out.println(!cond1);
		System.out.println(!cond2);
		
		System.out.println("Tabela verdade AND (&&)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("Tabela verdade OR (||)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		System.out.println("Tabela verdade XOR (^)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		System.out.println("Tabela verdade NOT(!)");
		System.out.println(!true);
		System.out.println(!false);
		pratica();
	}
	
	public static void pratica () {
		System.out.println("-----");
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean passei = trabalho1 && trabalho2;
		boolean gosteiDeUmDosTrabalhos = trabalho1 ^ trabalho2;
		boolean estudarMais = trabalho1 || trabalho2;
		boolean assitir = !estudarMais;
		boolean ternario = (trabalho1 && trabalho2) == true ? true:false || (trabalho1 ^ trabalho2) == true ? true:false;
		
		System.out.println("Os dois trabalhos entregue? " + passei);
		System.out.println("Gostei de um dos trabalhos? " + gosteiDeUmDosTrabalhos);
		System.out.println("Estudar mais? " + estudarMais);
		System.out.println("Posso assisti? " + !assitir);
		System.out.println("Operador ternario:" +ternario);
	}
	
}
