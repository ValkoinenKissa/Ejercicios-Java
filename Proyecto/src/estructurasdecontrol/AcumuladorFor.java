package estructurasdecontrol;

import java.util.Scanner;

public class AcumuladorFor {

	public static void main(String[] args) 
{
		{
			// Introducimos por teclado el numero
				Scanner entrada = new Scanner(System.in);
				System.out.println("Introduce un numero entero");
				int numero = entrada.nextInt();
				// Declaramos los acumuladores y los inicializamos
				
				int suma = 0;
				int multiplicacion = 1;
				/* Elegimos la estructura repetitiva
				 * Como conocemos el numero de iteraciones vamos a utilizar un for
				 */
				
				for (int contador = 1; contador <= numero; contador++) {
					
					suma = suma + contador;
					multiplicacion = multiplicacion * contador;
					
				}
				
				// Enviamos a pantalla los resultados
				System.out.println("Suma=" + suma + "\nMultiplicación= " + multiplicacion);
		
}

}
}
