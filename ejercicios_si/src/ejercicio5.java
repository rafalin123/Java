import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Declaracion de variables
		int n1, n2, n3;
		
		//Pedimos datos al usuario
        System.out.print("Introduzca primer número: ");
        n1 = in.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = in.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = in.nextInt();
        
        //Comprobamos y mostramos por pantalla
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);                                             
            } else {
                System.out.println("el mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("el mayor es: " + n2);
        } else {
            System.out.println("el mayor es: " + n3);
        }
	}
}
