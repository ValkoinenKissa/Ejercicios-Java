package primer_trimestre;
import java.util.*;
public class Recursividad {
		
		private int factorial;
		
		public Recursividad(int factorial) {
			this.factorial = factorial;
		}
		
		
		public Recursividad() {
			factorial = 0;
		}

		
		public int getFactorial() {
			return factorial;
		}


		public void setFactorial(int factorial) {
			this.factorial = factorial;
		}
		
		public int hacerFactorial(int factorial) {
			int resultFactorial;
			if (factorial == 0) {
				return 1;
			}
			
			
			else {
				return resultFactorial = factorial * hacerFactorial(factorial -1);
			}
			
			
		}
		
		public void imprimeResults(int resultFactorial) {
			System.out.println("El factorial del numero introducido es: " + factorial);
		}
		
		static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
			
			System.out.println("Introduce un numero para calcular su factorial");
			Recursividad factNumero = new Recursividad();
			int numeroEnter;
			do {
				
				numeroEnter = entrada.nextInt();
				if(numeroEnter >= 9 || numeroEnter <=1 ) {
					System.out.println("Error");
				}
				
			}while(numeroEnter >= 9 || numeroEnter <=1);
			int resultado_factorial = factNumero.hacerFactorial(numeroEnter);
			System.out.println("El resultado del factorial para el numero introducido es: " + resultado_factorial);
			
			
			

		}

	}
