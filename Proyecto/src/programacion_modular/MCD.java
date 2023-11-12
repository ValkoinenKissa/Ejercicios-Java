package programacion_modular;

import java.util.Scanner;

public class MCD {

	public static void main(String[] args) 
	{
		//Introducimos por teclado los números
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el primer número:");
		int num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número:");
		int num2 = sc.nextInt();
		
		// Calculamos el MCD
		while (num1 != num2)
		{
			if(num1 >  num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
			
		}
		//Enviamos la pantalla al resultado
		System.out.println(" El MCD es " + num1);
		

	}

}
