package br.com.poo.objetos;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;

	public Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return dia + "/" + mes + "/"  + ano ;
	}

	
	

}
