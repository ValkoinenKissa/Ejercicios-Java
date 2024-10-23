/*
 * Este programa debe de leer 3 valores introducidos por el usuario
 * y determinar cual de todos es el mayor, ademas nos debemos asegurar que
 * los tres valores introducidos por teclado son distintos
 *
 */

package algoritmos;
import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main (String[] args) {
		//Tengo que declarar en primer lugar un objeto scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Ahora procedere a declarar tres variables las cuales almacenen un int
		
		int  a, b, c;
		
		System.out.println("Hola usuario, introduce tres numeros "
				+ "para determinar cual son los mayores y los menores");
		
		System.out.println("Introduce el primer valor: ");
		a = sc.nextInt();
		System.out.println("Introduce el segundo valor: ");
		b = sc.nextInt();
		System.out.println("Introduce el tercer valor: ");
		c = sc.nextInt();
		
		//Una vez hayamos introducido los datos en el programa los evaluamos
		//Primero realizamos la verificacion de que los valores dados son diferntes
		
		while (a == b || b == c || c == a) {
			System.out.println("Algunos de los numeros introducidos son iguales"
					+ " introducelos de nuevo \n");
			
			System.out.println("Introduce el primer valor: ");
			a = sc.nextInt();
			System.out.println("Introduce el segundo valor: ");
			b = sc.nextInt();
			System.out.println("Introduce el tercer valor: ");
			c = sc.nextInt();
			
			//Ahora creamos estructura condicional que verifique que numero el el mayor
			//o menor
		}
		
		int mayor, menor;

		if (a >= b && a >= c) {
			mayor = a;
		}
		
		else if (b >= a && b >= c) {
			mayor = b;
		}
		
		else {
			mayor = c;
			
		}
		
		if (a <= b && a <= c) {
			menor = a;
		}
		
		else if (b <= b && a <= c) {
			menor = b;
		}
		
		else {
			menor = c;
	
		}
		
		//Imprimimos los resultados por pantalla
		
		System.out.println("El mayor de los numeros es:" + mayor);
		System.out.println("El menor de los numeros es:" + menor);
		//Cerramos el scanner
		sc.close();

	}

}
