package prueba;
import java.util.Scanner;

public class ejercicio2 {
	public static void main(String args[]) {
	try (Scanner entrada = new Scanner (System.in)) {
		int num1;
		int num2;
		int num3;
		int operacion;
		String opcion;
		boolean respuesta = false;
		
		System.out.println("¿Listo para empezar la cuenta?(si/no)");
		opcion = entrada.next();
		
		if (opcion.equals("si")) {
			respuesta = true;
		}else if (opcion.equals("no")) {
			respuesta = false;
		}
		
		
	while (respuesta == true);{
			
		System.out.println("Escriba el primer numero");
		num1 = entrada.nextInt();
		System.out.println("Escriba el segundo numero");
		num2 = entrada.nextInt();
		System.out.println("Escriba el tercer numero");
		num3 = entrada.nextInt();
		
		if (num1 > 0) {
		operacion = (num2 * num3);
		System.out.println("La multiplicacion del segundo y tercer numero es: " + operacion);
		}else {operacion = (num2 + num3);
			System.out.println("La suma del segundo y tercer numero es: " + operacion);
		}
	
		System.out.println("¿Volver a hacer la cuenta?(si/no)");
		opcion = entrada.next();
		if (opcion.equals("si")) {
			respuesta = true;
		}else if (opcion.equals("no")) {
			respuesta = false;
		}

		}
	System.out.println("salimo");
	}
}
}