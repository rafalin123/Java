import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Declaracion de variables
		int n1;
		int n2;
		int aux;
		
		aux=0;
		//Pedimos datos al usuario
		System.out.print("Introduce el primer numero: ");
		n1 = in.nextInt();
		System.out.print("\nIntroduce el segundo numero: ");
		n2 = in.nextInt();
		
		//Comprobamos si son positivos para contarlos
		
		if (n1 >0 && n2 >0)
		{
			aux=aux+2;
			System.out.print("Los numeros que son positivos son: "+aux);
		}else
		{
			if (n1>0 || n2>0)
			{
				aux=aux+1;
				System.out.print("Los numeros que son positivos son: "+aux);
			}else
			{
				System.out.print("Ninguno de los dos numeros es positivo.");
			}
		}
				
	}

}
