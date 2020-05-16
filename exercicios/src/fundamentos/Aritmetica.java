package fundamentos;

public class Aritmetica {

	public static void main(String[] args) {
		int one = 1;
		int two = 2;
		int trhee = 3;
		int five = 5;
		int six = 6;
		int seven = 7;
		int ten = 10;
		
		double result =  ( powTrhee(trhee, parteOne(six, two, trhee) - parteTwo(one, five, two, seven) ) ) / Math.pow(ten, 3);
		
		System.out.println(result);
	}
	
	public static double parteOne(int six, int two, int trhee) {
		double result = Math.pow( (six * (trhee+two)) , two) / (trhee * two);
		return result;
	}
	
	public static double parteTwo(int one, int five, int two, int seven) {
		double result = Math.pow( ( ( (one - five) * (two - seven) /  two) ), two);
		
		return result;
	}
	
	public static double powTrhee(int trhee, double numberToPow) {
		double result = Math.pow(numberToPow, trhee);
		
		return result;
	}
	
	

}
