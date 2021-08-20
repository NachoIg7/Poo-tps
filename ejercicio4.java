package tp2;



public class ejercicio4 {
	public static void main (String[]args) {

	int [] numeros = {4,2,3,8,1};
	System.out.println("En el vector tenemos " + numeros.length + " numeros");
	
	int mayor = numeros[0];
	float suma = 0;
	for (int x= 0; x < numeros.length; x++) {
		if (numeros[x] > mayor) {
			mayor = numeros [x];
			
		}
		
		suma = suma + numeros[x];
	}
	
	System.out.println("el mayor es: " + mayor);
	System.out.println("la suma es: "+ suma);
	float promedio = suma / numeros.length;
	System.out.println(" el promedio es : " + promedio);
		
		
		
		
		
		
	}
	
	
	
	
	
}