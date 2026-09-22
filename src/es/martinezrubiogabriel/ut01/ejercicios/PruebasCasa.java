package es.martinezrubiogabriel.ut01.ejercicios;

public class PruebasCasa {
	public static void main(String[] args) {
		int a = 9;
		int b = 5;
		int c = 11;
		boolean turno = false;
		int mayorNumero = a > b ? (a > c ? a : c) : (b > c ? b : c);
		
		
		//System.out.println(mayorNumero);
		
		int [] nume = {1,2,3};
		if (turno == false) {
			a -=atacar(10);
			System.out.println(a);			
		}
		
	    /*for (int numero : nume)
	    {
	       System.out.println(numero);
	    }*/
		
	}
	public static int atacar (int ataque) {
		return ataque;
	}
}
