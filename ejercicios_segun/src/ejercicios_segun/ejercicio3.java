package ejercicios_segun;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int mes;
		// Solicitud de datos al usuario
		    System.out.println("Introduce un numero segun el mes en el que estes: ");

		    mes = in.nextInt();
		    
		// Realizamos comparaciones y mostramos el resultado
		    switch (mes) {
		    case 1:
		      System.out.println("El d�a seleccionado es ENERO");
		      break;
		    case 2:
		      System.out.println("El d�a seleccionado es FEBRERO");
		      break;
		    case 3:
		      System.out.println("El d�a seleccionado es MARZO");
		      break;
		    case 4:
		      System.out.println("El d�a seleccionado es ABRIL");
		      break;
		    case 5:
		      System.out.println("El d�a seleccionado es MAYO");
		      break;
		    case 6:
		      System.out.println("El d�a seleccionado es JUNIO");
		      break;
		    case 7:
		      System.out.println("El d�a seleccionado es JULIO");
		      break;
		    case 8:
			      System.out.println("El d�a seleccionado es AGOSTO");
			      break;
		    case 9:
			      System.out.println("El d�a seleccionado es SEPTIEMBRE");
			      break;
		    case 10:
			      System.out.println("El d�a seleccionado es OCTUBRE");
			      break;
		    case 11:
			      System.out.println("El d�a seleccionado es NOVIEMBRE");
			      break;
		    case 12:
			      System.out.println("El d�a seleccionado es DICIEMBRE");
			      break;
		    default:
		      System.out.println("ERROR: n�mero incorrecto.");
		    }
	}

}
