package estructuras_control_flujo;

import java.io.IOException;

public class cuenta_palabras {
	
	public static void main(String[]args) throws IOException {
		int palabras = 0;
		System.out.println("Introduce las palabras: ");
		char caracter = (char) System.in.read();
		boolean finPalabra = true;

		while (caracter != '.') {
			if (finPalabra == true && caracter != ' ') {
				palabras ++;
				finPalabra = false;
			} else if (caracter == ' ') {
				finPalabra = true;
			}
			caracter = (char) System.in.read();
		}
		System.out.println("Número de palabras: " + palabras);
	}
	
}
