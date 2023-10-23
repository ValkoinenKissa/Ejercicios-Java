package estructurasdecontrol;
import java.io.IOException;

public class VerFraseHastaEnter {

	public static void main(String[] args) throws IOException
	{
		System.out.println("Introduce una frase, pulsa un enter para terminar");
		
		char caracater = (char)System.in.read();
		
		while (caracater != '\n') {
			
			System.out.println("El caracter que has introducido es:" + caracater);
			 caracater = (char)System.in.read();
		}
		
		System.out.println("El bucle ha finalizado");
	}

}
