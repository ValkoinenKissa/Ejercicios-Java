package programacion_modular;
import java.util.*;
public class PotenciaRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base =pedirBase();
		int exp = pedirExponente();
		int resultado = potencia(base, exp);
		verResultado(base, exp, resultado);

	}
	
	
	/////////////////////////////////////////////////////////
	
	public static int pedirBase(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base: ");
		return sc.nextInt();
	}
	
	
	////////////////////////////////////////////////////////
	
	public static int pedirExponente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el exponente: ");
		return sc.nextInt();
	}
	
	
	///////////////////////////////////////////////////////
	
	public static int potencia (int base, int exp) {
		
		if(exp == 0) {
			return 1;
		}
		
		return base * potencia(base,exp -1);
		
	}
	
	////////////////////////////////////////////////
	public static void verResultado(int base, int exp, int resultado) {
		System.out.println("La potencia de " + base +  " elevada a " + exp + " es " + resultado);
	}

}
