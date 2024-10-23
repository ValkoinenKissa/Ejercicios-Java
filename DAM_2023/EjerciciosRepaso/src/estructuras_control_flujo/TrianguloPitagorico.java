package estructuras_control_flujo;
import java.util.*;
public class TrianguloPitagorico {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce el numero de la altura de el triangulo: ");
		int altura = entrada.nextInt();
		
		for(int i = 1; i <= altura; i++) {
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");

			}
			
			System.out.println();
			
		}
		
	}
}