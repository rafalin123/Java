package ejercicios_mientras;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int suma;
		int numero1 = (int)(Math. random()*100+1);
		System.out.println(numero1);
		int numero2 = (int)(Math. random()*100+1);
		System.out.println(numero2);
		
		suma = numero1+numero2;
		
		System.out.println("Escribir Respuesta");
		int x = in.nextInt();
		
		while (x<suma || x>suma)
		{
			System.out.println("Respuesta incorrecta.");
			System.out.println("Volver a intentar.");
			x = in.nextInt();
			
			if (x==suma)
			{
				System.out.println("Respuesta correcta");
			}
		}
	}

}
