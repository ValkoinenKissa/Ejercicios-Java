package estructurasdecontrol;

import java.util.Scanner;
/**
 * Introducimos un numero entero por teclado y visualizamos si es par o impar
 * @author abollorodriguez
 *
 */

public class ParImpar {

	public static void main(String[] args) 
	{

	//Variables que necesitamos
	Scanner entrada = new Scanner(System.in);
	//Guardamos el numero que introducimos por teclado en memoria
	System.out.println("Introduce un numero entero para valorar si es par o no");
	int numero = entrada.nextInt();
	//Evaluamos el contenido del numero que hemos introducido
	if (numero % 2 == 0)
		System.out.println(numero + "\tEs par");
	else
		System.out.println(numero + "\tNo es par");

	}

}
