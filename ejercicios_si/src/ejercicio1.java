import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Declaración de variables
		int n1;
		int n2;
		
		//Pedimos los numeros al usuario
		
		System.out.print("Introduce dos numeros para comprobar si son iguales: \n");
		
		n1 = in.nextInt();
		n2 = in.nextInt();
		
		//Hacemos la compraraciones necesarias para saber si son iguales
		
		if (n1==n2)
		{
			System.out.print("El numero 1: "+n1+" y el numero 2: "+n2+" son iguales");
		}else
		{
			System.out.print("El numero 1 no es igual al numero 2");
		}
		
	}

}
