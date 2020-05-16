package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1;
		
		// conversao explicita
		float b = (float) 2.5;
		
		// perdeu informações
		int i = (int) b;
		
		System.out.println(i);
		
		Boolean bo = new Boolean("true");
		System.out.println(bo);
	}

}
