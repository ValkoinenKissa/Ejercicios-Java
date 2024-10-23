package estructuras_control_flujo;
import java.util.*;

public class MCD {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Este programa calcula el MCD de dos numeros");
		System.out.println();
		
		System.out.println("Introduce el primer numero: ");
		int num1 = entrada.nextInt();
		System.out.println();
		System.out.println("Introduce el segundo numero: ");
		int num2 = entrada.nextInt();
				
		while(num1 != num2) {
			
			if(num1 > num2)
				num1 = num1 - num2;
			
			else
				num2 = num2 - num1;
			
		}
		
		
		System.out.println("El mcd de los numeros introducidos es: " +  num1);
}
	
}
