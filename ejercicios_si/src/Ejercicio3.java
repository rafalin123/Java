import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Declaracion de variables
		
		int n1;
		
		//Pedimos datos al usuario
		
		System.out.print("Introduce un numero para saber si es negativo, positivo o 0: \n");
		
		n1 = in.nextInt();
		
		//Comparamos los datos Y MOSTRAMOS EL RESULTADO POR PANTALLA
		
		if (n1==0)
		{
			System.out.print("El numero introducido es 0.");
		}else
		{
			if (n1>0)
			{
				System.out.print("Este numero es positivo");
			}else
			{
				System.out.print("Este numero es negativo");
			}
		}

	}
}
