package ejercicios_segun;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = 0;
        System.out.println("Introduce un Número: ");
        N = in.nextInt();
        if (N == 1)
            System.out.println("Hoy es ENERO");
        else if (N == 2)
            System.out.println("Hoy es FEBRERO");
        else if (N == 3)
            System.out.println("Hoy es MARZO");
        else if (N == 4)
            System.out.println("Hoy es ABRIL");
        else if (N == 5)
            System.out.println("Hoy es MAYO");
        else if (N == 6)
            System.out.println("Hoy es JUNIO");
        else if (N == 7)
            System.out.println("Hoy es JULIO");
        else if (N == 8)
            System.out.println("Hoy es AGOSTO");
        else if (N == 9)
            System.out.println("Hoy es SEPTIEMBRE");
        else if (N == 10)
            System.out.println("Hoy es OCTUBLE");
        else if (N == 11)
            System.out.println("Hoy es NOVIEMBRE");
        else if (N == 12)
            System.out.println("Hoy es DICIEMBRE");
        else
            System.out.println("Número no válido");
    }
}
