package estructuras_control_flujo;

import java.io.IOException;

public class PrintAbecedario {
	public static void main(String[] args) throws IOException {
		System.out.println("Imprime en pantalla las letras que van desde la ‘A’ hasta la ‘Z’ ");
		System.out.println();
		
		System.out.println("Imprimiendo abecedario");
		System.out.println();

		for(char letra = 'A'; letra <= 'Z'; letra++) {
			System.out.print(letra + " ");
		}
		System.out.println();
		System.out.println("Imprimiendo abecedario numerico");

		for(int num = 'A'; num <='Z'; num++) {
			System.out.print(num + " ");
		}
		
		
	}
}
