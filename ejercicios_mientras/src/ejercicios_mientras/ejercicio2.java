package ejercicios_mientras;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Definir variables
		
		int n1;
		int n2;
		int sum;
		//Pedimos datos al usuario
		do {
		System.out.println("Introduce el primer numero: ");
		n1 = in.nextInt();
		System.out.println("Introduce el segundo numero: ");
		n2 = in.nextInt();
		
		sum = n1+n2;
		System.out.println("La suma es: "+sum);
		}while (n1 != 0 && n2 != 0);
		
	}

}
