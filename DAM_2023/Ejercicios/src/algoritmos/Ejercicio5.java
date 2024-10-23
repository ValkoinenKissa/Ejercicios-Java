package algoritmos;
import java.util.Scanner;
/*
 *Desarrolle un algoritmo que permita determinar el área y volumen 
 *de un cilindro
 *dado su radio (R) y altura (H). R y H deberán ser leídos por teclado
 */

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		//Declaramos objeto Scanner para pedir datos al usuario y creamos vars
		
		Scanner sc = new Scanner(System.in);
		
		int radio, altura;
		
		System.out.println("Usuario introduce el radio del cilindro");
		radio = sc.nextInt();
		
		System.out.println("Usuario, ahora introduce la altura del cilindro");
		altura = sc.nextInt();
		
		//Comprobamos que los datos introducidos sean correctos
		
		if (radio <=0 || altura <=0) {
			System.out.println("Los datos introducidos no son correctos, revisalos");
		}
		
		else {
			
		
		/*
		 * Una vez tenemos los datos introducidos por pantalla en una variable
		 * desarrllamos la algoritmia del programa y declaramos mas variable
		 */
		
		
		//Declaramos una contante con el numero pi ya que lo necestamos
		
		final float numeroPi = 3.14159F;
		
		float areaSuperficial = 2 * numeroPi * radio * radio + 2 * numeroPi * radio * altura;
		
		//Ahora declaramos las variables necesarias para calcular el volumen
		
		float volumenCilindro = numeroPi * radio * radio * altura;
		
		System.out.printf("El area superficial del cilindro es: " + "%1.2f", areaSuperficial);
		System.out.println();
		System.out.printf("Y el volumen del cilindro es: " + "%1.2f", volumenCilindro);
		
		
		sc.close();
		}
		
	}

}
