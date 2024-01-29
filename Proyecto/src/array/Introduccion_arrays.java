package array;

public class Introduccion_arrays {
	public static void main (String[]args) {
		int num = 5 ;
		//System.out.println(num);
		
		int[] numeros = new int[5];
		
		numeros [0] = 7;
		numeros [1] = 14;
		numeros [2] = 28;
		numeros [3] = 56;
		numeros [4] = 112;
		
		int inicial=7;
		System.out.println("Asignar valores:");
		for(int i = 0 ; i < numeros.length ; i++) {
			numeros[i]=inicial*i;
		}
		
		System.out.println("RECORRER ARRAY:");
		for(int i = 0 ; i < numeros.length ; i++) {
			System.out.println(numeros [i]);
		}
		
	
		
		
		System.out.println(numeros);
		System.out.println(numeros.length);
		System.out.println(numeros [0]);
		System.out.println(numeros [1]);
		System.out.println(numeros [2]);
		System.out.println(numeros [3]);
		System.out.println(numeros [4]);
		
		int[] numeros56 = new int[56];
		recorrerArray(numeros);
		inicializarArray(numeros56);
		recorrerArray(numeros56);
		
		
		
		
	}
	public static void mostrarNumero(int num) {
		System.out.println(num);
	}
	public static void recorrerArray(int[]numeros) {
		System.out.println("RECORRER ARRAY:");
		for(int i = 0 ; i < numeros.length ; i++) {
			System.out.println(numeros [i]);
		}
	}
	
	public static void inicializarArray(int[]numeros) {
		System.out.println("INICIALIZAR ARRAY:");
		for(int i = 0 ; i < numeros.length ; i++) {
			numeros [i]=i*2;
		}
	}
	

}