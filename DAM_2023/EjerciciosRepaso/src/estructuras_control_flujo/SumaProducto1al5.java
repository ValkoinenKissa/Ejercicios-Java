package estructuras_control_flujo;

public class SumaProducto1al5 {
	public static void main(String[] args) {
		int acumSuma = 0, acumProducto = 1;
		for (int i =0; i<=5; i++) {
			acumSuma += i;
			
		}
		
		System.out.println("La suma del 1 al 5 es: " + acumSuma);
		
		
		for(int j = 1; j<=5 ; j++){
			acumProducto *= j;
		}
		System.out.println("El producto del 1 al 5 es: " + acumProducto);

	}

}
