package ejercicios_segun;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = 0;
        System.out.println("Introduce un N�mero: ");
        N = in.nextInt();
        if (N == 1)
            System.out.println("Hoy es Lunes");
        else if (N == 2)
            System.out.println("Hoy es Martes");
        else if (N == 3)
            System.out.println("Hoy es Mi�rcoles");
        else if (N == 4)
            System.out.println("Hoy es Jueves");
        else if (N == 5)
            System.out.println("Hoy es Viernes");
        else if (N == 6)
            System.out.println("Hoy es S�bado");
        else if (N == 7)
            System.out.println("Hoy es Domingo");
        else
            System.out.println("N�mero no v�lido");
    }
	}
