package estructuras_control_flujo;
import java.util.*;
public class VisualizaPorPantalla_0_mayor_0_menor {
	public static void main(String[] args) {
		int numero = introNumero();
		validaNumero(numero);
		
	}
	
	/////////////////////////////////////////////////
	
	public static int introNumero() {
		System.out.println("Introduce un numero para comprobar si es mayor, menor o igual"
				+ " que 0");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		return num;
	}
	
	//////////////////////////////////////////////////////////
	
	public static void validaNumero(int num){
		if(num == 0) {
			System.out.println("El numero es 0");
		}
		else if(num > 0) {
			System.out.println("El numero es mayor que 0");
		}
		
		else {
			System.out.println("El numero es menor que 0");
		}
	}
	
}
