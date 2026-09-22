package es.martinezrubiogabriel.ut01.ejercicios;

public class Ejercicio01 {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = 9;
		
		int numeroMayor = (a > b) ? ((a > c) ? a : c) : (b > c) ? b : c;
		//hola
		System.out.println("El número más alto en este caso es " +numeroMayor);
	}
}
