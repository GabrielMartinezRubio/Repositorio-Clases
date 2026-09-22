package es.martinezrubiogabriel.ut01.ejercicios;

public class PruebasCasa {
	public static void main(String[] args) {
		int a = 9;
		int b = 5;
		int c = 11;
		
		int mayorNumero = a > b ? (a > c ? a : c) : (b > c ? b : c) ;
		
		System.out.println(mayorNumero);
		
		int [] nume = {1,2,3};
		
	    for (int numero : nume)
	    {
	        System.out.println(numero);
	    }
		
	}
}
