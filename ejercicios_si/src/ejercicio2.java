import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Declaracion de variables
		
		int n1;
		
		//Pedimos los datos al usuario
		
		System.out.print("Introcude un numero: \n");
		
		n1 = in.nextInt();
		
		//Comparamos la variable
		
		if (n1 >= 10)
		{
			System.out.print("El numero introducido es mayor o igual de 10");
		}else
		{
			System.out.print("El numero introducido es menos de 10");
		}
	}

}
