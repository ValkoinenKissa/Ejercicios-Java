package algoritmos;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		//Bucle for que realize el sumatorio de un numero y almacenamos en acum
		int acum = 0;
		System.out.print("La sumatoria de 1 + 2 + 3 + ... + 10 es: ");
		
		for (int i = 1; i<= 10; i++ ) {
			acum += i;
			System.out.print(i);
			
			if (i < 10) {
				System.out.print("+");
			}
		}
		
		System.out.println(" = " + acum);

	}

}
