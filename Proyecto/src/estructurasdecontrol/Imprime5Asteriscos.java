package estructurasdecontrol;
import java.io.IOException;
import java.util.Scanner;

public class Imprime5Asteriscos {

	public static void main(String[] args) throws IOException 
	{
		/*
		 * Necesitamos 3 variables:
		 * Una que guarde el caracter que voy a imprimir
		 * Otra que guarde el numero de repeticiones del caracter
		 * la ultima que controle el bucle for
		 * 
		 */
		 // Introducimos el numero de repeticiones
		// Creamos un objeto de tipo Scanner
		Scanner entrada = new Scanner(System.in);
		//Introducimos por teclado el numero de repeticiones
		System.out.println("Introduce el numero de repeticiones");
		int repeticiones = entrada.nextInt();
		System.out.println("Introduce el caracter");
		//Introducimos por teclado el caracter
		char caracter = (char)System.in.read();
		//Imprimimos en pantlla el caracter las veces que pide el usuario
		for(int i = 1; i <= repeticiones; i++ ) {
			System.out.println(caracter);
		}
	}
	

}
