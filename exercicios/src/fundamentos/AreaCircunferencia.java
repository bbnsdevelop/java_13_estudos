package fundamentos;

public class AreaCircunferencia {
	private static final double PI = 3.14159;
	
	public static void main(String[] args) {
		double raio = 3.4;
		
		System.out.println("A circunferência da área é: " + calcularCircunferencia(PI, raio));
	}
	
	private static double calcularCircunferencia(double pi, double raio) {
		return pi * raio *raio;
	}

}
