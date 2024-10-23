package estructuras_control_flujo;
import java.util.*;

public class IntroBaseYAltura {
	public static void main(String[] args) {
		System.out.println("Este programa proporciona el area y perimetro de"
				+ " un rectangulo ");
		int base = introBase();
		int altura = introAltura();
		
		
		int resultado_area = calculoArea(base, altura);
		int resultado_perimetro = CalculoPerimetro(base, altura);
		
		imprimirResultados(resultado_area, resultado_perimetro);

	}
	
	
	///////////////////////////////////////////////
	
	public static int introBase(){
	System.out.println("Introduce la base del rectangulo: ");
	Scanner entrada = new Scanner(System.in);
	int base = entrada.nextInt();
	return base;
	
	}
	
	//////////////////////////////////////////////////
	
	public static int introAltura() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la altura del rectangulo: ");
		int altura = entrada.nextInt();
		return altura;
	}
	
	//////////////////////////////////////////////////
	
	public static int calculoArea(int base, int altura) {
		int resultado_area =0;
		resultado_area = base * altura;
		return resultado_area;
		
	}
	
	
	///////////////////////////////////////////////////////
	
	public static int CalculoPerimetro(int base, int altura) {
		int resultado_perimetro =0;
		resultado_perimetro = 2*base + 2*altura;
		return resultado_perimetro;
	}
	
	public static void imprimirResultados(int resultado_area, int resultado_perimetro) {
		System.out.println("El area del rectangulo es : " + resultado_area);
		System.out.println("El perimetro del rectangulo es: " + resultado_perimetro);
	}
	
}
