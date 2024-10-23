package estructuras_control_flujo;
import java.util.*;
public class VisualizaSiNumEsEntero {
	public static void main(String[] args) {
		
		//Introduce por pantalla un numero y visualiza si es par o no
		
		int numero = introNumero();
		boolean verifica = verificaImpar(numero);
		imprimeResultados(verifica);
		
	}
	
	/////////////////////////////////////////////////
	
	public static int introNumero() {
		int num=0;
		System.out.println("Introduce un numero");
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		return num;
		
	}
	
	//////////////////////////////////////////////////
	
	//Verifica con esta funcion si el numero es par o no
	
	public static boolean verificaImpar(int num) {
		boolean esPar = num % 2 == 0;
		return esPar;
		
	}
	
	public static void imprimeResultados(boolean esPar) {
		String mensaje = esPar ? "El numero que has introducido es par" : "El numero que has introducido no es par";
		System.out.println(mensaje);
	}

}
