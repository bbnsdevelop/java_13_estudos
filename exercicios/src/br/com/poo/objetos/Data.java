package br.com.poo.objetos;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;

	public Data() {
		this(1,1,1970);		
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
