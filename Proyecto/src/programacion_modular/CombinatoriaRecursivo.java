package programacion_modular;

import java.util.Scanner;

public class CombinatoriaRecursivo 
{
	public static void main(String[] args)
	{
		// Pedimos M
		int m = pedirM();
		// Pedimos N
		int n = pedirN(m);
		// Calcular combinaciones
		int combinaciones = calcularCombinaciones(m, n);
		//imprimimos el resultado
		imprimirResultado(m, n, combinaciones);
		
	}
	
	// Función para pedir M
	
	public static int pedirM() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el valor de m: ");
		// Mientras m no sea válida volvemos a pedir el número
		boolean mValida = false;
		int m = 0;
		while (!mValida) {
			m = scan.nextInt();
			mValida = m >= 0;
			if (!mValida)
				System.out.println("M no es válida, tiene que ser mayor o igual que cero");
		}
		return m;
	}
	
	// Función para pedir N
	
	public static int pedirN (int m) {
		System.out.println("Introduce el valor de n: ");
		Scanner scan = new Scanner(System.in);
		int n = 0;
		boolean nValida = false;
		while (!nValida) {
			n = scan.nextInt();
			nValida = n >= 0 && n <= m;
			if (!nValida)
				System.out.println("N no es válida, tiene que ser mayor o igual que 0 y menor o igual que m");
		}
		return n;
	}
	
	// Función para calcular combinaciones
	
	public static int calcularCombinaciones(int m, int n) {
		return factorial(m)/(factorial(n) * factorial(m - n));
	}
	
	// Función para calcular factorial
	
	public static int factorial (int num) 
	{
		if(num == 0)
			return 1;
		return num * factorial(num-1);
	}
	
	// Función para imprimir resultado
	
	public static void imprimirResultado (int m, int n, int resultado) {
		System.out.println("Las combinaciones " + m + " y " + n + " es " + resultado);
	}
}
