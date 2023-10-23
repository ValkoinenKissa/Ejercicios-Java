package estructurasdecontrol;
import java.util.Scanner;

public class BucleIntroDatos {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un valor por pantalla");
		
		
		int n = entrada.nextInt();
		int i = 0;
		
		System.out.println("El valor que has introducido por pantalla es el" + n);
		
		while (i <= 10) {
			System.out.println(n + " x " + i + " = " + (n*i));
			i++;
		}
		
	}

}
