package br.com.controle;

public class EstruturaSwitch {
	
	
	public static void main(String[] args) {
		
		String materia = "Matem�tica";
		
		switch (materia.toLowerCase()) {
		case "matem�tica":
			System.out.println("exatas");
			break;
		case "portugu�s":
			System.out.println("humanas");
			break;
		default:
			System.out.println("nenhuma das alternativas");
			break;
		}
	}

}
