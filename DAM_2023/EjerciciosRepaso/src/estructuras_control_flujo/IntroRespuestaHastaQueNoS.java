package estructuras_control_flujo;

import java.io.IOException;

/*
 *  Pide al usuario que introduzca una respuesta hasta que tecle una ‘s’ o un ‘n’. Si la respuesta es
 *  distinta de esas letras imprime un mensaje de error y vuelves a introducir la respuesta.
 */

public class IntroRespuestaHastaQueNoS {
	public static void main(String[] args) throws IOException {
		
		arrancaPrograma();
		
	}
	
	public static void arrancaPrograma() throws IOException {
		System.out.println("Introduce una respuesta, si es distina que s o n, el programa se ejecutara de nuevo.");
		char respuesta;
		respuesta = (char)System.in.read();
		System.in.skip(2);
		
		while(respuesta != 's' && respuesta !='n') {
				System.err.println("Error, tu respuesta es dintina a 's' o 'n', intenya de nuevo: ");
				respuesta = (char)System.in.read();
				System.in.skip(2);
		
		}
		System.out.println("Has abandonado el programa correctamente!!");


	}

}
