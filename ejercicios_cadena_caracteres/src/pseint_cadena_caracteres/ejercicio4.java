package pseint_cadena_caracteres;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena= "Esto es una cadena para contar las vocales";
		int a=0,e=0,i=0,o=0,u=0;
		
		for (int x = 0; x<cadena.length(); x++) {
			char actual = cadena.toLowerCase().charAt(x);
		switch (actual) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
				default:
					break;
		}
	}
		System.out.println("Total de vocales: " + (a+e+i+o+u));

		System.out.println("Cantidad de a: " + a);
		System.out.println("Cantidad de e: " + e);
		System.out.println("Cantidad de i: " + i);
		System.out.println("Cantidad de o: " + o);
		System.out.println("Cantidad de u: " + u);
	}

}
