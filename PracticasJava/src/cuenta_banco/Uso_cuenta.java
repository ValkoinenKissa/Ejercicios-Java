package cuenta_banco;
import java.util.*;
public class Uso_cuenta {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		Cuenta account1 = new Cuenta("Alberto", 500);
		
		System.out.println(account1.toString());
			
		System.out.println("Introduce la cantudad que quieres ingresar en la cuenta: ");
		
		int cantidadIngreso = entrada.nextInt();
		account1.ingresar(cantidadIngreso);
		
		
		System.out.println("******************************************************************");

		System.out.println("La cantidad de dinero en la cuenta es de: " + account1.getCantidad());
		
		System.out.println("******************************************************************");

		System.out.println("Introduce la cantudad que quieres retirar de la cuenta: ");
		int cantidadRetirada = entrada.nextInt();
		account1.reintegro(cantidadRetirada);
		
		System.out.println("******************************************************************");
		
		System.out.println("La cantidad de dinero en la cuenta es de: " + account1.getCantidad());
		
		System.out.println("******************************************************************");

		
		
	}

}
