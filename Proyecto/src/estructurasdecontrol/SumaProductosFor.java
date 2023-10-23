package estructurasdecontrol;

public class SumaProductosFor {

	public static void main(String[] args) 
	{
/*
 * Necesitamos una variable contador que se sume a un numero que se incremente
 * e imprima el resultado
 */
		int suma = 0;
		int numero = 5;
		for(int contador = 1; contador <= numero; contador++) {
			suma = suma + contador;
					
		}
		System.out.println("La suma es: " + suma);
	}

}
