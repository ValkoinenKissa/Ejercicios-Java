package estructuras_control_flujo;
/*
 * que visualice en
 * pantalla la tabla de multiplicar del 1 al 10
 */
public class TablaMultiplicar {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				
				System.out.println(i + " * " + j  + " = "  + (i*j));
				
			}
			
			System.out.println();

		}
		
	}

}
