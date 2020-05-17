package br.com.fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite um número");
		Integer i =  Integer.valueOf(valor1);
		
		JOptionPane.showMessageDialog(null, "Converteu para inteiro: " + i);
	}

}
