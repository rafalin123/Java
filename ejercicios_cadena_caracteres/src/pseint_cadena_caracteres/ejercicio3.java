package pseint_cadena_caracteres;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String palabra;
		int contador=0;
		System.out.println("Introduce tu nombre: ");
		palabra= in.next();
		for (int x=0;x< palabra.length();x++) {
			if ((palabra.charAt(x)=='a' || palabra.charAt(x)=='e' || palabra.charAt(x)=='o' || palabra.charAt(x)=='i' || palabra.charAt(x)=='u')) {
				contador++;
			}
		}
		System.out.println("La palabra " + palabra + " contiene " + contador + " vocales");
	}
	
}
