package estructurasdecontrol;

import java.util.Scanner;

public class NumeroEntero {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero para evaluar");
		int numero = entrada.nextInt();
		
		
		if(numero < 0)
		{
			System.out.println("El numero que has introducido es menor que 0");
			
		}
		
		else if(numero > 0)
		{
			System.out.println("El numero que has introducido es mayor que 0");
		}
		
		else if(numero == 0)
		{
			System.out.println("El numero que has introducido es igual a 0");
		}
		
		
	}

}
