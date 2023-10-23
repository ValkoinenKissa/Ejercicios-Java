package estructurasdecontrol;
import java.util.Scanner;
public class ConjuntoNumeros {
/*
 * (ConjuntoNumeros.java) Realizar un pseudocódigo que determine de un
 *  conjunto de 6 números introducidos por teclado cuántos son menores que 15,
 *  cuántos mayores de 55 y cuántos están comprendidos entre 45 y 55.
 */
	public static void main(String[] args) 
	{
			Scanner entrada = new Scanner(System.in);
			//Contadores
			
			int contMenores15 = 0;
			int contMayores55 = 0;
			int contEntre45y55 = 0;
			System.out.println("Introduce los numeros que quieres comparar");
			for(int i = 1; i<= 6; i++) 
			{
				
				int numero = entrada.nextInt();
				if (numero < 15) {
					contMenores15++;
				}
				else if (numero > 55) {
					contMayores55++;
				}
				else if (numero >= 45) {
					contEntre45y55++;
				}
					
			}
			
			
			
			System.out.println("Los numeros menores de 15 son: " + contMenores15);
			System.out.println("Los numeros mayores de 55 son: " + contMayores55);
			System.out.println("Los numeros entre 45 y 55 son: " + contEntre45y55);
		}

	}

