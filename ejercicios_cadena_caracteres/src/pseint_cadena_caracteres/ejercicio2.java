package pseint_cadena_caracteres;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String nombre;
		String vocal;
		System.out.println("Introduce tu nombre: ");
		nombre = in.next();
		System.out.println("Introduce la vocal en minuscula: ");
		vocal = in.next();
		
		
		System.out.println(nombre.replace(vocal, vocal.toUpperCase()));
	}

}
