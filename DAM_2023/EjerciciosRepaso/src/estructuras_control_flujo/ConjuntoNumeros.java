package estructuras_control_flujo;
import java.util.*;
/*
 * Realizar un pseudocódigo que determine de un
 * conjunto de 6 números introducidos por teclado cuántos son menores que 15,
 * cuántos mayores de 55 y cuántos están comprendidos entre 45 y 55.
 */
public class ConjuntoNumeros {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce 6 numeros para comprobar son menores que 15,\r\n"
				+ "cuántos mayores de 55 y cuántos están comprendidos entre 45 y 55:");
		
		
		int contador =1;
		int resultado=0;
		int numMenor15=0;
		int numEntre45Y55=0;
		int numMayor55=0;
		for(int i =0; i<6; i++) {
			System.out.println("Introduce el numero " + contador);
			resultado = entrada.nextInt();
			contador++;
			if(resultado <15) {
			numMenor15++;
			}
			else if(resultado >=45 && resultado <=55) {
				numEntre45Y55++;
			}
			
			else if(resultado >55) {
				numMayor55++;
			}
			
		}
		
		System.out.println("Los numeros menores de 15 son :" + numMenor15);
		
		System.out.println("Los numeros entre 45 y 55 son : " + numEntre45Y55);
		
		System.out.println("Los numeros mayores de 55 son : " + numMayor55);
		
	}

}
