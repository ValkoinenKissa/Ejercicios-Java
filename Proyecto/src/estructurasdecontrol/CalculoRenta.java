package estructurasdecontrol;
import java.util.Scanner;

public class CalculoRenta {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cual es tu renta anual?");
		int renta = entrada.nextInt();
		int tipoImpositivo = 0;
		
		if (renta < 10000) {
			tipoImpositivo = 5;
			
		}else if(renta >= 10000 && renta <= 20000){
			tipoImpositivo = 15;
		
			}else if (renta >= 200000 && renta <= 350000) {
				
				tipoImpositivo = 20;
			}else if (renta >= 350000 && renta <= 600000) {
				tipoImpositivo = 30;
			}else if (renta > 600000) {
				tipoImpositivo = 45;

			
		}
		
		System.out.println("Tu tipo simpositivo es el" + tipoImpositivo + "%");
		
		
	}

}
