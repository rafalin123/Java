package ejercicios_cadenastexto;

public class ejemplo_indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ejemploString =new String("Hola como estas en america");

        int totalCharacters = 0;
        char temp;
        for (int i = 0; i < ejemploString.length(); i++) {

            temp = ejemploString.charAt(i);
            if (temp == 'a')
                totalCharacters++;
        }

        System.out.println("Aparecen a: " + totalCharacters + " veces");
	}

}
