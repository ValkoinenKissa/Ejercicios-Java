package array;

import java.util.Scanner;
public class Practica_Arrays {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int[] array = {2, 13, 15, 5, 6};
		int[] array2 = {7, 8, 9, 10};
		int[][] matriz = new int[8][8];
		
		double mediaArray = calcularMedia(array);
		System.out.println("La media del contenido del array es:" + mediaArray);
		int[] arrayInvertido = invertirArray(array);
		System.out.println("Array invertido: " );
		imprimeArray(arrayInvertido);
		int[] arrayConcat = concatencacionArray(arrayInvertido, array2);
		System.out.println("La concatenacion del array es: " );
		imprimeArray(arrayConcat);
		System.out.println();
		buscarNumero(array);
		System.out.println();
		contarElemento(array);
		System.out.println();
		int[] arrayMayorFinal = encontarMayorYponerAlFinal(array);
		imprimeArray(arrayMayorFinal);


	}

	public static double calcularMedia(int[] array) {

		double acum = 0;
		for (int i = 0; i < array.length; i++) {
			acum += array[i];
		}

		return acum / array.length;

	}

	public static int[] invertirArray(int[] array) {
	    int[] arrayInverso = new int[array.length];
	    int j = 0;
	    for (int i = array.length-1; i >= 0; i--) {
	        arrayInverso[j++]=array[i];
	    }

	    return arrayInverso;
	}
	
	public static int [] concatencacionArray(int [] array, int [] array2) {
		int [] arrayConcatenado = new int [array.length + array2.length];
		
		for(int i = 0; i < array.length + array2.length; i++) {
			if(i<array.length) {
				arrayConcatenado[i] = array[i];
			}
			
			else {
				arrayConcatenado [i] =array2[i-array.length];
			}
			
		}
		return arrayConcatenado;
		
				
	}
	
	public static void imprimeArray(int[]array) {
		for(int num : array) {
			
			System.out.print(num + " ");
		}
	}
	
	
	public static void buscarNumero(int[]array) {
		System.out.println("Introduce el numero que quieres buscar en el array: ");
		boolean encontrado = false;
		int num = entrada.nextInt();
		for(int i =0; i < array.length; i++) {
			if(num == array[i]) {
				encontrado = true;
				i = array.length;
			}
		
		}
		if(encontrado) {
			System.out.println("El valor introducido ha sido encontrado en el array!!!");
		}
		
		else {
			System.out.println("El valor introducido no ha sido encontrado en el array....");
		}
	}
	
	public static void contarElemento(int[] array) {
		System.out.println("Introduce un numero para contar su aparicion en el array: ");
		int contador = 0;
		boolean encontrado = false;
		int num = entrada.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				contador++;
				encontrado = true;
			}

		}

		if (encontrado) {
			System.out.println("El numero introducido, ha sido hallado en el array " + contador + " veces.");

		}

		else {
			System.out.println("El numero introducido no ha sido encontrado");
		}

	}
	
	/*
	
	public static boolean ordenadoASC(int[]array) {
	     for (int i = 1; i < array.length; i++) {
	            if ((array[i] + 1) != array[i+1])
	            return false;        
	        }
	        return true;
	}
	
	
	public static boolean ordenadoDESC(int[]array) {
		boolean ordenado = false;
		return ordenado;
	}
	
	*/
	
	//Funcion para encontrar el numero mayor y lo pone al final, esta funcion compara la posicion del bucle y con la posterior
	
	//Buble short

	public static int[] encontarMayorYponerAlFinal(int[] array) {
		int aux;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1-i; j++) {

				if (array[j] > array[j + 1]) {
					aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;

				}

			}

		}

		return array;

	}

}
