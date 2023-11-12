package estructuras_control_flujo;
/*
 *  Introduce una frase por teclado mientras el carácter introducido sea distinto de enter ‘\n’ e
 *  imprime en pantalla la frase introducida.
 */
import java.io.IOException;

public class IntroduceUnaFrase_mientras_no_enter {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Introduce un caracter y finaliza con enter");
		
		char car =(char)System.in.read();
		while(car != '\n') {
			System.out.println("El caracter introducido es: " + car);
			car =(char)System.in.read();

			
		}
		
		System.out.println("Fin del programa");
		
	}

}
