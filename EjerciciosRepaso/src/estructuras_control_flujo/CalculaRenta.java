package estructuras_control_flujo;
import java.util.*;
public class CalculaRenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int renta = introDatos();
		int tipo = tipoImpositivo(renta);
		imprimeResultado(tipo, renta);
		

	}
	
	///////////////////////////////////////////
	
	public static int introDatos() {
		int num =0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu renta anual para calcular el tipo "
				+ " impositivo que te toca pagar");
		num = entrada.nextInt();
		return num;
		
	}
	
	///////////////////////////////////////////
	
	public static int tipoImpositivo(int num) {
		int tipo_impositivo =0;
		if(num <= 10000) {
			tipo_impositivo = 5;
		}
		
		else if(num > 10000 && num <= 20000) {
			tipo_impositivo = 15;
		}
		
		else if(num > 20000 && num <=35000) {
			tipo_impositivo = 20;
		}
		
		else if(num > 35000 && num <= 60000) {
			tipo_impositivo = 30;
		}
		
		else if(num >= 60000) {
			tipo_impositivo = 45;
		}
		
		return tipo_impositivo;
	}
	
	
	////////////////////////////////////////////
	
	public static void imprimeResultado(int tipo_impositivo, int num) {
		System.out.println("Tu impuesto a pagar sera del: "
				+ "" + tipo_impositivo + "% " + "sobre tu renta de: " + num + "$");
	}

}
