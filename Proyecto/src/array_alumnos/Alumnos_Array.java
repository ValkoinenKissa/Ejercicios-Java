package array_alumnos;

public class Alumnos_Array {

	public static void main(String[] args) {
		Alumno alumn1 = new Alumno("pepito", 19, 7);
		Alumno alumn2 = new Alumno("fulanito", 17, 7);
		Alumno alumn3 = new Alumno("cristianito", 29, 7);
		Alumno alumn4 = new Alumno("carlitos", 25, 7);
		Alumno alumn5 = new Alumno("paco", 18, 7);
		
		//Array de alumnos
		
		String[] alumnos = new String[5];
		
		alumnos [0] = alumn1.mostrarInformacion();
		alumnos [1] = alumn2.mostrarInformacion();
		alumnos [2] = alumn3.mostrarInformacion();
		alumnos [3] = alumn4.mostrarInformacion();
		alumnos [4] = alumn5.mostrarInformacion();
		
		
		//Array de numeros enteros
		
		int[] numeros = new int [5];
		int valor = 7;
		for(int i =0; i<numeros.length; i++) {
			
			numeros[i] = valor;
			
			valor *= 2;
		}
		
		
		for(int i =0; i< numeros.length; i++) {
			System.out.println("Posicion: " + i + ": " + numeros[i]);
		}
		
		
		//Array con el orden normal
		System.out.println("Este array tiene un orden normal: ");
		System.out.println();
		for(int i =0; i < alumnos.length; i++) {
			System.out.println(alumnos [i]);
		}
		System.out.println();
		//Llamamos a la función que invierte el array 
		
		invertirArray(alumnos);
		
		
		//Imprimimos el array invertido
		System.out.println("Este es el array en el que se invierte el orden: ");
		System.out.println();
		for(int i =0 ; i<alumnos.length; i++) {
			System.out.println(alumnos [i]);
		}

		System.out.println();

	}
	
	
	public static void invertirArray(String[] alumnos) {
		
		for(int start =0, stop = alumnos.length-1; start < stop; start++, stop-- ) {
			//Se intercambian los elementos en las posiciones start y stop mediante la variable auxiliar aux
			String aux = alumnos[start];
			alumnos[start] = alumnos[stop];
			alumnos[stop] = aux;
			
						
		}
		
		
	}

}
