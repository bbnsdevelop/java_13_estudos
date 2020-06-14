package br.com.colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
	
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1,"Bruno"); // add
		usuarios.put(1,"Bruno Batista"); // se a chave for igual atualiza
		usuarios.put(2,"Tacy");
		usuarios.put(3,"João");
		usuarios.put(4,"Rafa");
		usuarios.put(4,"Rafael");
		usuarios.put(5,"Lana");
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		for (int id : usuarios.keySet()) {
			System.out.println(id);
		}
		
		for (String usuario: usuarios.values()) {
			System.out.println(usuario);
		}
		
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro);
		}
		
		
		
		

	}

}
