package pseint_cadena_caracteres;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner lee = new Scanner(System.in);
	        System.out.println("Ingresa tu nombre:");
	        String aux = lee.nextLine();
	        System.out.print(new StringBuilder(aux).reverse());
	}

}
