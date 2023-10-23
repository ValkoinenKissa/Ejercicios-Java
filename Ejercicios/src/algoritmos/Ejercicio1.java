package algoritmos;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaramos un objeto scanner para leer los valores por pantalla
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce dos valores por pantalla \n ");
		System.out.println("Introduce el primer valor: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo valor");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + "Es el numero mayor");
		}
		
		else {
			System.out.println(num2 + " Es el numero mayor");
		}
		
		sc.close();

	}

}
