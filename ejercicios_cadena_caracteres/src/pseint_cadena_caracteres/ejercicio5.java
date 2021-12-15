package pseint_cadena_caracteres;

import java.util.StringTokenizer;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "En un lugar de la mancha";
		
		StringTokenizer st = new StringTokenizer(texto);
		
		System.out.println (st.countTokens());
	}

}
