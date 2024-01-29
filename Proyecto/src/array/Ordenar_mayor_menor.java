package array;

public class Ordenar_mayor_menor {

	public static void main(String[] args) {
		//Obtener el numero mayor de un array
		
		int [] array = {1, 3, 7, 4 ,6};
		
		int mayor = array[0];
		
		for (int i=1; i<array.length; i++) {
			
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		
		System.out.println(mayor);


	}

}
