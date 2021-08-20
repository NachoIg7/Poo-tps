package prueba;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.println("Ingrese una palabra");
	String palabra,palabraInvertida;
	palabra = teclado.nextLine();
	palabraInvertida="";
	
	for (int x=palabra.length()-1; x>=0;x--)
		palabraInvertida = palabraInvertida+ palabra.charAt(x);
	
	System.out.println(palabraInvertida);
	
	if (palabra.equals(palabraInvertida)) {
		System.out.println("la palabra es palindromo");
	}
	else {
			System.out.println("la palabra no es palindromo");
	}

		
		
		
		
		
		
		
		
		
	}

}
