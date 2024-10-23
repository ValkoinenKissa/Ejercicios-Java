package experimentos;
import java.util.*;

public class AdivinaNumero {
	
	public static void main(String[] args) {
		
		int aleatorio=(int)(Math.random()*100);
		
		Scanner sc = new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
	do {
			intentos++;
			System.out.println("Introduce un numero por favor");
			
			numero = sc.nextInt();
			
			if(aleatorio < numero) {
				System.out.println("Mas bajo");
			}
			
			else if(aleatorio > numero) {
				System.out.println("Mas alto");
			}
		}while(numero!=aleatorio); 
		System.out.println("Correcto, has adivinado el numero y has utilizado " 
		+ intentos + " intentos");
		
		sc.close();
	}

}
