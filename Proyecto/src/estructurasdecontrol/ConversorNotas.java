package estructurasdecontrol;
import java.io.IOException;
import java.util.Scanner;

public class ConversorNotas {

	public static void main(String[] args) throws IOException
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una calificación alfabetica para transformarla a "
				+ "numerica");
		
		char notaCaracter = (char)System.in.read();
		int NotaNumerica = 0;
		
		switch (notaCaracter)
		{
		
			case 'I':
				NotaNumerica = 4;
			    break;
			    
			case 'F':
				NotaNumerica = 5;
			    break;
			case 'B':
				NotaNumerica = 6;
			    break;
			case 'N':
				NotaNumerica = 7;
			    break;
			case 'S':
				NotaNumerica = 9;
			    break;
		}
		
		if ( NotaNumerica > 0 )
		System.out.println("La nota es " + NotaNumerica);
		else
		System.out.println("Error");
		
	}
	

}
