package ejercicios_mientras;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int pass;
	
	do {
		System.out.println("Dime tu clave de acceso: ");
		pass = in.nextInt();
		if (pass!=1234) {
			System.out.println("Clave incorrecta.");
		}
	}while(pass!=1234);
	
	System.out.println("Bienvenido!!!");
}
}