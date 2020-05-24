package br.com.controle;

public class EstruturaSwitch {
	
	
	public static void main(String[] args) {
		
		String materia = "Matemática";
		
		switch (materia.toLowerCase()) {
		case "matemática":
			System.out.println("exatas");
			break;
		case "português":
			System.out.println("humanas");
			break;
		default:
			System.out.println("nenhuma das alternativas");
			break;
		}
	}

}
