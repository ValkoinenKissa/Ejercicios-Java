package estructuras_control_flujo;

import java.io.IOException;

public class IntroRespuestasBoolean {

	public static void main(String[] args) throws IOException {

		arrancaPrograma();
		
	}
	
	public static void arrancaPrograma() throws IOException {
		System.out.println("Introduce una respuesta, si es distina que s o n, el programa se ejecutara de nuevo.");
		char respuesta;
		respuesta = (char)System.in.read();
		System.in.skip(1);
		boolean salir =true;
		 do {
				respuesta = (char)System.in.read();
				System.in.skip(1);
				if (salir = respuesta != 's' && respuesta !='n'); {
				System.err.println("Error, tu respuesta es dintina a 's' o 'n', intenya de nuevo: ");
				}

		
		}while(salir);
		 
		System.out.println("Has abandonado el programa correctamente!!");

	}
	

}
