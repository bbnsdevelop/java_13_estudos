package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		s = s.toUpperCase();
		s = s.replace("X","Teste");
		
		System.out.println(s);
		
		
		String y = "Bom dia X".replace("X", "Snow").concat(" blablabla").toUpperCase();
		System.out.println(y);
	}
}
