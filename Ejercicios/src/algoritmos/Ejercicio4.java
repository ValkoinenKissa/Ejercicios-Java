package algoritmos;
import java.util.Scanner;

/*
 * Este programa determina la hipotenusa de un triangulo-rectangulo
 * para ello trabajaremos con 4 variables y cojeremos por pantalla los
 * catetos del triangulo para calcular la hipotenusa
 */

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
	//Declaramos las variables de los catetos
		
		int cateto1, cateto2;
		
	//Declaro un scanner para leer por pantalla
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Usuario, introduce el primer cateto: ");
		cateto1 = sc.nextInt();
		System.out.println("Usuario, introduce el segundo cateto: ");
		cateto2 = sc.nextInt();
		
		// Verificar si los valores ingresados son válidos
		if (cateto1 <= 0 || cateto2 <= 0) {
			System.out.println("Las longitudes de los catetos deben ser números positivos.");
		} 
		
		else {
		
	//Construimos la algoritmia para calcular la hipotenusa
		
		int catetoResult = cateto1 * cateto1 + cateto2 * cateto2;
		
		int calcRaiz = (int)Math.sqrt(catetoResult);
		
		System.out.println("La hipotenusa de los catetos" + " " + cateto1 
				+ " "  + "y" + " " +   cateto2 + " "  + 
				"es: " +  calcRaiz);
	
		sc.close();
		}
	}

}
