package br.com.fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá mundo".charAt(2));
		
		String s = " Boa tarde    ".trim();
		System.out.println(s);
		s = s.replaceAll("\\s", "");
		System.out.println(s);
		
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toLowerCase().endsWith("tarde"));
		
	}
}
