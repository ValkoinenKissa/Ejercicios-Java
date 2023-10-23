package estructurasdecontrol;
import java.util.Scanner;

public class BucleDivisor {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int n;
		int divisor;
		
		System.out.println("Introduce un valor por pantalla");
		n = entrada.nextInt();
		divisor = n;
		System.out.println("Los divisores son:");
		
		while (divisor > 0) {
			if ((n % divisor) == 0)
				System.out.println(divisor);
			
			divisor--;
		}
		
		
	}

}
