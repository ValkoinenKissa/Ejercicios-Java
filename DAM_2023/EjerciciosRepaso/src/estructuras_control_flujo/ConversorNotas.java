package estructuras_control_flujo;

import java.io.IOException;

public class ConversorNotas {
	public static void main(String[] args) throws IOException {
		
		char notaCarater = introCaracter();
		int notaNumerica = conversionNum(notaCarater);
		imprimeResultado(notaNumerica);
		
	}
	
	///////////////////////////////////////
	
	public static char introCaracter() throws IOException {
		char caracter;
		System.out.println("Introduce la calificación alfabetica");
		caracter = (char)System.in.read();
		System.in.skip(2);
		return caracter;
		
		
	}
	
	////////////////////////////////////////////////////////
	
	
	public static int conversionNum(char caracter) {
		int codNumerico=0;
		if(caracter == 'I') {
			codNumerico = 4;
		}
		
		else if(caracter == 'F') {
			codNumerico = 5;
		}
		
		else if(caracter == 'B') {
			codNumerico = 6;
		}
		
		else if(caracter == 'N') {
			codNumerico = 7;
		}
		
		else if(caracter == 'S') {
			codNumerico = 9;
		}
		
		return codNumerico;
	}
	
	public static void imprimeResultado(int codNumerico) {
		System.out.println("La nota numerica del caracter introducido corresponde a: " + codNumerico);
	}
	

}
