package estructurasdecontrol;
import java.util.Scanner;
/**
 * Este programa visualiza en pantalla, la suma y multiplicación desde
 * uno a un numero que introducimos por teclado
 * @author abollorodriguez
 *
 */
public class Acumulador {

	public static void main(String[] args)
	{
	// Introducimos por teclado el numero
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		int numero = entrada.nextInt();
		// Declaramos los acumuladores y los inicializamos
		
		int suma = 0;
		int multiplicacion = 1;
		int contador = 1;
		// Elegimos la estructura repetitiva
		
		while(contador <= numero) {
			
			suma = suma + contador;
			multiplicacion = multiplicacion * contador;
			contador++;
			
		}
		
		// Enviamos a pantalla los resultados
		System.out.println("Suma=" + suma + "\nMultiplicación= " + multiplicacion);
		
	}

}
