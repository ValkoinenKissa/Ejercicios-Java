package estructurasdecontrol;
import java.io.IOException;
import java.util.Scanner;

public class DistintoDeSyN {

	public static void main(String[] args) throws IOException 
	{
		//Declaramos una variable respuesta
		
		char respuesta;
		System.out.println("Introduce un caracter, sin introduces s/n saldras del"
				+ " bucle: ");
		
		do {
			//Guardamos en memoria la respuesta
			respuesta = (char) System.in.read();
			//Limpiar el buffer
			System.in.skip(2);
			//Despues de guardar la respuesta comprobamos si es correcta
			if(respuesta != 's' && respuesta != 'n')
				System.out.println("La respuesta no es correcta, teclea una s o una n");
		} while (respuesta != 's' && respuesta != 'n');
	}

}
