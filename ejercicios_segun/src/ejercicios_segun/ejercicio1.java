package ejercicios_segun;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int dia;
		// Solicitud de datos al usuario
		    System.out.println("El programa te devuelve el d�a de la semana seleccionando:");
		    System.out.println("1.- Lunes.");
		    System.out.println("2.- Martes.");
		    System.out.println("3.- Mi�rcoles.");
		    System.out.println("4.- Jueves.");
		    System.out.println("5.- Viernes.");
		    System.out.println("6.- S�bado.");
		    System.out.println("7.- Domingo.");
		    dia = in.nextInt();
		// Realizamos comparaciones y mostramos el resultado
		    switch (dia) {
		    case 1:
		      System.out.println("El d�a seleccionado es LUNES");
		      break;
		    case 2:
		      System.out.println("El d�a seleccionado es MARTES");
		      break;
		    case 3:
		      System.out.println("El d�a seleccionado es MI�RCOLES");
		      break;
		    case 4:
		      System.out.println("El d�a seleccionado es JUEVES");
		      break;
		    case 5:
		      System.out.println("El d�a seleccionado es VIERNES");
		      break;
		    case 6:
		      System.out.println("El d�a seleccionado es S�BADO");
		      break;
		    case 7:
		      System.out.println("El d�a seleccionado es DOMINGO");
		      break;
		    default:
		      System.out.println("ERROR: n�mero incorrecto.");
		    }
	}

}
