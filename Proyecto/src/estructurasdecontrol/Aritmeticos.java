package estructurasdecontrol;

import java.util.Scanner;

/**
 * Este programa va a realizar operaciones basicas de suma,
 * resta, multiplicación, división.
 * 
 * @author abollorodriguez
 * fecha:14/09/23
 */
public class Aritmeticos 
{

	public static void main(String[] args) 
	{
		
		/*Variables que necesitamos
		num1
		num2
		*/
		// creamos un objeto Scanner para introducir los numeros
		Scanner entrada = new Scanner(System.in);
		//Sentencia de salida
		System.out.println("Introduce num1:");
		//Alamacenamos en memoria el contenido introducido por el usuario
		double num1 = entrada.nextDouble();
		System.out.println("Introduce num2:");
		//Alamacenamos en memoria el contenido introducido por el usuario
		double num2 = entrada.nextDouble();
		//Suma de valores solo es necessario declarar la variable una vez ya que el programa es secuencial
		double resultado = num1 + num2;
		System.out.println("La suma de" + num1 +" y " + num2 + "es" + resultado);
		
		resultado = num1 - num2;
		System.out.println("La resta de" + num1 +" y " + num2 + "es" + resultado);
		
		resultado = num1 * num2;
		System.out.println("La resta de" + num1 +" y " + num2 + "es" + resultado);
		
		resultado = num1 / num2;
		System.out.println("La división de" + num1 +" y " + num2 + "es" + resultado);

	}

}
