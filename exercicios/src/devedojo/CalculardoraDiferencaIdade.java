package devedojo;

public class CalculardoraDiferencaIdade {
	
	public static void main(String[] args) {
		int idade1 = 50;
		int idade2 = 45;
		int result = calc(idade1, idade2);
		showResult(result);		
	}
		
	static int calc(int idade1, int idade2){
		if(idade1 >= idade2) {
			return idade1 - idade2;
		}else {
			return idade2 - idade1;			
		}
	}
	
	static void showResult(int result){
		System.out.println("A diferença entre as idades é: " + result);
	}
	
	
}
