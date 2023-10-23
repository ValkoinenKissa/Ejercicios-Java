package estructurasdecontrol;

import java.io.IOException;

public class DistintosSNBooleano {

	public static void main(String[] args) throws IOException 
	{
		char respuesta;
		//Declaramos una variable booleana
		boolean respuestaValida;
		System.out.println("Introduce un caracter, sin introduces s/n saldras del"
				+ " bucle: ");
		
		do {
			//Guardamos en memoria la respuesta
			respuesta = (char) System.in.read();
			//Limpiar el buffer
			System.in.skip(2);
			//Nos planteamos cuando la respuesta es valida
			respuestaValida = (respuesta == 's' || respuesta == 'n');
			//Despues de guardar la respuesta comprobamos si es correcta
			if(!respuestaValida)
				System.out.println("La respuesta no es correcta, teclea una s o una n");
		} while (!respuestaValida);
		System.out.println("El programa ha finalizao");
	}

}
