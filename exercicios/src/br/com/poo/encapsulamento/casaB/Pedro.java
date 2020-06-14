package br.com.poo.encapsulamento.casaB;

import br.com.poo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
		Ana mae = new Ana();
		
		System.out.println(mae.todosSabem);
		System.out.println(formaDeFalar); // por herança 
		// System.out.println(facoComida);
		// System.out.println(esposa.segredo);	
	}

}
